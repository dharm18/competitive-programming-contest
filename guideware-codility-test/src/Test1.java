import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {

    private static Map<String, String> typesOfFiles = new HashMap<>();
    private static Map<String, Integer> fileSizeByType = new LinkedHashMap<>();
    static {
        typesOfFiles.put("mp3", "music");
        typesOfFiles.put("aac", "music");
        typesOfFiles.put("flac", "music");
        typesOfFiles.put("jpg", "images");
        typesOfFiles.put("bmp", "images");
        typesOfFiles.put("gif", "images");
        typesOfFiles.put("mp4", "movies");
        typesOfFiles.put("avi", "movies");
        typesOfFiles.put("mkv", "movies");

        fileSizeByType.put("music", 0);
        fileSizeByType.put("images", 0);
        fileSizeByType.put("movies", 0);
        fileSizeByType.put("other", 0);
    }

    public static String solution(String S) {
        // write your code in Java SE 8
        String temp, fileExt, fileType;
        StringBuilder result = new StringBuilder();
        int fileSize;
        String parts[];

        String[] fileNamesWithSize = S.split("\n");
        for (int i = 0; i < fileNamesWithSize.length; i++) {
          //  System.out.println(fileNamesWithSize[i]);
            temp = fileNamesWithSize[i];
            parts = temp.split(" ");
            fileExt = parts[0].substring(parts[0].lastIndexOf('.')+1);
            fileSize = Integer.parseInt(parts[1].replace("b", ""));
            fileType = typesOfFiles.containsKey(fileExt) ? typesOfFiles.get(fileExt) : "other";

            fileSizeByType.put(fileType, fileSizeByType.get(fileType)+fileSize);

        }

        //System.out.println(fileSizeByType);
        for (Map.Entry<String, Integer> values :fileSizeByType.entrySet()) {
            //System.out.println(values);
            result.append(values.getKey()).append(" ").append(values.getValue()).append("b");
            if (!values.getKey().equals("other"))
                result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        /*System.out.println(solution("my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b"));*/

        System.out.println(solution("my.song~.mp3 1000000b"));
    }
}
