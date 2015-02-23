(ns ctp-data)

;;;; Data for Canadian Traveller Problem

;;; 10 nodes

(def ctp-data
  {:10a
   {:tri
    [[[36.0 90.0] [58.0 55.0] [62.0 91.0]]
     [[58.0 55.0] [85.0 11.0] [95.0 63.0]]
     [[1.0 15.0] [36.0 90.0] [58.0 55.0]]
     [[1.0 15.0] [21.0 5.0] [58.0 55.0]]
     [[21.0 5.0] [58.0 55.0] [85.0 11.0]]
     [[58.0 55.0] [62.0 91.0] [74.0 81.0]]
     [[58.0 55.0] [74.0 81.0] [95.0 63.0]]
     [[62.0 91.0] [74.0 81.0] [78.0 85.0]]
     [[74.0 81.0] [78.0 85.0] [95.0 63.0]]
     [[78.0 85.0] [92.0 87.0] [95.0 63.0]]]
    :graph
    [[[1 0.26] [3 0.83] [6 0.41]]
     [[0 0.26] [5 0.17] [6 0.36] [9 0.16]]
     [[6 0.52] [7 0.53] [8 0.64]]
     [[0 0.83] [6 0.7] [8 0.22]]
     [[5 0.14] [7 0.24]]
     [[1 0.17] [4 0.14] [7 0.28] [9 0.06]]
     [[0 0.41] [1 0.36] [2 0.52] [3 0.7] [7 0.38] [8 0.62] [9 0.31]]
     [[2 0.53] [4 0.24] [5 0.28] [6 0.38] [9 0.28]]
     [[2 0.64] [3 0.22] [6 0.62]]
     [[1 0.16] [5 0.06] [6 0.31] [7 0.28]]]
    :s 4 :t 8}

   :20a
   {:tri
    [[[34.0 57.0] [47.0 34.0] [54.0 69.0]]
     [[47.0 34.0] [54.0 69.0] [83.0 62.0]]
     [[83.0 62.0] [95.0 84.0] [99.0 19.0]]
     [[13.0 77.0] [34.0 57.0] [45.0 70.0]]
     [[34.0 57.0] [45.0 70.0] [54.0 69.0]]
     [[54.0 69.0] [83.0 62.0] [83.0 67.0]]
     [[83.0 62.0] [83.0 67.0] [95.0 84.0]]
     [[18.0 31.0] [34.0 57.0] [47.0 34.0]]
     [[4.0 25.0] [15.0 33.0] [18.0 31.0]]
     [[67.0 80.0] [83.0 67.0] [95.0 84.0]]
     [[54.0 69.0] [67.0 80.0] [83.0 67.0]]
     [[45.0 70.0] [54.0 69.0] [67.0 80.0]]
     [[46.0 28.0] [52.0 26.0] [61.0 6.0]]
     [[18.0 31.0] [46.0 28.0] [47.0 34.0]]
     [[46.0 28.0] [47.0 34.0] [52.0 26.0]]
     [[13.0 77.0] [20.0 91.0] [45.0 70.0]]
     [[20.0 91.0] [45.0 70.0] [67.0 80.0]]
     [[4.0 25.0] [10.0 57.0] [15.0 33.0]]
     [[47.0 34.0] [52.0 26.0] [82.0 27.0]]
     [[47.0 34.0] [82.0 27.0] [83.0 62.0]]
     [[52.0 26.0] [61.0 6.0] [82.0 27.0]]
     [[82.0 27.0] [83.0 62.0] [99.0 19.0]]
     [[15.0 33.0] [18.0 31.0] [20.0 53.0]]
     [[18.0 31.0] [20.0 53.0] [34.0 57.0]]
     [[10.0 57.0] [13.0 77.0] [20.0 53.0]]
     [[13.0 77.0] [20.0 53.0] [34.0 57.0]]
     [[10.0 57.0] [15.0 33.0] [20.0 53.0]]]
    :graph
    [[[5 0.16] [14 0.33] [18 0.48]]
     [[12 0.21] [15 0.65] [16 0.25] [18 0.28]]
     [[4 0.15] [7 0.31] [8 0.29] [10 0.22] [13 0.28] [19 0.04]]
     [[8 0.36] [11 0.3] [15 0.19] [16 0.35] [17 0.3]]
     [[2 0.15] [9 0.33] [19 0.14]]
     [[0 0.16] [7 0.29] [9 0.2] [10 0.25] [14 0.33]]
     [[7 0.23] [8 0.36] [12 0.29] [14 0.09] [16 0.3] [18 0.17]]
     [[2 0.31] [5 0.29] [6 0.23] [8 0.26] [10 0.15] [14 0.17]]
     [[2 0.29] [3 0.36] [6 0.36] [7 0.26] [11 0.09] [13 0.06] [16 0.46]]
     [[4 0.33] [5 0.2] [10 0.11] [19 0.25]]
     [[2 0.22] [5 0.25] [7 0.15] [9 0.11] [19 0.21]]
     [[3 0.3] [8 0.09] [13 0.06] [17 0.22]]
     [[1 0.21] [6 0.29] [16 0.05] [18 0.21]]
     [[2 0.28] [8 0.06] [11 0.06] [17 0.27]]
     [[0 0.33] [5 0.33] [6 0.09] [7 0.17] [18 0.24]]
     [[1 0.65] [3 0.19] [16 0.46]]
     [[1 0.25] [3 0.35] [6 0.3] [8 0.46] [12 0.05] [15 0.46]]
     [[3 0.3] [11 0.22] [13 0.27]]
     [[0 0.48] [1 0.28] [6 0.17] [12 0.21] [14 0.24]]
     [[2 0.04] [4 0.14] [9 0.25] [10 0.21]]]
    :s 0 :t 17}

   :50a
   {:tri
    [[[81.0 27.0] [84.0 33.0] [97.0 24.0]]
     [[81.0 27.0] [83.0 12.0] [97.0 24.0]]
     [[57.0 41.0] [65.0 48.0] [71.0 37.0]]
     [[71.0 37.0] [81.0 27.0] [84.0 33.0]]
     [[1.0 59.0] [8.0 60.0] [19.0 45.0]]
     [[53.0 76.0] [67.0 86.0] [70.0 66.0]]
     [[43.0 64.0] [46.0 72.0] [53.0 76.0]]
     [[83.0 12.0] [85.0 11.0] [97.0 24.0]]
     [[61.0 2.0] [83.0 12.0] [85.0 11.0]]
     [[1.0 59.0] [6.0 62.0] [8.0 60.0]]
     [[1.0 59.0] [11.0 24.0] [19.0 45.0]]
     [[11.0 24.0] [35.0 32.0] [40.0 10.0]]
     [[11.0 24.0] [27.0 36.0] [35.0 32.0]]
     [[63.0 28.0] [81.0 27.0] [83.0 12.0]]
     [[54.0 9.0] [61.0 2.0] [63.0 28.0]]
     [[57.0 41.0] [63.0 28.0] [71.0 37.0]]
     [[61.0 2.0] [63.0 28.0] [83.0 12.0]]
     [[63.0 28.0] [71.0 37.0] [81.0 27.0]]
     [[53.0 51.0] [57.0 41.0] [65.0 48.0]]
     [[43.0 64.0] [53.0 51.0] [53.0 76.0]]
     [[53.0 51.0] [65.0 48.0] [70.0 66.0]]
     [[43.0 64.0] [44.0 54.0] [53.0 51.0]]
     [[53.0 51.0] [53.0 76.0] [70.0 66.0]]
     [[11.0 24.0] [19.0 45.0] [20.0 38.0]]
     [[11.0 24.0] [20.0 38.0] [27.0 36.0]]
     [[19.0 45.0] [20.0 38.0] [27.0 36.0]]
     [[67.0 86.0] [70.0 66.0] [79.0 87.0]]
     [[70.0 66.0] [79.0 87.0] [94.0 79.0]]
     [[67.0 86.0] [69.0 94.0] [79.0 87.0]]
     [[69.0 94.0] [79.0 87.0] [93.0 95.0]]
     [[79.0 87.0] [93.0 95.0] [94.0 79.0]]
     [[35.0 32.0] [40.0 10.0] [48.0 19.0]]
     [[35.0 32.0] [48.0 19.0] [49.0 29.0]]
     [[40.0 10.0] [48.0 19.0] [54.0 9.0]]
     [[84.0 33.0] [88.0 36.0] [97.0 24.0]]
     [[88.0 36.0] [97.0 24.0] [99.0 48.0]]
     [[19.0 45.0] [27.0 36.0] [31.0 37.0]]
     [[27.0 36.0] [31.0 37.0] [35.0 32.0]]
     [[31.0 37.0] [35.0 32.0] [44.0 54.0]]
     [[44.0 54.0] [53.0 51.0] [55.0 39.0]]
     [[53.0 51.0] [55.0 39.0] [57.0 41.0]]
     [[35.0 32.0] [44.0 54.0] [55.0 39.0]]
     [[35.0 32.0] [49.0 29.0] [55.0 39.0]]
     [[78.0 43.0] [84.0 33.0] [88.0 36.0]]
     [[71.0 37.0] [78.0 43.0] [84.0 33.0]]
     [[25.0 97.0] [60.0 88.0] [69.0 94.0]]
     [[53.0 76.0] [60.0 88.0] [67.0 86.0]]
     [[60.0 88.0] [67.0 86.0] [69.0 94.0]]
     [[40.0 10.0] [50.0 2.0] [54.0 9.0]]
     [[50.0 2.0] [54.0 9.0] [61.0 2.0]]
     [[54.0 9.0] [60.0 28.0] [63.0 28.0]]
     [[57.0 41.0] [60.0 28.0] [63.0 28.0]]
     [[48.0 19.0] [54.0 9.0] [60.0 28.0]]
     [[55.0 39.0] [57.0 41.0] [60.0 28.0]]
     [[49.0 29.0] [55.0 39.0] [60.0 28.0]]
     [[48.0 19.0] [49.0 29.0] [60.0 28.0]]
     [[70.0 66.0] [92.0 57.0] [94.0 79.0]]
     [[78.0 43.0] [88.0 36.0] [92.0 57.0]]
     [[88.0 36.0] [92.0 57.0] [99.0 48.0]]
     [[92.0 57.0] [94.0 79.0] [98.0 66.0]]
     [[92.0 57.0] [98.0 66.0] [99.0 48.0]]
     [[6.0 62.0] [8.0 60.0] [18.0 70.0]]
     [[6.0 62.0] [11.0 91.0] [18.0 70.0]]
     [[8.0 60.0] [18.0 70.0] [19.0 45.0]]
     [[11.0 91.0] [18.0 70.0] [25.0 97.0]]
     [[18.0 70.0] [38.0 78.0] [43.0 64.0]]
     [[25.0 97.0] [38.0 78.0] [60.0 88.0]]
     [[38.0 78.0] [43.0 64.0] [46.0 72.0]]
     [[18.0 70.0] [25.0 97.0] [38.0 78.0]]
     [[42.0 56.0] [43.0 64.0] [44.0 54.0]]
     [[19.0 45.0] [31.0 37.0] [42.0 56.0]]
     [[31.0 37.0] [42.0 56.0] [44.0 54.0]]
     [[18.0 70.0] [19.0 45.0] [42.0 56.0]]
     [[18.0 70.0] [42.0 56.0] [43.0 64.0]]
     [[65.0 48.0] [71.0 37.0] [74.0 45.0]]
     [[71.0 37.0] [74.0 45.0] [78.0 43.0]]
     [[65.0 48.0] [70.0 66.0] [74.0 45.0]]
     [[70.0 66.0] [74.0 45.0] [92.0 57.0]]
     [[74.0 45.0] [78.0 43.0] [92.0 57.0]]
     [[38.0 78.0] [51.0 78.0] [60.0 88.0]]
     [[51.0 78.0] [53.0 76.0] [60.0 88.0]]
     [[38.0 78.0] [46.0 72.0] [51.0 78.0]]
     [[46.0 72.0] [51.0 78.0] [53.0 76.0]]]
    :graph
    [[[6 0.04] [9 0.12] [20 0.07] [25 0.09] [38 0.2]]
     [[32 0.16] [33 0.16] [37 0.24]]
     [[9 0.25] [15 0.22] [23 0.14] [31 0.26] [39 0.28] [41 0.28] [45 0.14] [48 0.22]]
     [[5 0.14] [14 0.21] [17 0.12] [36 0.2] [40 0.08] [49 0.1]]
     [[8 0.09] [12 0.21] [21 0.04] [44 0.09] [46 0.22]]
     [[3 0.14] [17 0.12] [25 0.23] [38 0.32] [40 0.13]]
     [[0 0.04] [9 0.14] [19 0.21] [25 0.06] [39 0.22]]
     [[9 0.23] [23 0.07] [38 0.36] [45 0.06]]
     [[4 0.09] [12 0.19] [35 0.11] [42 0.12] [44 0.13]]
     [[0 0.12] [2 0.25] [6 0.14] [7 0.23] [20 0.07] [23 0.19] [38 0.22] [39 0.25]]
     [[27 0.18] [29 0.02] [49 0.26]]
     [[12 0.2] [24 0.17] [26 0.07] [33 0.12] [37 0.08]]
     [[4 0.21] [8 0.19] [11 0.2] [24 0.2] [32 0.27] [33 0.23] [42 0.23] [46 0.24]]
     [[18 0.05] [21 0.12] [27 0.16] [28 0.07] [44 0.14]]
     [[3 0.21] [28 0.18] [29 0.26] [35 0.14] [36 0.03] [44 0.12] [49 0.26]]
     [[2 0.22] [16 0.1] [26 0.24] [31 0.15] [41 0.23] [43 0.13]]
     [[15 0.1] [24 0.08] [31 0.09] [43 0.08]]
     [[3 0.12] [5 0.12] [22 0.1] [25 0.18] [36 0.15]]
     [[13 0.05] [21 0.12] [27 0.15] [46 0.21] [47 0.16]]
     [[6 0.21] [25 0.24] [30 0.19] [31 0.1] [39 0.03] [42 0.09]]
     [[0 0.07] [9 0.07] [38 0.17]]
     [[4 0.04] [13 0.12] [18 0.12] [44 0.09] [46 0.2]]
     [[17 0.1] [25 0.14] [30 0.12] [36 0.11]]
     [[2 0.14] [7 0.07] [9 0.19] [45 0.03]]
     [[11 0.17] [12 0.2] [16 0.08] [26 0.14] [31 0.16] [42 0.25] [43 0.03]]
     [[0 0.09] [5 0.23] [6 0.06] [17 0.18] [19 0.24] [22 0.14] [30 0.21] [38 0.25]]
     [[11 0.07] [15 0.24] [24 0.14] [37 0.11] [41 0.36] [43 0.13]]
     [[10 0.18] [13 0.16] [18 0.15] [28 0.16] [29 0.18] [47 0.24]]
     [[13 0.07] [14 0.18] [27 0.16] [29 0.15] [44 0.14]]
     [[10 0.02] [14 0.26] [27 0.18] [28 0.15] [49 0.24]]
     [[19 0.19] [22 0.12] [25 0.21] [35 0.03] [36 0.12] [42 0.12]]
     [[2 0.26] [15 0.15] [16 0.09] [19 0.1] [24 0.16] [39 0.08] [42 0.16]]
     [[1 0.16] [12 0.27] [33 0.17] [34 0.14] [46 0.22]]
     [[1 0.16] [11 0.12] [12 0.23] [32 0.17] [37 0.12]]
     [[32 0.14] [46 0.11] [47 0.18]]
     [[8 0.11] [14 0.14] [30 0.03] [36 0.13] [42 0.11] [44 0.15]]
     [[3 0.2] [14 0.03] [17 0.15] [22 0.11] [30 0.12] [35 0.13]]
     [[1 0.24] [11 0.08] [26 0.11] [33 0.12] [41 0.44]]
     [[0 0.2] [5 0.32] [7 0.36] [9 0.22] [20 0.17] [25 0.25]]
     [[2 0.28] [6 0.22] [9 0.25] [19 0.03] [31 0.08]]
     [[3 0.08] [5 0.13] [49 0.11]]
     [[2 0.28] [15 0.23] [26 0.36] [37 0.44] [48 0.15]]
     [[8 0.12] [12 0.23] [19 0.09] [24 0.25] [30 0.12] [31 0.16] [35 0.11]]
     [[15 0.13] [16 0.08] [24 0.03] [26 0.13]]
     [[4 0.09] [8 0.13] [13 0.14] [14 0.12] [21 0.09] [28 0.14] [35 0.15]]
     [[2 0.14] [7 0.06] [23 0.03] [48 0.29]]
     [[4 0.22] [12 0.24] [18 0.21] [21 0.2] [32 0.22] [34 0.11] [47 0.11]]
     [[18 0.16] [27 0.24] [34 0.18] [46 0.11]]
     [[2 0.22] [41 0.15] [45 0.29]]
     [[3 0.1] [10 0.26] [14 0.26] [29 0.24] [40 0.11]]]
    :s 1 :t 25}

   :50b 
   {:tri
    [[[81.0 82.0] [88.0 99.0] [89.0 97.0]]
     [[50.0 7.0] [61.0 18.0] [69.0 6.0]]
     [[65.0 55.0] [75.0 49.0] [80.0 54.0]]
     [[61.0 18.0] [69.0 6.0] [79.0 10.0]]
     [[80.0 54.0] [89.0 53.0] [91.0 56.0]]
     [[89.0 53.0] [91.0 56.0] [94.0 12.0]]
     [[7.0 3.0] [8.0 0.0] [16.0 5.0]]
     [[65.0 55.0] [73.0 45.0] [75.0 49.0]]
     [[29.0 59.0] [45.0 35.0] [48.0 63.0]]
     [[65.0 55.0] [75.0 67.0] [80.0 54.0]]
     [[75.0 67.0] [80.0 54.0] [91.0 56.0]]
     [[26.0 74.0] [26.0 98.0] [35.0 83.0]]
     [[52.0 83.0] [53.0 96.0] [55.0 94.0]]
     [[35.0 83.0] [52.0 83.0] [53.0 96.0]]
     [[8.0 0.0] [16.0 5.0] [33.0 5.0]]
     [[52.0 83.0] [61.0 88.0] [75.0 67.0]]
     [[52.0 83.0] [55.0 94.0] [61.0 88.0]]
     [[69.0 6.0] [73.0 5.0] [79.0 10.0]]
     [[33.0 5.0] [50.0 7.0] [73.0 5.0]]
     [[50.0 7.0] [69.0 6.0] [73.0 5.0]]
     [[53.0 96.0] [55.0 94.0] [66.0 90.0]]
     [[66.0 90.0] [81.0 82.0] [88.0 99.0]]
     [[53.0 96.0] [66.0 90.0] [88.0 99.0]]
     [[55.0 94.0] [61.0 88.0] [66.0 90.0]]
     [[45.0 35.0] [48.0 63.0] [56.0 39.0]]
     [[48.0 63.0] [56.0 39.0] [65.0 55.0]]
     [[56.0 39.0] [65.0 55.0] [73.0 45.0]]
     [[25.0 67.0] [26.0 74.0] [41.0 65.0]]
     [[25.0 67.0] [29.0 59.0] [41.0 65.0]]
     [[29.0 59.0] [41.0 65.0] [48.0 63.0]]
     [[26.0 74.0] [35.0 83.0] [41.0 65.0]]
     [[48.0 63.0] [48.0 69.0] [65.0 55.0]]
     [[48.0 69.0] [52.0 83.0] [75.0 67.0]]
     [[41.0 65.0] [48.0 63.0] [48.0 69.0]]
     [[35.0 83.0] [48.0 69.0] [52.0 83.0]]
     [[35.0 83.0] [41.0 65.0] [48.0 69.0]]
     [[48.0 69.0] [65.0 55.0] [75.0 67.0]]
     [[79.0 10.0] [80.0 39.0] [94.0 12.0]]
     [[80.0 39.0] [89.0 53.0] [94.0 12.0]]
     [[8.0 42.0] [29.0 59.0] [36.0 35.0]]
     [[29.0 59.0] [36.0 35.0] [45.0 35.0]]
     [[75.0 49.0] [80.0 54.0] [83.0 48.0]]
     [[80.0 39.0] [83.0 48.0] [89.0 53.0]]
     [[80.0 54.0] [83.0 48.0] [89.0 53.0]]
     [[73.0 45.0] [75.0 49.0] [83.0 48.0]]
     [[73.0 45.0] [80.0 39.0] [83.0 48.0]]
     [[45.0 23.0] [45.0 35.0] [56.0 39.0]]
     [[36.0 35.0] [37.0 21.0] [45.0 23.0]]
     [[36.0 35.0] [45.0 23.0] [45.0 35.0]]
     [[45.0 23.0] [50.0 7.0] [61.0 18.0]]
     [[45.0 23.0] [56.0 39.0] [64.0 34.0]]
     [[61.0 18.0] [64.0 34.0] [79.0 10.0]]
     [[64.0 34.0] [79.0 10.0] [80.0 39.0]]
     [[56.0 39.0] [64.0 34.0] [73.0 45.0]]
     [[45.0 23.0] [61.0 18.0] [64.0 34.0]]
     [[64.0 34.0] [73.0 45.0] [80.0 39.0]]
     [[4.0 1.0] [7.0 3.0] [8.0 0.0]]
     [[75.0 67.0] [79.0 78.0] [91.0 56.0]]
     [[79.0 78.0] [81.0 82.0] [91.0 56.0]]
     [[66.0 90.0] [79.0 78.0] [81.0 82.0]]
     [[61.0 88.0] [66.0 90.0] [79.0 78.0]]
     [[61.0 88.0] [75.0 67.0] [79.0 78.0]]
     [[33.0 5.0] [37.0 21.0] [40.0 7.0]]
     [[33.0 5.0] [40.0 7.0] [50.0 7.0]]
     [[37.0 21.0] [40.0 7.0] [46.0 8.0]]
     [[37.0 21.0] [45.0 23.0] [46.0 8.0]]
     [[40.0 7.0] [46.0 8.0] [50.0 7.0]]
     [[45.0 23.0] [46.0 8.0] [50.0 7.0]]
     [[26.0 98.0] [31.0 99.0] [35.0 83.0]]
     [[26.0 98.0] [29.0 99.0] [31.0 99.0]]
     [[31.0 99.0] [35.0 83.0] [53.0 96.0]]
     [[31.0 99.0] [53.0 96.0] [88.0 99.0]]
     [[7.0 3.0] [8.0 42.0] [20.0 26.0]]
     [[8.0 42.0] [20.0 26.0] [36.0 35.0]]
     [[20.0 26.0] [33.0 5.0] [37.0 21.0]]
     [[20.0 26.0] [36.0 35.0] [37.0 21.0]]
     [[7.0 3.0] [16.0 5.0] [20.0 26.0]]
     [[16.0 5.0] [20.0 26.0] [33.0 5.0]]
     [[0.0 55.0] [25.0 67.0] [26.0 74.0]]
     [[0.0 55.0] [25.0 67.0] [29.0 59.0]]
     [[0.0 55.0] [8.0 42.0] [29.0 59.0]]]
    :graph
    [[[23 0.24] [34 0.03] [45 0.17] [46 0.05]]
     [[7 0.09] [12 0.14] [24 0.1] [35 0.13] [40 0.18] [43 0.04]]
     [[9 0.4] [32 0.23] [42 0.08] [47 0.04]]
     [[8 0.12] [19 0.03] [25 0.11] [44 0.08]]
     [[18 0.25] [22 0.27] [29 0.09] [31 0.19] [37 0.29] [41 0.13] [48 0.29]]
     [[9 0.16] [15 0.18] [18 0.14] [28 0.08] [33 0.14] [36 0.16]]
     [[16 0.11] [24 0.07] [26 0.14] [35 0.15] [38 0.09] [43 0.07]]
     [[1 0.09] [12 0.17] [21 0.3] [24 0.09] [38 0.17] [42 0.29]]
     [[3 0.12] [11 0.24] [14 0.18] [19 0.14] [30 0.17] [44 0.05]]
     [[2 0.4] [5 0.16] [15 0.25] [17 0.17] [27 0.25] [32 0.17] [33 0.07]]
     [[27 0.04] [39 0.04]]
     [[8 0.24] [13 0.02] [19 0.35] [30 0.18] [46 0.57]]
     [[1 0.14] [7 0.17] [28 0.22] [40 0.09] [42 0.28] [49 0.16]]
     [[11 0.02] [30 0.17]]
     [[8 0.18] [16 0.25] [26 0.12] [30 0.04] [44 0.21]]
     [[5 0.18] [9 0.25] [17 0.21] [18 0.18] [22 0.2] [39 0.26]]
     [[6 0.11] [14 0.25] [21 0.44] [26 0.19] [30 0.28] [38 0.04]]
     [[9 0.17] [15 0.21] [27 0.09] [39 0.09]]
     [[4 0.25] [5 0.14] [15 0.18] [22 0.29] [28 0.15] [48 0.09]]
     [[3 0.03] [8 0.14] [11 0.35] [25 0.13] [45 0.22] [46 0.22]]
     [[25 0.15] [26 0.27] [31 0.06] [35 0.22] [41 0.08] [45 0.19]]
     [[7 0.3] [16 0.44] [38 0.41] [42 0.15]]
     [[4 0.27] [15 0.2] [18 0.29] [37 0.15] [39 0.39]]
     [[0 0.24] [29 0.07] [37 0.32] [41 0.17] [45 0.13]]
     [[1 0.1] [6 0.07] [7 0.09] [38 0.08] [43 0.08]]
     [[3 0.11] [19 0.13] [20 0.15] [26 0.28] [44 0.1] [45 0.17]]
     [[6 0.14] [14 0.12] [16 0.19] [20 0.27] [25 0.28] [35 0.16] [44 0.25]]
     [[9 0.25] [10 0.04] [17 0.09] [39 0.03]]
     [[5 0.08] [12 0.22] [18 0.15] [32 0.17] [36 0.15] [40 0.19] [48 0.12] [49 0.17]]
     [[4 0.09] [23 0.07] [37 0.28] [41 0.16]]
     [[8 0.17] [11 0.18] [13 0.17] [14 0.04] [16 0.28]]
     [[4 0.19] [20 0.06] [35 0.19] [40 0.25] [41 0.07] [48 0.28]]
     [[2 0.23] [9 0.17] [28 0.17] [33 0.1] [36 0.04] [47 0.19] [49 0.16]]
     [[5 0.14] [9 0.07] [32 0.1] [36 0.06]]
     [[0 0.03] [46 0.02]]
     [[1 0.13] [6 0.15] [20 0.22] [26 0.16] [31 0.19] [40 0.18] [43 0.12]]
     [[5 0.16] [28 0.15] [32 0.04] [33 0.06]]
     [[4 0.29] [22 0.15] [23 0.32] [29 0.28]]
     [[6 0.09] [7 0.17] [16 0.04] [21 0.41] [24 0.08]]
     [[10 0.04] [15 0.26] [17 0.09] [22 0.39] [27 0.03]]
     [[1 0.18] [12 0.09] [28 0.19] [31 0.25] [35 0.18] [48 0.12]]
     [[4 0.13] [20 0.08] [23 0.17] [29 0.16] [31 0.07] [45 0.19]]
     [[2 0.08] [7 0.29] [12 0.28] [21 0.15] [47 0.11] [49 0.2]]
     [[1 0.04] [6 0.07] [24 0.08] [35 0.12]]
     [[3 0.08] [8 0.05] [14 0.21] [25 0.1] [26 0.25]]
     [[0 0.17] [19 0.22] [20 0.19] [23 0.13] [25 0.17] [41 0.19] [46 0.16]]
     [[0 0.05] [11 0.57] [19 0.22] [34 0.02] [45 0.16]]
     [[2 0.04] [32 0.19] [42 0.11] [49 0.14]]
     [[4 0.29] [18 0.09] [28 0.12] [31 0.28] [40 0.12]]
     [[12 0.16] [28 0.17] [32 0.16] [42 0.2] [47 0.14]]]
    :s 0
    :t 32}
   :100a
   {:tri
    [[[82.0 63.0] [84.0 60.0] [88.0 61.0]]
     [[90.0 67.0] [92.0 64.0] [96.0 67.0]]
     [[88.0 61.0] [90.0 67.0] [92.0 64.0]]
     [[75.0 59.0] [82.0 52.0] [84.0 60.0]]
     [[40.0 38.0] [48.0 53.0] [56.0 45.0]]
     [[75.0 59.0] [78.0 62.0] [84.0 60.0]]
     [[78.0 62.0] [82.0 63.0] [84.0 60.0]]
     [[45.0 90.0] [48.0 94.0] [56.0 86.0]]
     [[1.0 0.0] [13.0 7.0] [22.0 0.0]]
     [[40.0 73.0] [42.0 57.0] [44.0 71.0]]
     [[40.0 38.0] [42.0 57.0] [48.0 53.0]]
     [[26.0 61.0] [40.0 73.0] [42.0 57.0]]
     [[1.0 0.0] [1.0 9.0] [13.0 7.0]]
     [[9.0 19.0] [10.0 32.0] [21.0 18.0]]
     [[82.0 52.0] [84.0 60.0] [87.0 59.0]]
     [[84.0 60.0] [87.0 59.0] [88.0 61.0]]
     [[56.0 45.0] [57.0 20.0] [74.0 33.0]]
     [[10.0 32.0] [21.0 18.0] [23.0 20.0]]
     [[10.0 32.0] [23.0 20.0] [24.0 40.0]]
     [[92.0 64.0] [96.0 55.0] [96.0 67.0]]
     [[83.0 9.0] [85.0 11.0] [86.0 9.0]]
     [[74.0 49.0] [75.0 59.0] [82.0 52.0]]
     [[26.0 61.0] [29.0 73.0] [40.0 73.0]]
     [[19.0 62.0] [20.0 80.0] [29.0 73.0]]
     [[19.0 62.0] [26.0 61.0] [29.0 73.0]]
     [[5.0 16.0] [9.0 19.0] [10.0 32.0]]
     [[1.0 9.0] [5.0 16.0] [13.0 7.0]]
     [[5.0 16.0] [9.0 19.0] [13.0 7.0]]
     [[72.0 73.0] [72.0 89.0] [82.0 86.0]]
     [[69.0 51.0] [74.0 49.0] [75.0 59.0]]
     [[33.0 98.0] [48.0 94.0] [69.0 95.0]]
     [[13.0 7.0] [20.0 6.0] [22.0 0.0]]
     [[57.0 20.0] [59.0 17.0] [74.0 33.0]]
     [[56.0 10.0] [57.0 20.0] [59.0 17.0]]
     [[39.0 13.0] [56.0 10.0] [57.0 20.0]]
     [[37.0 9.0] [39.0 13.0] [56.0 10.0]]
     [[82.0 52.0] [87.0 59.0] [90.0 56.0]]
     [[90.0 51.0] [90.0 56.0] [96.0 55.0]]
     [[82.0 52.0] [90.0 51.0] [90.0 56.0]]
     [[12.0 83.0] [20.0 80.0] [24.0 98.0]]
     [[6.0 98.0] [12.0 83.0] [24.0 98.0]]
     [[20.0 6.0] [22.0 0.0] [22.0 7.0]]
     [[22.0 0.0] [22.0 7.0] [31.0 6.0]]
     [[85.0 28.0] [87.0 25.0] [98.0 32.0]]
     [[88.0 61.0] [91.0 59.0] [92.0 64.0]]
     [[87.0 59.0] [88.0 61.0] [91.0 59.0]]
     [[87.0 59.0] [90.0 56.0] [91.0 59.0]]
     [[90.0 56.0] [91.0 59.0] [96.0 55.0]]
     [[91.0 59.0] [92.0 64.0] [96.0 55.0]]
     [[20.0 80.0] [24.0 98.0] [39.0 88.0]]
     [[20.0 80.0] [29.0 73.0] [39.0 88.0]]
     [[29.0 73.0] [39.0 88.0] [40.0 73.0]]
     [[24.0 98.0] [33.0 98.0] [39.0 88.0]]
     [[39.0 88.0] [40.0 73.0] [45.0 90.0]]
     [[42.0 57.0] [48.0 53.0] [49.0 55.0]]
     [[49.0 55.0] [56.0 45.0] [69.0 51.0]]
     [[48.0 53.0] [49.0 55.0] [56.0 45.0]]
     [[5.0 89.0] [6.0 98.0] [12.0 83.0]]
     [[1.0 65.0] [10.0 32.0] [19.0 62.0]]
     [[39.0 13.0] [43.0 31.0] [57.0 20.0]]
     [[40.0 38.0] [43.0 31.0] [56.0 45.0]]
     [[43.0 31.0] [56.0 45.0] [57.0 20.0]]
     [[10.0 32.0] [19.0 62.0] [24.0 42.0]]
     [[24.0 40.0] [24.0 42.0] [40.0 38.0]]
     [[24.0 42.0] [26.0 61.0] [42.0 57.0]]
     [[24.0 42.0] [40.0 38.0] [42.0 57.0]]
     [[10.0 32.0] [24.0 40.0] [24.0 42.0]]
     [[19.0 62.0] [24.0 42.0] [26.0 61.0]]
     [[78.0 20.0] [85.0 28.0] [87.0 25.0]]
     [[59.0 17.0] [74.0 33.0] [78.0 20.0]]
     [[74.0 33.0] [78.0 20.0] [85.0 28.0]]
     [[3.0 77.0] [5.0 89.0] [12.0 83.0]]
     [[56.0 45.0] [67.0 46.0] [74.0 33.0]]
     [[67.0 46.0] [73.0 44.0] [74.0 33.0]]
     [[56.0 45.0] [67.0 46.0] [69.0 51.0]]
     [[67.0 46.0] [69.0 51.0] [74.0 49.0]]
     [[67.0 46.0] [73.0 44.0] [74.0 49.0]]
     [[23.0 20.0] [24.0 40.0] [36.0 30.0]]
     [[24.0 40.0] [36.0 30.0] [40.0 38.0]]
     [[36.0 30.0] [40.0 38.0] [43.0 31.0]]
     [[23.0 20.0] [36.0 30.0] [39.0 13.0]]
     [[36.0 30.0] [39.0 13.0] [43.0 31.0]]
     [[67.0 93.0] [69.0 95.0] [72.0 94.0]]
     [[67.0 93.0] [72.0 89.0] [72.0 94.0]]
     [[70.0 70.0] [75.0 59.0] [76.0 64.0]]
     [[75.0 59.0] [76.0 64.0] [78.0 62.0]]
     [[76.0 64.0] [78.0 62.0] [82.0 63.0]]
     [[70.0 70.0] [72.0 73.0] [76.0 64.0]]
     [[89.0 81.0] [90.0 67.0] [96.0 67.0]]
     [[87.0 88.0] [89.0 81.0] [90.0 85.0]]
     [[82.0 86.0] [87.0 88.0] [89.0 81.0]]
     [[89.0 81.0] [90.0 85.0] [93.0 84.0]]
     [[89.0 81.0] [93.0 84.0] [96.0 67.0]]
     [[23.0 20.0] [33.0 7.0] [39.0 13.0]]
     [[33.0 7.0] [37.0 9.0] [39.0 13.0]]
     [[69.0 95.0] [72.0 94.0] [95.0 99.0]]
     [[33.0 98.0] [69.0 95.0] [95.0 99.0]]
     [[87.0 88.0] [90.0 85.0] [95.0 99.0]]
     [[90.0 85.0] [93.0 84.0] [95.0 99.0]]
     [[1.0 65.0] [3.0 77.0] [8.0 76.0]]
     [[1.0 65.0] [8.0 76.0] [19.0 62.0]]
     [[3.0 77.0] [8.0 76.0] [12.0 83.0]]
     [[8.0 76.0] [12.0 83.0] [20.0 80.0]]
     [[8.0 76.0] [19.0 62.0] [20.0 80.0]]
     [[13.0 7.0] [20.0 6.0] [21.0 12.0]]
     [[9.0 19.0] [13.0 7.0] [21.0 12.0]]
     [[21.0 12.0] [22.0 7.0] [31.0 6.0]]
     [[21.0 12.0] [21.0 18.0] [23.0 20.0]]
     [[21.0 12.0] [23.0 20.0] [33.0 7.0]]
     [[21.0 12.0] [31.0 6.0] [33.0 7.0]]
     [[20.0 6.0] [21.0 12.0] [22.0 7.0]]
     [[9.0 19.0] [21.0 12.0] [21.0 18.0]]
     [[45.0 90.0] [55.0 84.0] [56.0 86.0]]
     [[40.0 73.0] [44.0 71.0] [55.0 84.0]]
     [[40.0 73.0] [45.0 90.0] [55.0 84.0]]
     [[44.0 71.0] [55.0 84.0] [59.0 80.0]]
     [[55.0 84.0] [56.0 86.0] [59.0 80.0]]
     [[48.0 94.0] [56.0 86.0] [61.0 93.0]]
     [[56.0 86.0] [61.0 93.0] [62.0 92.0]]
     [[48.0 94.0] [61.0 93.0] [69.0 95.0]]
     [[61.0 93.0] [62.0 92.0] [67.0 93.0]]
     [[61.0 93.0] [67.0 93.0] [69.0 95.0]]
     [[62.0 82.0] [62.0 92.0] [67.0 93.0]]
     [[62.0 82.0] [70.0 70.0] [72.0 73.0]]
     [[62.0 82.0] [67.0 93.0] [72.0 89.0]]
     [[59.0 80.0] [62.0 82.0] [70.0 70.0]]
     [[56.0 86.0] [59.0 80.0] [62.0 82.0]]
     [[56.0 86.0] [62.0 82.0] [62.0 92.0]]
     [[62.0 82.0] [72.0 73.0] [72.0 89.0]]
     [[80.0 15.0] [83.0 9.0] [85.0 11.0]]
     [[59.0 17.0] [78.0 20.0] [80.0 15.0]]
     [[78.0 20.0] [80.0 15.0] [87.0 25.0]]
     [[56.0 10.0] [59.0 17.0] [80.0 15.0]]
     [[56.0 10.0] [80.0 15.0] [83.0 9.0]]
     [[72.0 89.0] [72.0 94.0] [82.0 93.0]]
     [[72.0 89.0] [82.0 86.0] [82.0 93.0]]
     [[82.0 86.0] [82.0 93.0] [87.0 88.0]]
     [[72.0 94.0] [82.0 93.0] [95.0 99.0]]
     [[82.0 93.0] [87.0 88.0] [95.0 99.0]]
     [[42.0 57.0] [44.0 71.0] [55.0 66.0]]
     [[55.0 66.0] [70.0 70.0] [75.0 59.0]]
     [[42.0 57.0] [49.0 55.0] [55.0 66.0]]
     [[55.0 66.0] [59.0 80.0] [70.0 70.0]]
     [[49.0 55.0] [55.0 66.0] [69.0 51.0]]
     [[55.0 66.0] [69.0 51.0] [75.0 59.0]]
     [[44.0 71.0] [55.0 66.0] [59.0 80.0]]
     [[85.0 11.0] [86.0 9.0] [91.0 18.0]]
     [[80.0 15.0] [87.0 25.0] [91.0 18.0]]
     [[80.0 15.0] [85.0 11.0] [91.0 18.0]]
     [[87.0 25.0] [91.0 18.0] [98.0 32.0]]
     [[85.0 28.0] [90.0 51.0] [99.0 39.0]]
     [[90.0 51.0] [96.0 55.0] [99.0 39.0]]
     [[96.0 55.0] [96.0 67.0] [99.0 39.0]]
     [[85.0 28.0] [98.0 32.0] [99.0 39.0]]
     [[1.0 9.0] [1.0 14.0] [5.0 16.0]]
     [[1.0 14.0] [1.0 65.0] [10.0 32.0]]
     [[1.0 14.0] [5.0 16.0] [10.0 32.0]]
     [[73.0 44.0] [74.0 33.0] [77.0 48.0]]
     [[77.0 48.0] [85.0 28.0] [90.0 51.0]]
     [[74.0 49.0] [77.0 48.0] [82.0 52.0]]
     [[74.0 33.0] [77.0 48.0] [85.0 28.0]]
     [[73.0 44.0] [74.0 49.0] [77.0 48.0]]
     [[77.0 48.0] [82.0 52.0] [90.0 51.0]]
     [[76.0 64.0] [82.0 63.0] [86.0 69.0]]
     [[72.0 73.0] [76.0 64.0] [86.0 69.0]]
     [[82.0 86.0] [86.0 69.0] [89.0 81.0]]
     [[82.0 63.0] [86.0 69.0] [88.0 61.0]]
     [[72.0 73.0] [82.0 86.0] [86.0 69.0]]
     [[86.0 69.0] [88.0 61.0] [90.0 67.0]]
     [[86.0 69.0] [89.0 81.0] [90.0 67.0]]
     [[33.0 98.0] [42.0 93.0] [48.0 94.0]]
     [[42.0 93.0] [45.0 90.0] [48.0 94.0]]
     [[33.0 98.0] [39.0 88.0] [42.0 93.0]]
     [[39.0 88.0] [42.0 93.0] [45.0 90.0]]
     [[22.0 0.0] [31.0 6.0] [36.0 5.0]]
     [[31.0 6.0] [33.0 7.0] [36.0 5.0]]
     [[36.0 5.0] [37.0 9.0] [56.0 10.0]]
     [[33.0 7.0] [36.0 5.0] [37.0 9.0]]]
    :graph
    [[[15 0.15] [23 0.19] [27 0.05] [54 0.11] [89 0.16] [93 0.16]]
     [[13 0.02] [23 0.12] [30 0.04] [53 0.14] [57 0.05] [82 0.1]]
     [[34 0.07] [38 0.14] [52 0.07] [58 0.02] [67 0.07]]
     [[8 0.11] [9 0.13] [44 0.03] [74 0.07] [98 0.16]]
     [[14 0.04] [64 0.03] [83 0.06]]
     [[32 0.13] [35 0.01] [69 0.07] [91 0.03]]
     [[26 0.02] [28 0.05] [77 0.16] [86 0.02] [90 0.09]]
     [[41 0.1] [46 0.11] [48 0.16] [55 0.01] [70 0.02] [95 0.03]]
     [[3 0.11] [42 0.1] [44 0.11] [50 0.1] [80 0.11] [84 0.04] [98 0.13]]
     [[3 0.13] [74 0.07] [98 0.28]]
     [[25 0.14] [34 0.11] [41 0.07] [55 0.12] [57 0.17] [67 0.13] [68 0.18] [70 0.12] [76 0.16]]
     [[12 0.14] [33 0.11] [40 0.16] [60 0.09] [62 0.13] [85 0.1] [97 0.12]]
     [[11 0.14] [21 0.09] [40 0.16] [60 0.13] [71 0.13] [76 0.05]]
     [[1 0.02] [30 0.06] [57 0.03] [68 0.12]]
     [[4 0.04] [64 0.06] [65 0.08] [81 0.07] [83 0.09] [96 0.18]]
     [[0 0.15] [23 0.18] [54 0.14] [60 0.03] [62 0.11] [71 0.11]]
     [[20 0.15] [36 0.16] [47 0.07] [66 0.22] [75 0.19]]
     [[38 0.18] [42 0.29] [65 0.26] [79 0.02] [80 0.32] [96 0.18]]
     [[56 0.11] [87 0.03] [94 0.06] [99 0.08]]
     [[23 0.12] [27 0.14] [35 0.21] [37 0.22] [51 0.12] [64 0.19] [78 0.16] [91 0.21]]
     [[16 0.15] [36 0.04] [39 0.16] [75 0.18] [90 0.13] [92 0.12]]
     [[12 0.09] [40 0.12] [48 0.15] [49 0.11] [76 0.11]]
     [[43 0.06] [52 0.07] [88 0.01]]
     [[0 0.19] [1 0.12] [15 0.18] [19 0.12] [27 0.18] [51 0.12] [53 0.11] [71 0.13] [82 0.11]]
     [[66 0.02] [77 0.37] [90 0.22]]
     [[10 0.14] [31 0.07] [53 0.08] [57 0.11] [71 0.09] [76 0.08]]
     [[6 0.02] [39 0.14] [86 0.02] [90 0.08] [92 0.06]]
     [[0 0.05] [19 0.14] [23 0.18] [37 0.15] [89 0.16]]
     [[6 0.05] [35 0.19] [37 0.21] [39 0.16] [69 0.13] [77 0.18] [86 0.04]]
     [[45 0.08] [72 0.13] [85 0.03] [94 0.13] [97 0.09]]
     [[1 0.04] [13 0.06] [43 0.17] [68 0.14] [78 0.14] [82 0.08] [96 0.15]]
     [[25 0.07] [53 0.01] [71 0.03]]
     [[5 0.13] [50 0.05] [63 0.04] [69 0.13] [91 0.14]]
     [[11 0.11] [54 0.11] [59 0.07] [62 0.07] [72 0.04] [85 0.14]]
     [[2 0.07] [10 0.11] [58 0.07] [67 0.03] [70 0.1] [95 0.1]]
     [[5 0.01] [19 0.21] [28 0.19] [37 0.3] [69 0.08] [91 0.02]]
     [[16 0.16] [20 0.04] [66 0.09] [90 0.14]]
     [[19 0.22] [27 0.15] [28 0.21] [35 0.3] [39 0.11] [75 0.09] [89 0.11]]
     [[2 0.14] [17 0.18] [43 0.15] [52 0.1] [58 0.15] [79 0.16]]
     [[20 0.16] [26 0.14] [28 0.16] [37 0.11] [75 0.04] [86 0.15] [92 0.14]]
     [[11 0.16] [12 0.16] [21 0.12] [45 0.19] [48 0.25] [97 0.07]]
     [[7 0.1] [10 0.07] [48 0.11] [49 0.09] [55 0.1] [76 0.17]]
     [[8 0.1] [17 0.29] [65 0.09] [80 0.08] [81 0.12] [84 0.09]]
     [[22 0.06] [30 0.17] [38 0.15] [52 0.12] [68 0.08] [79 0.16] [88 0.06] [96 0.11]]
     [[3 0.03] [8 0.11] [74 0.07] [80 0.07]]
     [[29 0.08] [40 0.19] [94 0.14] [97 0.13]]
     [[7 0.11] [48 0.26] [58 0.14] [95 0.1]]
     [[16 0.07] [56 0.38] [61 0.26] [73 0.19] [75 0.2] [89 0.23]]
     [[7 0.16] [21 0.15] [40 0.25] [41 0.11] [46 0.26] [49 0.05]]
     [[21 0.11] [41 0.09] [48 0.05] [76 0.15]]
     [[8 0.1] [32 0.05] [63 0.06] [81 0.11] [84 0.08] [91 0.15] [98 0.12]]
     [[19 0.12] [23 0.12] [78 0.07] [82 0.02]]
     [[2 0.07] [22 0.07] [38 0.1] [43 0.12] [67 0.08] [88 0.08]]
     [[1 0.14] [23 0.11] [25 0.08] [31 0.01] [57 0.12] [71 0.04]]
     [[0 0.11] [15 0.14] [33 0.11] [59 0.14] [61 0.22] [62 0.05] [93 0.15] [99 0.16]]
     [[7 0.01] [10 0.12] [41 0.1] [70 0.01]]
     [[18 0.11] [47 0.38] [61 0.12] [99 0.11]]
     [[1 0.05] [10 0.17] [13 0.03] [25 0.11] [53 0.12] [68 0.12]]
     [[2 0.02] [34 0.07] [38 0.15] [46 0.14] [95 0.12]]
     [[33 0.07] [54 0.14] [72 0.03] [87 0.08] [94 0.08] [99 0.04]]
     [[11 0.09] [12 0.13] [15 0.03] [62 0.12] [71 0.1]]
     [[47 0.26] [54 0.22] [56 0.12] [73 0.1] [93 0.15] [99 0.18]]
     [[11 0.13] [15 0.11] [33 0.07] [54 0.05] [60 0.12]]
     [[32 0.04] [50 0.06] [69 0.16] [77 0.21] [98 0.1]]
     [[4 0.03] [14 0.06] [19 0.19] [78 0.08] [81 0.09] [83 0.07] [91 0.1]]
     [[14 0.08] [17 0.26] [42 0.09] [81 0.1] [96 0.17]]
     [[16 0.22] [24 0.02] [36 0.09] [90 0.2]]
     [[2 0.07] [10 0.13] [34 0.03] [52 0.08] [68 0.12] [88 0.11]]
     [[10 0.18] [13 0.12] [30 0.14] [43 0.08] [57 0.12] [67 0.12] [88 0.04]]
     [[5 0.07] [28 0.13] [32 0.13] [35 0.08] [63 0.16] [77 0.19]]
     [[7 0.02] [10 0.12] [34 0.1] [55 0.01] [95 0.01]]
     [[12 0.13] [15 0.11] [23 0.13] [25 0.09] [31 0.03] [53 0.04] [60 0.1] [76 0.12]]
     [[29 0.13] [33 0.04] [59 0.03] [85 0.14] [94 0.09]]
     [[47 0.19] [61 0.1] [89 0.12] [93 0.09]]
     [[3 0.07] [9 0.07] [44 0.07] [80 0.12]]
     [[16 0.19] [20 0.18] [37 0.09] [39 0.04] [47 0.2] [89 0.15]]
     [[10 0.16] [12 0.05] [21 0.11] [25 0.08] [41 0.17] [49 0.15] [71 0.12]]
     [[6 0.16] [24 0.37] [28 0.18] [63 0.21] [69 0.19] [90 0.19] [98 0.26]]
     [[19 0.16] [30 0.14] [51 0.07] [64 0.08] [82 0.09] [83 0.01] [96 0.16]]
     [[17 0.02] [38 0.16] [43 0.16] [96 0.17]]
     [[8 0.11] [17 0.32] [42 0.08] [44 0.07] [74 0.12]]
     [[14 0.07] [42 0.12] [50 0.11] [64 0.09] [65 0.1] [84 0.1] [91 0.12]]
     [[1 0.1] [23 0.11] [30 0.08] [51 0.02] [78 0.09]]
     [[4 0.06] [14 0.09] [64 0.07] [78 0.01] [96 0.16]]
     [[8 0.04] [42 0.09] [50 0.08] [81 0.1]]
     [[11 0.1] [29 0.03] [33 0.14] [72 0.14] [97 0.06]]
     [[6 0.02] [26 0.02] [28 0.04] [39 0.15]]
     [[18 0.03] [59 0.08] [94 0.03] [99 0.07]]
     [[22 0.01] [43 0.06] [52 0.08] [67 0.11] [68 0.04]]
     [[0 0.16] [27 0.16] [37 0.11] [47 0.23] [73 0.12] [75 0.15] [93 0.06]]
     [[6 0.09] [20 0.13] [24 0.22] [26 0.08] [36 0.14] [66 0.2] [77 0.19] [92 0.04]]
     [[5 0.03] [19 0.21] [32 0.14] [35 0.02] [50 0.15] [64 0.1] [81 0.12]]
     [[20 0.12] [26 0.06] [39 0.14] [90 0.04]]
     [[0 0.16] [54 0.15] [61 0.15] [73 0.09] [89 0.06]]
     [[18 0.06] [29 0.13] [45 0.14] [59 0.08] [72 0.09] [87 0.03]]
     [[7 0.03] [34 0.1] [46 0.1] [58 0.12] [70 0.01]]
     [[14 0.18] [17 0.18] [30 0.15] [43 0.11] [65 0.17] [78 0.16] [79 0.17] [83 0.16]]
     [[11 0.12] [29 0.09] [40 0.07] [45 0.13] [85 0.06]]
     [[3 0.16] [8 0.13] [9 0.28] [50 0.12] [63 0.1] [77 0.26]]
     [[18 0.08] [54 0.16] [56 0.11] [59 0.04] [61 0.18] [87 0.07]]]
    :s 3 :t 99}})