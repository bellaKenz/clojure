(defn kalkulator [angka1 operator angka2]
  (cond
    (= operator '+) (+ angka1 angka2)
    (= operator '-') (- angka1 angka2)
    (= operator '*') (* angka1 angka2)
    (= operator '/')
    (if (zero? angka2)
      (println "Pembagian oleh nol tidak diizinkan.")
      (/ angka1 angka2))
    :else (println "Operator tidak valid.")))

(defn -main []
  (println "Masukkan angka pertama:")
  (def angka1 (read))
  
  (println "Masukkan operator (+, -, *, /):")
  (def operator (read))

  (println "Masukkan angka kedua:")
  (def angka2 (read))

  (println "Hasil: " (kalkulator angka1 operator angka2)))

(-main)
