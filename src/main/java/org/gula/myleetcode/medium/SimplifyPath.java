package org.gula.myleetcode.medium;

public class SimplifyPath {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder(path.length());
        String paths[] = path.split("/");
        for (int i = 0; i < paths.length; i++) {
            String p = paths[i];
            if (p.equals(".") || p.equals("")) {
                paths[i] = null;
            } else if (p.equals("..")) {
                paths[i] = null;
                for (int j = i - 1; j >= 0; j--) {
                    if (paths[j] != null) {
                        paths[j] = null;
                        break;
                    }
                }
            }
        }
        for (String p : paths) {
            if (p != null) {
                sb.append("/").append(p);
            }
        }
        String result = sb.toString();
        return (result.equals("")) ? "/" : result;
    }
}
