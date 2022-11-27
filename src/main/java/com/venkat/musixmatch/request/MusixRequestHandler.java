package com.venkat.musixmatch.request;


import com.venkat.musixmatch.constants.FilteringConstants;
import com.venkat.musixmatch.constants.MethodConstants;
import com.venkat.musixmatch.exceptions.MusixException;
import lombok.SneakyThrows;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;

/**
 * Sends a Request to the MusixMatch API.
 *
 * @author Venkat.
 * @since 1.0
 */
public class
MusixRequestHandler {


    /**
     * Sends the HTTP Request to the MusixMatch API.
     * <pre>
     *     Alternatives of using the Request Method.
     * {@code
     *  String response = MusixRequestHandler.sendHttpRequest(MethodConstants.TRACK_SEARCH.get(), map);
     *  String response = MusixRequest.sendHttpRequest(MethodConstants.TRACK_GET.get(), map);
     *  String response = MusixRequest.sendHttpRequest(MethodConstants.TRACK_LYRICS_GET.get(), map);
     * }
     * </pre>
     *
     * @param method     Method Name.
     * @param parameters Query Parameters in the form of a Map<String, Object>
     * @return Response String received from the Request.
     */
    @SneakyThrows
    public static String sendHttpRequest(MethodConstants method, Map<String, Object> parameters) throws MusixException {
        String param = FilteringConstants.API_URL.get()
                + FilteringConstants.API_VERSION.get()
                + FilteringConstants.API_DELIM.get()
                + processParameters(method.get(), parameters);
        StringBuffer buffer = new StringBuffer();

        try {
            URL url = new URL(param);
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            while (sc.hasNext()) {
                buffer.append(sc.next());
            }

        } catch (IOException exception) {
            throw new MusixException("Problem parsing the response");
        }

        return buffer.toString();
    }

    @SneakyThrows
    private static String processParameters(String method, Map<String, Object> parameters) {
        StringBuilder param = new StringBuilder(method + "?");

        for (Map.Entry<String, Object> map : parameters.entrySet()) {
            param.append(map.getKey()).append("=").append(URLEncoder.encode(map.getValue().toString(), StandardCharsets.UTF_8));

            param.append("&");
        }
        return param.substring(0, param.length() - 1);
    }

}
