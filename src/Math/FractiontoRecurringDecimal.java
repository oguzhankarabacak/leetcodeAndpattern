package Math;

import java.util.HashMap;
import java.util.Map;

public class FractiontoRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        // Edge Case: Eğer bölme sonucu sıfır ise
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        // 1️⃣ İşaret belirleme
        if ((numerator < 0) ^ (denominator < 0)) result.append("-");

        // 2️⃣ Long türüne çevirerek mutlak değer al (overflow önlemek için)
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // 3️⃣ Tam sayı kısmını ekle
        result.append(num / den);
        long remainder = num % den; // Kalanı hesapla

        // Eğer kalan sıfırsa, direkt sonucu döndür
        if (remainder == 0) return result.toString();

        // 4️⃣ Ondalıklı kısım
        result.append(".");
        Map<Long, Integer> remainderMap = new HashMap<>(); // Kalanları ve indeksleri sakla

        while (remainder != 0) {
            // Eğer daha önce gördüğümüz bir kalan varsa, tekrar başladı demektir
            if (remainderMap.containsKey(remainder)) {
                int startIndex = remainderMap.get(remainder); // İlk görüldüğü yer
                result.insert(startIndex, "("); // Parantez aç
                result.append(")"); // Parantez kapa
                break;
            }

            // Kalanın görüldüğü indeksi kaydet
            remainderMap.put(remainder, result.length());

            // Kalanı büyüt ve bölme işlemi yap
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }

        return result.toString();
    }
}
