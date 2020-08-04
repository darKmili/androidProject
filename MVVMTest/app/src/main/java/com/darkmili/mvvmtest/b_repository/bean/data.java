package com.darkmili.mvvmtest.b_repository.bean;

import java.util.List;

public class data {


    /**
     * result : {"realtime":{"visibility":5,"air_quality":{"no2":0,"pm25":3,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":8},"description":{"usa":"","chn":"优"},"co":0},"dswrf":67.9,"pressure":98363.44,"precipitation":{"nearest":{"intensity":2,"distance":1,"status":"ok"},"local":{"intensity":0.1195,"datasource":"radar","status":"ok"}},"cloudrate":1,"temperature":26.16,"skycon":"LIGHT_RAIN","humidity":1,"apparent_temperature":26.6,"life_index":{"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":4,"desc":"温暖"}},"status":"ok","wind":{"speed":25.92,"direction":270}},"forecast_keypoint":"雨渐大，14分钟后转为中雨，不过一小时后雨会再次变小","daily":{"visibility":[{"date":"2020-08-03T00:00+08:00","min":2.22,"avg":6.86,"max":15.15},{"date":"2020-08-04T00:00+08:00","min":5.27,"avg":8.76,"max":15.17},{"date":"2020-08-05T00:00+08:00","min":5.6,"avg":10.16,"max":15.17},{"date":"2020-08-06T00:00+08:00","min":6.94,"avg":10.73,"max":15.17},{"date":"2020-08-07T00:00+08:00","min":6.8,"avg":10.88,"max":15.17}],"air_quality":{"pm25":[{"date":"2020-08-03T00:00+08:00","avg":4.6,"min":3,"max":6},{"date":"2020-08-04T00:00+08:00","avg":4.83,"min":3,"max":6},{"date":"2020-08-05T00:00+08:00","avg":4.54,"min":3,"max":6},{"date":"2020-08-06T00:00+08:00","avg":6.92,"min":6,"max":10},{"date":"2020-08-07T00:00+08:00","avg":9.71,"min":7,"max":12}],"aqi":[{"date":"2020-08-03T00:00+08:00","avg":{"usa":7.5,"chn":7.5},"min":{"usa":7,"chn":7},"max":{"usa":9,"chn":9}},{"date":"2020-08-04T00:00+08:00","avg":{"usa":7.62,"chn":7.62},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-05T00:00+08:00","avg":{"usa":7.54,"chn":7.54},"min":{"usa":7,"chn":7},"max":{"usa":9,"chn":9}},{"date":"2020-08-06T00:00+08:00","avg":{"usa":9.21,"chn":9.21},"min":{"usa":8,"chn":8},"max":{"usa":14,"chn":14}},{"date":"2020-08-07T00:00+08:00","avg":{"usa":13.42,"chn":13.42},"min":{"usa":10,"chn":10},"max":{"usa":16,"chn":16}}]},"pressure":[{"date":"2020-08-03T00:00+08:00","min":98363.24,"avg":98501.65,"max":99003.48},{"date":"2020-08-04T00:00+08:00","min":98572.84,"avg":98858.04,"max":99274.11},{"date":"2020-08-05T00:00+08:00","min":99163.48,"avg":99282.98,"max":99483.48},{"date":"2020-08-06T00:00+08:00","min":99262.25,"avg":99415.01,"max":99563.48},{"date":"2020-08-07T00:00+08:00","min":99083.48,"avg":99265.8,"max":99452.88}],"dswrf":[{"date":"2020-08-03T00:00+08:00","min":0,"avg":23.7,"max":77},{"date":"2020-08-04T00:00+08:00","min":0,"avg":195.4,"max":577},{"date":"2020-08-05T00:00+08:00","min":0,"avg":280.8,"max":749.2},{"date":"2020-08-06T00:00+08:00","min":0,"avg":298.5,"max":769.5},{"date":"2020-08-07T00:00+08:00","min":0,"avg":319.2,"max":825.8}],"precipitation":[{"date":"2020-08-03T00:00+08:00","min":0,"avg":1.2008,"max":13.1944},{"date":"2020-08-04T00:00+08:00","min":0,"avg":0.2479,"max":2.3121},{"date":"2020-08-05T00:00+08:00","min":0,"avg":0.024,"max":0.2093},{"date":"2020-08-06T00:00+08:00","min":0,"avg":0,"max":0},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.0444,"max":0.5362}],"skycon_08h_20h":[{"date":"2020-08-03T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-06T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-07T00:00+08:00","value":"PARTLY_CLOUDY_DAY"}],"cloudrate":[{"date":"2020-08-03T00:00+08:00","min":0.96,"avg":1,"max":1},{"date":"2020-08-04T00:00+08:00","min":0.98,"avg":1,"max":1},{"date":"2020-08-05T00:00+08:00","min":0.76,"avg":0.96,"max":1},{"date":"2020-08-06T00:00+08:00","min":0.06,"avg":0.76,"max":1},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.59,"max":0.97}],"astro":[{"date":"2020-08-03T00:00+08:00","sunrise":{"time":"05:21"},"sunset":{"time":"18:37"}},{"date":"2020-08-04T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-05T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-06T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:35"}},{"date":"2020-08-07T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:34"}}],"skycon_20h_32h":[{"date":"2020-08-03T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"}],"temperature":[{"date":"2020-08-03T00:00+08:00","min":25,"avg":26.86,"max":27.39},{"date":"2020-08-04T00:00+08:00","min":26,"avg":27.86,"max":30},{"date":"2020-08-05T00:00+08:00","min":26,"avg":28.83,"max":31},{"date":"2020-08-06T00:00+08:00","min":26,"avg":28.4,"max":31},{"date":"2020-08-07T00:00+08:00","min":26,"avg":28.46,"max":31}],"skycon":[{"date":"2020-08-03T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"}],"humidity":[{"date":"2020-08-03T00:00+08:00","min":0.79,"avg":0.84,"max":1},{"date":"2020-08-04T00:00+08:00","min":0.69,"avg":0.8,"max":0.89},{"date":"2020-08-05T00:00+08:00","min":0.63,"avg":0.76,"max":0.87},{"date":"2020-08-06T00:00+08:00","min":0.62,"avg":0.74,"max":0.82},{"date":"2020-08-07T00:00+08:00","min":0.64,"avg":0.74,"max":0.82}],"life_index":{"dressing":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"很热"}],"ultraviolet":[{"date":"2020-08-03T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-05T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-06T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"弱"}],"coldRisk":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"易发"}],"carWashing":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"较不适宜"}],"comfort":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"热"}]},"status":"ok","wind":[{"date":"2020-08-03T00:00+08:00","min":{"speed":7.72,"direction":50.79},"avg":{"speed":19.17,"direction":283.59},"max":{"speed":35.16,"direction":261.93}},{"date":"2020-08-04T00:00+08:00","min":{"speed":1.13,"direction":103.45},"avg":{"speed":4.87,"direction":113.81},"max":{"speed":9.43,"direction":162.57}},{"date":"2020-08-05T00:00+08:00","min":{"speed":1.89,"direction":167.72},"avg":{"speed":8.36,"direction":136.26},"max":{"speed":19.15,"direction":144.96}},{"date":"2020-08-06T00:00+08:00","min":{"speed":0.43,"direction":264.18},"avg":{"speed":10.14,"direction":127.38},"max":{"speed":19.16,"direction":156.36}},{"date":"2020-08-07T00:00+08:00","min":{"speed":0.73,"direction":339.19},"avg":{"speed":6.06,"direction":169.78},"max":{"speed":11.57,"direction":174.62}}]},"hourly":{"precipitation":[{"datetime":"2020-08-03T14:00+08:00","value":0.3722},{"datetime":"2020-08-03T15:00+08:00","value":2.9975},{"datetime":"2020-08-03T16:00+08:00","value":1.1469},{"datetime":"2020-08-03T17:00+08:00","value":4.6699},{"datetime":"2020-08-03T18:00+08:00","value":1.9772},{"datetime":"2020-08-03T19:00+08:00","value":0.3692},{"datetime":"2020-08-03T20:00+08:00","value":0.0534},{"datetime":"2020-08-03T21:00+08:00","value":0.1899},{"datetime":"2020-08-03T22:00+08:00","value":0.2316},{"datetime":"2020-08-03T23:00+08:00","value":0},{"datetime":"2020-08-04T00:00+08:00","value":0},{"datetime":"2020-08-04T01:00+08:00","value":0},{"datetime":"2020-08-04T02:00+08:00","value":0},{"datetime":"2020-08-04T03:00+08:00","value":0},{"datetime":"2020-08-04T04:00+08:00","value":0},{"datetime":"2020-08-04T05:00+08:00","value":0},{"datetime":"2020-08-04T06:00+08:00","value":0},{"datetime":"2020-08-04T07:00+08:00","value":0},{"datetime":"2020-08-04T08:00+08:00","value":0},{"datetime":"2020-08-04T09:00+08:00","value":0},{"datetime":"2020-08-04T10:00+08:00","value":0},{"datetime":"2020-08-04T11:00+08:00","value":0.0614},{"datetime":"2020-08-04T12:00+08:00","value":0.2218},{"datetime":"2020-08-04T13:00+08:00","value":1.2394},{"datetime":"2020-08-04T14:00+08:00","value":2.3121},{"datetime":"2020-08-04T15:00+08:00","value":0.8649},{"datetime":"2020-08-04T16:00+08:00","value":0.3599},{"datetime":"2020-08-04T17:00+08:00","value":0.5713},{"datetime":"2020-08-04T18:00+08:00","value":0.2497},{"datetime":"2020-08-04T19:00+08:00","value":0.0702},{"datetime":"2020-08-04T20:00+08:00","value":0},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":0},{"datetime":"2020-08-05T08:00+08:00","value":0},{"datetime":"2020-08-05T09:00+08:00","value":0},{"datetime":"2020-08-05T10:00+08:00","value":0},{"datetime":"2020-08-05T11:00+08:00","value":0},{"datetime":"2020-08-05T12:00+08:00","value":0},{"datetime":"2020-08-05T13:00+08:00","value":0.0536}],"cloudrate":[{"datetime":"2020-08-03T14:00+08:00","value":1},{"datetime":"2020-08-03T15:00+08:00","value":1},{"datetime":"2020-08-03T16:00+08:00","value":1},{"datetime":"2020-08-03T17:00+08:00","value":1},{"datetime":"2020-08-03T18:00+08:00","value":1},{"datetime":"2020-08-03T19:00+08:00","value":1},{"datetime":"2020-08-03T20:00+08:00","value":1},{"datetime":"2020-08-03T21:00+08:00","value":1},{"datetime":"2020-08-03T22:00+08:00","value":1},{"datetime":"2020-08-03T23:00+08:00","value":1},{"datetime":"2020-08-04T00:00+08:00","value":1},{"datetime":"2020-08-04T01:00+08:00","value":1},{"datetime":"2020-08-04T02:00+08:00","value":1},{"datetime":"2020-08-04T03:00+08:00","value":1},{"datetime":"2020-08-04T04:00+08:00","value":1},{"datetime":"2020-08-04T05:00+08:00","value":1},{"datetime":"2020-08-04T06:00+08:00","value":1},{"datetime":"2020-08-04T07:00+08:00","value":1},{"datetime":"2020-08-04T08:00+08:00","value":1},{"datetime":"2020-08-04T09:00+08:00","value":1},{"datetime":"2020-08-04T10:00+08:00","value":1},{"datetime":"2020-08-04T11:00+08:00","value":1},{"datetime":"2020-08-04T12:00+08:00","value":1},{"datetime":"2020-08-04T13:00+08:00","value":0.98},{"datetime":"2020-08-04T14:00+08:00","value":1},{"datetime":"2020-08-04T15:00+08:00","value":1},{"datetime":"2020-08-04T16:00+08:00","value":1},{"datetime":"2020-08-04T17:00+08:00","value":1},{"datetime":"2020-08-04T18:00+08:00","value":1},{"datetime":"2020-08-04T19:00+08:00","value":1},{"datetime":"2020-08-04T20:00+08:00","value":1},{"datetime":"2020-08-04T21:00+08:00","value":1},{"datetime":"2020-08-04T22:00+08:00","value":1},{"datetime":"2020-08-04T23:00+08:00","value":1},{"datetime":"2020-08-05T00:00+08:00","value":1},{"datetime":"2020-08-05T01:00+08:00","value":1},{"datetime":"2020-08-05T02:00+08:00","value":1},{"datetime":"2020-08-05T03:00+08:00","value":1},{"datetime":"2020-08-05T04:00+08:00","value":1},{"datetime":"2020-08-05T05:00+08:00","value":1},{"datetime":"2020-08-05T06:00+08:00","value":1},{"datetime":"2020-08-05T07:00+08:00","value":1},{"datetime":"2020-08-05T08:00+08:00","value":1},{"datetime":"2020-08-05T09:00+08:00","value":1},{"datetime":"2020-08-05T10:00+08:00","value":1},{"datetime":"2020-08-05T11:00+08:00","value":1},{"datetime":"2020-08-05T12:00+08:00","value":1},{"datetime":"2020-08-05T13:00+08:00","value":1}],"visibility":[{"datetime":"2020-08-03T14:00+08:00","value":5},{"datetime":"2020-08-03T15:00+08:00","value":5.93},{"datetime":"2020-08-03T16:00+08:00","value":6.05},{"datetime":"2020-08-03T17:00+08:00","value":6.39},{"datetime":"2020-08-03T18:00+08:00","value":7.87},{"datetime":"2020-08-03T19:00+08:00","value":7.91},{"datetime":"2020-08-03T20:00+08:00","value":7.7},{"datetime":"2020-08-03T21:00+08:00","value":7.47},{"datetime":"2020-08-03T22:00+08:00","value":7.07},{"datetime":"2020-08-03T23:00+08:00","value":7.23},{"datetime":"2020-08-04T00:00+08:00","value":7.18},{"datetime":"2020-08-04T01:00+08:00","value":7},{"datetime":"2020-08-04T02:00+08:00","value":6.9},{"datetime":"2020-08-04T03:00+08:00","value":7.23},{"datetime":"2020-08-04T04:00+08:00","value":7.5},{"datetime":"2020-08-04T05:00+08:00","value":7.74},{"datetime":"2020-08-04T06:00+08:00","value":7.82},{"datetime":"2020-08-04T07:00+08:00","value":8.6},{"datetime":"2020-08-04T08:00+08:00","value":10.58},{"datetime":"2020-08-04T09:00+08:00","value":13.1},{"datetime":"2020-08-04T10:00+08:00","value":15.17},{"datetime":"2020-08-04T11:00+08:00","value":15.17},{"datetime":"2020-08-04T12:00+08:00","value":15.13},{"datetime":"2020-08-04T13:00+08:00","value":13.88},{"datetime":"2020-08-04T14:00+08:00","value":11.81},{"datetime":"2020-08-04T15:00+08:00","value":9.61},{"datetime":"2020-08-04T16:00+08:00","value":7.19},{"datetime":"2020-08-04T17:00+08:00","value":6.09},{"datetime":"2020-08-04T18:00+08:00","value":5.47},{"datetime":"2020-08-04T19:00+08:00","value":5.27},{"datetime":"2020-08-04T20:00+08:00","value":5.61},{"datetime":"2020-08-04T21:00+08:00","value":5.57},{"datetime":"2020-08-04T22:00+08:00","value":5.28},{"datetime":"2020-08-04T23:00+08:00","value":5.44},{"datetime":"2020-08-05T00:00+08:00","value":5.6},{"datetime":"2020-08-05T01:00+08:00","value":5.73},{"datetime":"2020-08-05T02:00+08:00","value":5.9},{"datetime":"2020-08-05T03:00+08:00","value":6.08},{"datetime":"2020-08-05T04:00+08:00","value":6.14},{"datetime":"2020-08-05T05:00+08:00","value":6.45},{"datetime":"2020-08-05T06:00+08:00","value":7.13},{"datetime":"2020-08-05T07:00+08:00","value":8.29},{"datetime":"2020-08-05T08:00+08:00","value":10.43},{"datetime":"2020-08-05T09:00+08:00","value":13.65},{"datetime":"2020-08-05T10:00+08:00","value":15.17},{"datetime":"2020-08-05T11:00+08:00","value":15.17},{"datetime":"2020-08-05T12:00+08:00","value":15.17},{"datetime":"2020-08-05T13:00+08:00","value":15.17}],"temperature":[{"datetime":"2020-08-03T14:00+08:00","value":26.16},{"datetime":"2020-08-03T15:00+08:00","value":26.47},{"datetime":"2020-08-03T16:00+08:00","value":26.77},{"datetime":"2020-08-03T17:00+08:00","value":27.08},{"datetime":"2020-08-03T18:00+08:00","value":27.39},{"datetime":"2020-08-03T19:00+08:00","value":26.69},{"datetime":"2020-08-03T20:00+08:00","value":27},{"datetime":"2020-08-03T21:00+08:00","value":27},{"datetime":"2020-08-03T22:00+08:00","value":27},{"datetime":"2020-08-03T23:00+08:00","value":27},{"datetime":"2020-08-04T00:00+08:00","value":27},{"datetime":"2020-08-04T01:00+08:00","value":27},{"datetime":"2020-08-04T02:00+08:00","value":27},{"datetime":"2020-08-04T03:00+08:00","value":27},{"datetime":"2020-08-04T04:00+08:00","value":27},{"datetime":"2020-08-04T05:00+08:00","value":26.4},{"datetime":"2020-08-04T06:00+08:00","value":27.6},{"datetime":"2020-08-04T07:00+08:00","value":28.6},{"datetime":"2020-08-04T08:00+08:00","value":28.8},{"datetime":"2020-08-04T09:00+08:00","value":29.5},{"datetime":"2020-08-04T10:00+08:00","value":29.6},{"datetime":"2020-08-04T11:00+08:00","value":29.7},{"datetime":"2020-08-04T12:00+08:00","value":29.8},{"datetime":"2020-08-04T13:00+08:00","value":29.6},{"datetime":"2020-08-04T14:00+08:00","value":30},{"datetime":"2020-08-04T15:00+08:00","value":28.67},{"datetime":"2020-08-04T16:00+08:00","value":28.23},{"datetime":"2020-08-04T17:00+08:00","value":27.79},{"datetime":"2020-08-04T18:00+08:00","value":27.35},{"datetime":"2020-08-04T19:00+08:00","value":26.97},{"datetime":"2020-08-04T20:00+08:00","value":26.58},{"datetime":"2020-08-04T21:00+08:00","value":26.34},{"datetime":"2020-08-04T22:00+08:00","value":26},{"datetime":"2020-08-04T23:00+08:00","value":26.04},{"datetime":"2020-08-05T00:00+08:00","value":26},{"datetime":"2020-08-05T01:00+08:00","value":26},{"datetime":"2020-08-05T02:00+08:00","value":26.02},{"datetime":"2020-08-05T03:00+08:00","value":26.52},{"datetime":"2020-08-05T04:00+08:00","value":27.04},{"datetime":"2020-08-05T05:00+08:00","value":27.56},{"datetime":"2020-08-05T06:00+08:00","value":28.13},{"datetime":"2020-08-05T07:00+08:00","value":28.78},{"datetime":"2020-08-05T08:00+08:00","value":29.44},{"datetime":"2020-08-05T09:00+08:00","value":30.08},{"datetime":"2020-08-05T10:00+08:00","value":30.76},{"datetime":"2020-08-05T11:00+08:00","value":30.96},{"datetime":"2020-08-05T12:00+08:00","value":31},{"datetime":"2020-08-05T13:00+08:00","value":31}],"skycon":[{"datetime":"2020-08-03T14:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T15:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-03T16:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-03T17:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-03T18:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-03T19:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-03T21:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T22:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T11:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T13:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T14:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T15:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T16:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T17:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T18:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T19:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T12:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T13:00+08:00","value":"CLOUDY"}],"description":"中雨，今天晚间20点钟后雨停，转阴，其后小雨","humidity":[{"datetime":"2020-08-03T14:00+08:00","value":1},{"datetime":"2020-08-03T15:00+08:00","value":0.86},{"datetime":"2020-08-03T16:00+08:00","value":0.85},{"datetime":"2020-08-03T17:00+08:00","value":0.84},{"datetime":"2020-08-03T18:00+08:00","value":0.79},{"datetime":"2020-08-03T19:00+08:00","value":0.79},{"datetime":"2020-08-03T20:00+08:00","value":0.8},{"datetime":"2020-08-03T21:00+08:00","value":0.8},{"datetime":"2020-08-03T22:00+08:00","value":0.81},{"datetime":"2020-08-03T23:00+08:00","value":0.81},{"datetime":"2020-08-04T00:00+08:00","value":0.81},{"datetime":"2020-08-04T01:00+08:00","value":0.82},{"datetime":"2020-08-04T02:00+08:00","value":0.82},{"datetime":"2020-08-04T03:00+08:00","value":0.81},{"datetime":"2020-08-04T04:00+08:00","value":0.8},{"datetime":"2020-08-04T05:00+08:00","value":0.8},{"datetime":"2020-08-04T06:00+08:00","value":0.79},{"datetime":"2020-08-04T07:00+08:00","value":0.78},{"datetime":"2020-08-04T08:00+08:00","value":0.74},{"datetime":"2020-08-04T09:00+08:00","value":0.72},{"datetime":"2020-08-04T10:00+08:00","value":0.7},{"datetime":"2020-08-04T11:00+08:00","value":0.69},{"datetime":"2020-08-04T12:00+08:00","value":0.7},{"datetime":"2020-08-04T13:00+08:00","value":0.71},{"datetime":"2020-08-04T14:00+08:00","value":0.73},{"datetime":"2020-08-04T15:00+08:00","value":0.76},{"datetime":"2020-08-04T16:00+08:00","value":0.81},{"datetime":"2020-08-04T17:00+08:00","value":0.85},{"datetime":"2020-08-04T18:00+08:00","value":0.88},{"datetime":"2020-08-04T19:00+08:00","value":0.89},{"datetime":"2020-08-04T20:00+08:00","value":0.87},{"datetime":"2020-08-04T21:00+08:00","value":0.87},{"datetime":"2020-08-04T22:00+08:00","value":0.89},{"datetime":"2020-08-04T23:00+08:00","value":0.88},{"datetime":"2020-08-05T00:00+08:00","value":0.87},{"datetime":"2020-08-05T01:00+08:00","value":0.86},{"datetime":"2020-08-05T02:00+08:00","value":0.86},{"datetime":"2020-08-05T03:00+08:00","value":0.85},{"datetime":"2020-08-05T04:00+08:00","value":0.85},{"datetime":"2020-08-05T05:00+08:00","value":0.84},{"datetime":"2020-08-05T06:00+08:00","value":0.81},{"datetime":"2020-08-05T07:00+08:00","value":0.78},{"datetime":"2020-08-05T08:00+08:00","value":0.75},{"datetime":"2020-08-05T09:00+08:00","value":0.71},{"datetime":"2020-08-05T10:00+08:00","value":0.68},{"datetime":"2020-08-05T11:00+08:00","value":0.64},{"datetime":"2020-08-05T12:00+08:00","value":0.63},{"datetime":"2020-08-05T13:00+08:00","value":0.63}],"air_quality":{"pm25":[{"datetime":"2020-08-03T14:00+08:00","value":3},{"datetime":"2020-08-03T15:00+08:00","value":3},{"datetime":"2020-08-03T16:00+08:00","value":4},{"datetime":"2020-08-03T17:00+08:00","value":4},{"datetime":"2020-08-03T18:00+08:00","value":4},{"datetime":"2020-08-03T19:00+08:00","value":5},{"datetime":"2020-08-03T20:00+08:00","value":5},{"datetime":"2020-08-03T21:00+08:00","value":6},{"datetime":"2020-08-03T22:00+08:00","value":6},{"datetime":"2020-08-03T23:00+08:00","value":6},{"datetime":"2020-08-04T00:00+08:00","value":6},{"datetime":"2020-08-04T01:00+08:00","value":6},{"datetime":"2020-08-04T02:00+08:00","value":6},{"datetime":"2020-08-04T03:00+08:00","value":6},{"datetime":"2020-08-04T04:00+08:00","value":5},{"datetime":"2020-08-04T05:00+08:00","value":5},{"datetime":"2020-08-04T06:00+08:00","value":5},{"datetime":"2020-08-04T07:00+08:00","value":4},{"datetime":"2020-08-04T08:00+08:00","value":5},{"datetime":"2020-08-04T09:00+08:00","value":5},{"datetime":"2020-08-04T10:00+08:00","value":4},{"datetime":"2020-08-04T11:00+08:00","value":4},{"datetime":"2020-08-04T12:00+08:00","value":4},{"datetime":"2020-08-04T13:00+08:00","value":3},{"datetime":"2020-08-04T14:00+08:00","value":3},{"datetime":"2020-08-04T15:00+08:00","value":4},{"datetime":"2020-08-04T16:00+08:00","value":4},{"datetime":"2020-08-04T17:00+08:00","value":4},{"datetime":"2020-08-04T18:00+08:00","value":5},{"datetime":"2020-08-04T19:00+08:00","value":5},{"datetime":"2020-08-04T20:00+08:00","value":5},{"datetime":"2020-08-04T21:00+08:00","value":6},{"datetime":"2020-08-04T22:00+08:00","value":6},{"datetime":"2020-08-04T23:00+08:00","value":6},{"datetime":"2020-08-05T00:00+08:00","value":6},{"datetime":"2020-08-05T01:00+08:00","value":6},{"datetime":"2020-08-05T02:00+08:00","value":6},{"datetime":"2020-08-05T03:00+08:00","value":6},{"datetime":"2020-08-05T04:00+08:00","value":5},{"datetime":"2020-08-05T05:00+08:00","value":5},{"datetime":"2020-08-05T06:00+08:00","value":6},{"datetime":"2020-08-05T07:00+08:00","value":5},{"datetime":"2020-08-05T08:00+08:00","value":5},{"datetime":"2020-08-05T09:00+08:00","value":5},{"datetime":"2020-08-05T10:00+08:00","value":4},{"datetime":"2020-08-05T11:00+08:00","value":4},{"datetime":"2020-08-05T12:00+08:00","value":4},{"datetime":"2020-08-05T13:00+08:00","value":3}],"aqi":[{"datetime":"2020-08-03T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T15:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T18:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T00:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T03:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T06:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T07:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T08:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T09:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T10:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T11:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T12:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T13:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T14:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T15:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T16:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T17:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T18:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T19:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T20:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T22:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T23:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T00:00+08:00","value":{"usa":9,"chn":9}},{"datetime":"2020-08-05T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T03:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T06:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T08:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T09:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T12:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T13:00+08:00","value":{"usa":8,"chn":8}}]},"pressure":[{"datetime":"2020-08-03T14:00+08:00","value":98363.43552},{"datetime":"2020-08-03T15:00+08:00","value":98363.24352},{"datetime":"2020-08-03T16:00+08:00","value":98363.24352},{"datetime":"2020-08-03T17:00+08:00","value":98393.87648},{"datetime":"2020-08-03T18:00+08:00","value":98424.27648},{"datetime":"2020-08-03T19:00+08:00","value":98523.47648},{"datetime":"2020-08-03T20:00+08:00","value":98553.87648},{"datetime":"2020-08-03T21:00+08:00","value":98603.28448},{"datetime":"2020-08-03T22:00+08:00","value":98713.87648},{"datetime":"2020-08-03T23:00+08:00","value":98713.87648},{"datetime":"2020-08-04T00:00+08:00","value":98713.87648},{"datetime":"2020-08-04T01:00+08:00","value":98633.87648},{"datetime":"2020-08-04T02:00+08:00","value":98572.84352},{"datetime":"2020-08-04T03:00+08:00","value":98603.47648},{"datetime":"2020-08-04T04:00+08:00","value":98603.47648},{"datetime":"2020-08-04T05:00+08:00","value":98652.84352},{"datetime":"2020-08-04T06:00+08:00","value":98732.84352},{"datetime":"2020-08-04T07:00+08:00","value":98763.47648},{"datetime":"2020-08-04T08:00+08:00","value":98793.87648},{"datetime":"2020-08-04T09:00+08:00","value":98812.84352},{"datetime":"2020-08-04T10:00+08:00","value":98843.47648},{"datetime":"2020-08-04T11:00+08:00","value":98843.47648},{"datetime":"2020-08-04T12:00+08:00","value":98892.84352},{"datetime":"2020-08-04T13:00+08:00","value":98893.07648},{"datetime":"2020-08-04T14:00+08:00","value":98892.88448},{"datetime":"2020-08-04T15:00+08:00","value":98862.25152},{"datetime":"2020-08-04T16:00+08:00","value":98862.25152},{"datetime":"2020-08-04T17:00+08:00","value":98892.88448},{"datetime":"2020-08-04T18:00+08:00","value":98904.50944},{"datetime":"2020-08-04T19:00+08:00","value":99015.1424},{"datetime":"2020-08-04T20:00+08:00","value":99095.1424},{"datetime":"2020-08-04T21:00+08:00","value":99163.47648},{"datetime":"2020-08-04T22:00+08:00","value":99274.10944},{"datetime":"2020-08-04T23:00+08:00","value":99274.10944},{"datetime":"2020-08-05T00:00+08:00","value":99243.47648},{"datetime":"2020-08-05T01:00+08:00","value":99163.47648},{"datetime":"2020-08-05T02:00+08:00","value":99163.47648},{"datetime":"2020-08-05T03:00+08:00","value":99163.47648},{"datetime":"2020-08-05T04:00+08:00","value":99163.47648},{"datetime":"2020-08-05T05:00+08:00","value":99175.10144},{"datetime":"2020-08-05T06:00+08:00","value":99243.47648},{"datetime":"2020-08-05T07:00+08:00","value":99285.7344},{"datetime":"2020-08-05T08:00+08:00","value":99323.47648},{"datetime":"2020-08-05T09:00+08:00","value":99323.47648},{"datetime":"2020-08-05T10:00+08:00","value":99403.47648},{"datetime":"2020-08-05T11:00+08:00","value":99403.47648},{"datetime":"2020-08-05T12:00+08:00","value":99323.47648},{"datetime":"2020-08-05T13:00+08:00","value":99311.85152}],"dswrf":[{"datetime":"2020-08-03T14:00+08:00","value":67.89936},{"datetime":"2020-08-03T15:00+08:00","value":46.23424},{"datetime":"2020-08-03T16:00+08:00","value":35.28224},{"datetime":"2020-08-03T17:00+08:00","value":25.28224},{"datetime":"2020-08-03T18:00+08:00","value":22.90624},{"datetime":"2020-08-03T19:00+08:00","value":21.45312},{"datetime":"2020-08-03T20:00+08:00","value":17.741856},{"datetime":"2020-08-03T21:00+08:00","value":0},{"datetime":"2020-08-03T22:00+08:00","value":0},{"datetime":"2020-08-03T23:00+08:00","value":0},{"datetime":"2020-08-04T00:00+08:00","value":0},{"datetime":"2020-08-04T01:00+08:00","value":0},{"datetime":"2020-08-04T02:00+08:00","value":0},{"datetime":"2020-08-04T03:00+08:00","value":0},{"datetime":"2020-08-04T04:00+08:00","value":0},{"datetime":"2020-08-04T05:00+08:00","value":0},{"datetime":"2020-08-04T06:00+08:00","value":0},{"datetime":"2020-08-04T07:00+08:00","value":30.380512},{"datetime":"2020-08-04T08:00+08:00","value":79.908736},{"datetime":"2020-08-04T09:00+08:00","value":464.87584},{"datetime":"2020-08-04T10:00+08:00","value":570.592},{"datetime":"2020-08-04T11:00+08:00","value":553.097504},{"datetime":"2020-08-04T12:00+08:00","value":527.884032},{"datetime":"2020-08-04T13:00+08:00","value":499.671808},{"datetime":"2020-08-04T14:00+08:00","value":577.041504},{"datetime":"2020-08-04T15:00+08:00","value":431.5648},{"datetime":"2020-08-04T16:00+08:00","value":311.04992},{"datetime":"2020-08-04T17:00+08:00","value":223.38816},{"datetime":"2020-08-04T18:00+08:00","value":170.9984},{"datetime":"2020-08-04T19:00+08:00","value":136.179744},{"datetime":"2020-08-04T20:00+08:00","value":113.840928},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":26.376224},{"datetime":"2020-08-05T08:00+08:00","value":67.0448},{"datetime":"2020-08-05T09:00+08:00","value":470.89056},{"datetime":"2020-08-05T10:00+08:00","value":564.99584},{"datetime":"2020-08-05T11:00+08:00","value":652.47824},{"datetime":"2020-08-05T12:00+08:00","value":715.986976},{"datetime":"2020-08-05T13:00+08:00","value":743.883648}],"status":"ok","wind":[{"datetime":"2020-08-03T14:00+08:00","speed":25.92,"direction":270},{"datetime":"2020-08-03T15:00+08:00","speed":35.16,"direction":261.93},{"datetime":"2020-08-03T16:00+08:00","speed":32.6,"direction":259.51},{"datetime":"2020-08-03T17:00+08:00","speed":24.99,"direction":251.56},{"datetime":"2020-08-03T18:00+08:00","speed":21.12,"direction":233.81},{"datetime":"2020-08-03T19:00+08:00","speed":17.78,"direction":231.48},{"datetime":"2020-08-03T20:00+08:00","speed":16.05,"direction":227.88},{"datetime":"2020-08-03T21:00+08:00","speed":13.98,"direction":198.27},{"datetime":"2020-08-03T22:00+08:00","speed":11.23,"direction":177.38},{"datetime":"2020-08-03T23:00+08:00","speed":8.53,"direction":166.3},{"datetime":"2020-08-04T00:00+08:00","speed":9.43,"direction":162.57},{"datetime":"2020-08-04T01:00+08:00","speed":8.34,"direction":154.95},{"datetime":"2020-08-04T02:00+08:00","speed":6.41,"direction":156.88},{"datetime":"2020-08-04T03:00+08:00","speed":4.48,"direction":161.03},{"datetime":"2020-08-04T04:00+08:00","speed":4.62,"direction":155.76},{"datetime":"2020-08-04T05:00+08:00","speed":2.55,"direction":166.65},{"datetime":"2020-08-04T06:00+08:00","speed":1.17,"direction":66.3},{"datetime":"2020-08-04T07:00+08:00","speed":1.13,"direction":103.45},{"datetime":"2020-08-04T08:00+08:00","speed":1.35,"direction":40.32},{"datetime":"2020-08-04T09:00+08:00","speed":5.69,"direction":22.37},{"datetime":"2020-08-04T10:00+08:00","speed":5.49,"direction":18.32},{"datetime":"2020-08-04T11:00+08:00","speed":5.38,"direction":30.92},{"datetime":"2020-08-04T12:00+08:00","speed":2.58,"direction":22.23},{"datetime":"2020-08-04T13:00+08:00","speed":6.48,"direction":100.41},{"datetime":"2020-08-04T14:00+08:00","speed":4.5,"direction":69.07},{"datetime":"2020-08-04T15:00+08:00","speed":5.67,"direction":105.78},{"datetime":"2020-08-04T16:00+08:00","speed":8.5,"direction":137.81},{"datetime":"2020-08-04T17:00+08:00","speed":8.7,"direction":149.57},{"datetime":"2020-08-04T18:00+08:00","speed":5.22,"direction":162.89},{"datetime":"2020-08-04T19:00+08:00","speed":3.16,"direction":77.64},{"datetime":"2020-08-04T20:00+08:00","speed":1.81,"direction":16.43},{"datetime":"2020-08-04T21:00+08:00","speed":3.95,"direction":311.57},{"datetime":"2020-08-04T22:00+08:00","speed":4.99,"direction":312.04},{"datetime":"2020-08-04T23:00+08:00","speed":5.36,"direction":351.75},{"datetime":"2020-08-05T00:00+08:00","speed":4.87,"direction":359.58},{"datetime":"2020-08-05T01:00+08:00","speed":2.89,"direction":34.46},{"datetime":"2020-08-05T02:00+08:00","speed":3.03,"direction":85.65},{"datetime":"2020-08-05T03:00+08:00","speed":1.89,"direction":167.72},{"datetime":"2020-08-05T04:00+08:00","speed":3.38,"direction":195.19},{"datetime":"2020-08-05T05:00+08:00","speed":4.03,"direction":184.44},{"datetime":"2020-08-05T06:00+08:00","speed":3.73,"direction":154.71},{"datetime":"2020-08-05T07:00+08:00","speed":3.89,"direction":132.1},{"datetime":"2020-08-05T08:00+08:00","speed":3.23,"direction":123.96},{"datetime":"2020-08-05T09:00+08:00","speed":3.48,"direction":133.35},{"datetime":"2020-08-05T10:00+08:00","speed":4.22,"direction":126.16},{"datetime":"2020-08-05T11:00+08:00","speed":5.02,"direction":105.38},{"datetime":"2020-08-05T12:00+08:00","speed":5.42,"direction":98.66},{"datetime":"2020-08-05T13:00+08:00","speed":5.65,"direction":99.98}]},"minutely":{"precipitation":[0.1195,0.1211,0.125,0.1316,0.1406,0.1516,0.1642,0.1779,0.1924,0.2073,0.2222,0.2365,0.25,0.2623,0.2732,0.2829,0.2912,0.2982,0.3038,0.308,0.3109,0.3124,0.3125,0.3112,0.309,0.3063,0.3036,0.3013,0.2999,0.2999,0.3017,0.3057,0.3125,0.3223,0.3346,0.3487,0.3638,0.3793,0.3945,0.4086,0.421,0.4308,0.4375,0.4405,0.4401,0.4368,0.4311,0.4235,0.4145,0.4047,0.3945,0.3844,0.375,0.3666,0.3592,0.3525,0.3464,0.3408,0.3354,0.33],"precipitation_2h":[0.1195,0.1211,0.125,0.1316,0.1406,0.1516,0.1642,0.1779,0.1924,0.2073,0.2222,0.2365,0.25,0.2623,0.2732,0.2829,0.2912,0.2982,0.3038,0.308,0.3109,0.3124,0.3125,0.3112,0.309,0.3063,0.3036,0.3013,0.2999,0.2999,0.3017,0.3057,0.3125,0.3223,0.3346,0.3487,0.3638,0.3793,0.3945,0.4086,0.421,0.4308,0.4375,0.4405,0.4401,0.4368,0.4311,0.4235,0.4145,0.4047,0.3945,0.3844,0.375,0.3666,0.3592,0.3525,0.3464,0.3408,0.3354,0.33,0.3245,0.3188,0.3125,0.3056,0.2983,0.2908,0.2832,0.2759,0.269,0.2627,0.2573,0.253,0.25,0.2484,0.2481,0.2486,0.2497,0.251,0.2522,0.2531,0.2532,0.2523,0.25,0.2461,0.2409,0.2347,0.2276,0.2202,0.2126,0.2053,0.1984,0.1924,0.1875,0.184,0.1817,0.1805,0.1803,0.1807,0.1817,0.1831,0.1846,0.1861,0.1875,0.1885,0.1892,0.1896,0.1898,0.1897,0.1895,0.1891,0.1886,0.1881,0.1875,0.1869,0.1864,0.1859,0.1856,0.1853,0.1853,0.1855],"datasource":"radar","probability":[0.9572008475,0.9807121165,0.9934570829,0.9624462221],"description":"雨渐大，14分钟后转为中雨，不过一小时后雨会再次变小","status":"ok"},"primary":0}
     * server_time : 1596437285
     * unit : metric
     * timezone : Asia/Taipei
     * api_status : active
     * location : [25.1552,121.6544]
     * tzshift : 28800
     * api_version : v2.5
     * lang : zh_CN
     * status : ok
     */
    private ResultEntity result;
    private int server_time;
    private String unit;
    private String timezone;
    private String api_status;
    private List<Double> location;
    private int tzshift;
    private String api_version;
    private String lang;
    private String status;

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResultEntity getResult() {
        return result;
    }

    public int getServer_time() {
        return server_time;
    }

    public String getUnit() {
        return unit;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getApi_status() {
        return api_status;
    }

    public List<Double> getLocation() {
        return location;
    }

    public int getTzshift() {
        return tzshift;
    }

    public String getApi_version() {
        return api_version;
    }

    public String getLang() {
        return lang;
    }

    public String getStatus() {
        return status;
    }

    public class ResultEntity {
        /**
         * realtime : {"visibility":5,"air_quality":{"no2":0,"pm25":3,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":8},"description":{"usa":"","chn":"优"},"co":0},"dswrf":67.9,"pressure":98363.44,"precipitation":{"nearest":{"intensity":2,"distance":1,"status":"ok"},"local":{"intensity":0.1195,"datasource":"radar","status":"ok"}},"cloudrate":1,"temperature":26.16,"skycon":"LIGHT_RAIN","humidity":1,"apparent_temperature":26.6,"life_index":{"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":4,"desc":"温暖"}},"status":"ok","wind":{"speed":25.92,"direction":270}}
         * forecast_keypoint : 雨渐大，14分钟后转为中雨，不过一小时后雨会再次变小
         * daily : {"visibility":[{"date":"2020-08-03T00:00+08:00","min":2.22,"avg":6.86,"max":15.15},{"date":"2020-08-04T00:00+08:00","min":5.27,"avg":8.76,"max":15.17},{"date":"2020-08-05T00:00+08:00","min":5.6,"avg":10.16,"max":15.17},{"date":"2020-08-06T00:00+08:00","min":6.94,"avg":10.73,"max":15.17},{"date":"2020-08-07T00:00+08:00","min":6.8,"avg":10.88,"max":15.17}],"air_quality":{"pm25":[{"date":"2020-08-03T00:00+08:00","avg":4.6,"min":3,"max":6},{"date":"2020-08-04T00:00+08:00","avg":4.83,"min":3,"max":6},{"date":"2020-08-05T00:00+08:00","avg":4.54,"min":3,"max":6},{"date":"2020-08-06T00:00+08:00","avg":6.92,"min":6,"max":10},{"date":"2020-08-07T00:00+08:00","avg":9.71,"min":7,"max":12}],"aqi":[{"date":"2020-08-03T00:00+08:00","avg":{"usa":7.5,"chn":7.5},"min":{"usa":7,"chn":7},"max":{"usa":9,"chn":9}},{"date":"2020-08-04T00:00+08:00","avg":{"usa":7.62,"chn":7.62},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-05T00:00+08:00","avg":{"usa":7.54,"chn":7.54},"min":{"usa":7,"chn":7},"max":{"usa":9,"chn":9}},{"date":"2020-08-06T00:00+08:00","avg":{"usa":9.21,"chn":9.21},"min":{"usa":8,"chn":8},"max":{"usa":14,"chn":14}},{"date":"2020-08-07T00:00+08:00","avg":{"usa":13.42,"chn":13.42},"min":{"usa":10,"chn":10},"max":{"usa":16,"chn":16}}]},"pressure":[{"date":"2020-08-03T00:00+08:00","min":98363.24,"avg":98501.65,"max":99003.48},{"date":"2020-08-04T00:00+08:00","min":98572.84,"avg":98858.04,"max":99274.11},{"date":"2020-08-05T00:00+08:00","min":99163.48,"avg":99282.98,"max":99483.48},{"date":"2020-08-06T00:00+08:00","min":99262.25,"avg":99415.01,"max":99563.48},{"date":"2020-08-07T00:00+08:00","min":99083.48,"avg":99265.8,"max":99452.88}],"dswrf":[{"date":"2020-08-03T00:00+08:00","min":0,"avg":23.7,"max":77},{"date":"2020-08-04T00:00+08:00","min":0,"avg":195.4,"max":577},{"date":"2020-08-05T00:00+08:00","min":0,"avg":280.8,"max":749.2},{"date":"2020-08-06T00:00+08:00","min":0,"avg":298.5,"max":769.5},{"date":"2020-08-07T00:00+08:00","min":0,"avg":319.2,"max":825.8}],"precipitation":[{"date":"2020-08-03T00:00+08:00","min":0,"avg":1.2008,"max":13.1944},{"date":"2020-08-04T00:00+08:00","min":0,"avg":0.2479,"max":2.3121},{"date":"2020-08-05T00:00+08:00","min":0,"avg":0.024,"max":0.2093},{"date":"2020-08-06T00:00+08:00","min":0,"avg":0,"max":0},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.0444,"max":0.5362}],"skycon_08h_20h":[{"date":"2020-08-03T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-06T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-07T00:00+08:00","value":"PARTLY_CLOUDY_DAY"}],"cloudrate":[{"date":"2020-08-03T00:00+08:00","min":0.96,"avg":1,"max":1},{"date":"2020-08-04T00:00+08:00","min":0.98,"avg":1,"max":1},{"date":"2020-08-05T00:00+08:00","min":0.76,"avg":0.96,"max":1},{"date":"2020-08-06T00:00+08:00","min":0.06,"avg":0.76,"max":1},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.59,"max":0.97}],"astro":[{"date":"2020-08-03T00:00+08:00","sunrise":{"time":"05:21"},"sunset":{"time":"18:37"}},{"date":"2020-08-04T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-05T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-06T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:35"}},{"date":"2020-08-07T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:34"}}],"skycon_20h_32h":[{"date":"2020-08-03T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"}],"temperature":[{"date":"2020-08-03T00:00+08:00","min":25,"avg":26.86,"max":27.39},{"date":"2020-08-04T00:00+08:00","min":26,"avg":27.86,"max":30},{"date":"2020-08-05T00:00+08:00","min":26,"avg":28.83,"max":31},{"date":"2020-08-06T00:00+08:00","min":26,"avg":28.4,"max":31},{"date":"2020-08-07T00:00+08:00","min":26,"avg":28.46,"max":31}],"skycon":[{"date":"2020-08-03T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"}],"humidity":[{"date":"2020-08-03T00:00+08:00","min":0.79,"avg":0.84,"max":1},{"date":"2020-08-04T00:00+08:00","min":0.69,"avg":0.8,"max":0.89},{"date":"2020-08-05T00:00+08:00","min":0.63,"avg":0.76,"max":0.87},{"date":"2020-08-06T00:00+08:00","min":0.62,"avg":0.74,"max":0.82},{"date":"2020-08-07T00:00+08:00","min":0.64,"avg":0.74,"max":0.82}],"life_index":{"dressing":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"很热"}],"ultraviolet":[{"date":"2020-08-03T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-05T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-06T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"弱"}],"coldRisk":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"易发"}],"carWashing":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"较不适宜"}],"comfort":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"热"}]},"status":"ok","wind":[{"date":"2020-08-03T00:00+08:00","min":{"speed":7.72,"direction":50.79},"avg":{"speed":19.17,"direction":283.59},"max":{"speed":35.16,"direction":261.93}},{"date":"2020-08-04T00:00+08:00","min":{"speed":1.13,"direction":103.45},"avg":{"speed":4.87,"direction":113.81},"max":{"speed":9.43,"direction":162.57}},{"date":"2020-08-05T00:00+08:00","min":{"speed":1.89,"direction":167.72},"avg":{"speed":8.36,"direction":136.26},"max":{"speed":19.15,"direction":144.96}},{"date":"2020-08-06T00:00+08:00","min":{"speed":0.43,"direction":264.18},"avg":{"speed":10.14,"direction":127.38},"max":{"speed":19.16,"direction":156.36}},{"date":"2020-08-07T00:00+08:00","min":{"speed":0.73,"direction":339.19},"avg":{"speed":6.06,"direction":169.78},"max":{"speed":11.57,"direction":174.62}}]}
         * hourly : {"precipitation":[{"datetime":"2020-08-03T14:00+08:00","value":0.3722},{"datetime":"2020-08-03T15:00+08:00","value":2.9975},{"datetime":"2020-08-03T16:00+08:00","value":1.1469},{"datetime":"2020-08-03T17:00+08:00","value":4.6699},{"datetime":"2020-08-03T18:00+08:00","value":1.9772},{"datetime":"2020-08-03T19:00+08:00","value":0.3692},{"datetime":"2020-08-03T20:00+08:00","value":0.0534},{"datetime":"2020-08-03T21:00+08:00","value":0.1899},{"datetime":"2020-08-03T22:00+08:00","value":0.2316},{"datetime":"2020-08-03T23:00+08:00","value":0},{"datetime":"2020-08-04T00:00+08:00","value":0},{"datetime":"2020-08-04T01:00+08:00","value":0},{"datetime":"2020-08-04T02:00+08:00","value":0},{"datetime":"2020-08-04T03:00+08:00","value":0},{"datetime":"2020-08-04T04:00+08:00","value":0},{"datetime":"2020-08-04T05:00+08:00","value":0},{"datetime":"2020-08-04T06:00+08:00","value":0},{"datetime":"2020-08-04T07:00+08:00","value":0},{"datetime":"2020-08-04T08:00+08:00","value":0},{"datetime":"2020-08-04T09:00+08:00","value":0},{"datetime":"2020-08-04T10:00+08:00","value":0},{"datetime":"2020-08-04T11:00+08:00","value":0.0614},{"datetime":"2020-08-04T12:00+08:00","value":0.2218},{"datetime":"2020-08-04T13:00+08:00","value":1.2394},{"datetime":"2020-08-04T14:00+08:00","value":2.3121},{"datetime":"2020-08-04T15:00+08:00","value":0.8649},{"datetime":"2020-08-04T16:00+08:00","value":0.3599},{"datetime":"2020-08-04T17:00+08:00","value":0.5713},{"datetime":"2020-08-04T18:00+08:00","value":0.2497},{"datetime":"2020-08-04T19:00+08:00","value":0.0702},{"datetime":"2020-08-04T20:00+08:00","value":0},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":0},{"datetime":"2020-08-05T08:00+08:00","value":0},{"datetime":"2020-08-05T09:00+08:00","value":0},{"datetime":"2020-08-05T10:00+08:00","value":0},{"datetime":"2020-08-05T11:00+08:00","value":0},{"datetime":"2020-08-05T12:00+08:00","value":0},{"datetime":"2020-08-05T13:00+08:00","value":0.0536}],"cloudrate":[{"datetime":"2020-08-03T14:00+08:00","value":1},{"datetime":"2020-08-03T15:00+08:00","value":1},{"datetime":"2020-08-03T16:00+08:00","value":1},{"datetime":"2020-08-03T17:00+08:00","value":1},{"datetime":"2020-08-03T18:00+08:00","value":1},{"datetime":"2020-08-03T19:00+08:00","value":1},{"datetime":"2020-08-03T20:00+08:00","value":1},{"datetime":"2020-08-03T21:00+08:00","value":1},{"datetime":"2020-08-03T22:00+08:00","value":1},{"datetime":"2020-08-03T23:00+08:00","value":1},{"datetime":"2020-08-04T00:00+08:00","value":1},{"datetime":"2020-08-04T01:00+08:00","value":1},{"datetime":"2020-08-04T02:00+08:00","value":1},{"datetime":"2020-08-04T03:00+08:00","value":1},{"datetime":"2020-08-04T04:00+08:00","value":1},{"datetime":"2020-08-04T05:00+08:00","value":1},{"datetime":"2020-08-04T06:00+08:00","value":1},{"datetime":"2020-08-04T07:00+08:00","value":1},{"datetime":"2020-08-04T08:00+08:00","value":1},{"datetime":"2020-08-04T09:00+08:00","value":1},{"datetime":"2020-08-04T10:00+08:00","value":1},{"datetime":"2020-08-04T11:00+08:00","value":1},{"datetime":"2020-08-04T12:00+08:00","value":1},{"datetime":"2020-08-04T13:00+08:00","value":0.98},{"datetime":"2020-08-04T14:00+08:00","value":1},{"datetime":"2020-08-04T15:00+08:00","value":1},{"datetime":"2020-08-04T16:00+08:00","value":1},{"datetime":"2020-08-04T17:00+08:00","value":1},{"datetime":"2020-08-04T18:00+08:00","value":1},{"datetime":"2020-08-04T19:00+08:00","value":1},{"datetime":"2020-08-04T20:00+08:00","value":1},{"datetime":"2020-08-04T21:00+08:00","value":1},{"datetime":"2020-08-04T22:00+08:00","value":1},{"datetime":"2020-08-04T23:00+08:00","value":1},{"datetime":"2020-08-05T00:00+08:00","value":1},{"datetime":"2020-08-05T01:00+08:00","value":1},{"datetime":"2020-08-05T02:00+08:00","value":1},{"datetime":"2020-08-05T03:00+08:00","value":1},{"datetime":"2020-08-05T04:00+08:00","value":1},{"datetime":"2020-08-05T05:00+08:00","value":1},{"datetime":"2020-08-05T06:00+08:00","value":1},{"datetime":"2020-08-05T07:00+08:00","value":1},{"datetime":"2020-08-05T08:00+08:00","value":1},{"datetime":"2020-08-05T09:00+08:00","value":1},{"datetime":"2020-08-05T10:00+08:00","value":1},{"datetime":"2020-08-05T11:00+08:00","value":1},{"datetime":"2020-08-05T12:00+08:00","value":1},{"datetime":"2020-08-05T13:00+08:00","value":1}],"visibility":[{"datetime":"2020-08-03T14:00+08:00","value":5},{"datetime":"2020-08-03T15:00+08:00","value":5.93},{"datetime":"2020-08-03T16:00+08:00","value":6.05},{"datetime":"2020-08-03T17:00+08:00","value":6.39},{"datetime":"2020-08-03T18:00+08:00","value":7.87},{"datetime":"2020-08-03T19:00+08:00","value":7.91},{"datetime":"2020-08-03T20:00+08:00","value":7.7},{"datetime":"2020-08-03T21:00+08:00","value":7.47},{"datetime":"2020-08-03T22:00+08:00","value":7.07},{"datetime":"2020-08-03T23:00+08:00","value":7.23},{"datetime":"2020-08-04T00:00+08:00","value":7.18},{"datetime":"2020-08-04T01:00+08:00","value":7},{"datetime":"2020-08-04T02:00+08:00","value":6.9},{"datetime":"2020-08-04T03:00+08:00","value":7.23},{"datetime":"2020-08-04T04:00+08:00","value":7.5},{"datetime":"2020-08-04T05:00+08:00","value":7.74},{"datetime":"2020-08-04T06:00+08:00","value":7.82},{"datetime":"2020-08-04T07:00+08:00","value":8.6},{"datetime":"2020-08-04T08:00+08:00","value":10.58},{"datetime":"2020-08-04T09:00+08:00","value":13.1},{"datetime":"2020-08-04T10:00+08:00","value":15.17},{"datetime":"2020-08-04T11:00+08:00","value":15.17},{"datetime":"2020-08-04T12:00+08:00","value":15.13},{"datetime":"2020-08-04T13:00+08:00","value":13.88},{"datetime":"2020-08-04T14:00+08:00","value":11.81},{"datetime":"2020-08-04T15:00+08:00","value":9.61},{"datetime":"2020-08-04T16:00+08:00","value":7.19},{"datetime":"2020-08-04T17:00+08:00","value":6.09},{"datetime":"2020-08-04T18:00+08:00","value":5.47},{"datetime":"2020-08-04T19:00+08:00","value":5.27},{"datetime":"2020-08-04T20:00+08:00","value":5.61},{"datetime":"2020-08-04T21:00+08:00","value":5.57},{"datetime":"2020-08-04T22:00+08:00","value":5.28},{"datetime":"2020-08-04T23:00+08:00","value":5.44},{"datetime":"2020-08-05T00:00+08:00","value":5.6},{"datetime":"2020-08-05T01:00+08:00","value":5.73},{"datetime":"2020-08-05T02:00+08:00","value":5.9},{"datetime":"2020-08-05T03:00+08:00","value":6.08},{"datetime":"2020-08-05T04:00+08:00","value":6.14},{"datetime":"2020-08-05T05:00+08:00","value":6.45},{"datetime":"2020-08-05T06:00+08:00","value":7.13},{"datetime":"2020-08-05T07:00+08:00","value":8.29},{"datetime":"2020-08-05T08:00+08:00","value":10.43},{"datetime":"2020-08-05T09:00+08:00","value":13.65},{"datetime":"2020-08-05T10:00+08:00","value":15.17},{"datetime":"2020-08-05T11:00+08:00","value":15.17},{"datetime":"2020-08-05T12:00+08:00","value":15.17},{"datetime":"2020-08-05T13:00+08:00","value":15.17}],"temperature":[{"datetime":"2020-08-03T14:00+08:00","value":26.16},{"datetime":"2020-08-03T15:00+08:00","value":26.47},{"datetime":"2020-08-03T16:00+08:00","value":26.77},{"datetime":"2020-08-03T17:00+08:00","value":27.08},{"datetime":"2020-08-03T18:00+08:00","value":27.39},{"datetime":"2020-08-03T19:00+08:00","value":26.69},{"datetime":"2020-08-03T20:00+08:00","value":27},{"datetime":"2020-08-03T21:00+08:00","value":27},{"datetime":"2020-08-03T22:00+08:00","value":27},{"datetime":"2020-08-03T23:00+08:00","value":27},{"datetime":"2020-08-04T00:00+08:00","value":27},{"datetime":"2020-08-04T01:00+08:00","value":27},{"datetime":"2020-08-04T02:00+08:00","value":27},{"datetime":"2020-08-04T03:00+08:00","value":27},{"datetime":"2020-08-04T04:00+08:00","value":27},{"datetime":"2020-08-04T05:00+08:00","value":26.4},{"datetime":"2020-08-04T06:00+08:00","value":27.6},{"datetime":"2020-08-04T07:00+08:00","value":28.6},{"datetime":"2020-08-04T08:00+08:00","value":28.8},{"datetime":"2020-08-04T09:00+08:00","value":29.5},{"datetime":"2020-08-04T10:00+08:00","value":29.6},{"datetime":"2020-08-04T11:00+08:00","value":29.7},{"datetime":"2020-08-04T12:00+08:00","value":29.8},{"datetime":"2020-08-04T13:00+08:00","value":29.6},{"datetime":"2020-08-04T14:00+08:00","value":30},{"datetime":"2020-08-04T15:00+08:00","value":28.67},{"datetime":"2020-08-04T16:00+08:00","value":28.23},{"datetime":"2020-08-04T17:00+08:00","value":27.79},{"datetime":"2020-08-04T18:00+08:00","value":27.35},{"datetime":"2020-08-04T19:00+08:00","value":26.97},{"datetime":"2020-08-04T20:00+08:00","value":26.58},{"datetime":"2020-08-04T21:00+08:00","value":26.34},{"datetime":"2020-08-04T22:00+08:00","value":26},{"datetime":"2020-08-04T23:00+08:00","value":26.04},{"datetime":"2020-08-05T00:00+08:00","value":26},{"datetime":"2020-08-05T01:00+08:00","value":26},{"datetime":"2020-08-05T02:00+08:00","value":26.02},{"datetime":"2020-08-05T03:00+08:00","value":26.52},{"datetime":"2020-08-05T04:00+08:00","value":27.04},{"datetime":"2020-08-05T05:00+08:00","value":27.56},{"datetime":"2020-08-05T06:00+08:00","value":28.13},{"datetime":"2020-08-05T07:00+08:00","value":28.78},{"datetime":"2020-08-05T08:00+08:00","value":29.44},{"datetime":"2020-08-05T09:00+08:00","value":30.08},{"datetime":"2020-08-05T10:00+08:00","value":30.76},{"datetime":"2020-08-05T11:00+08:00","value":30.96},{"datetime":"2020-08-05T12:00+08:00","value":31},{"datetime":"2020-08-05T13:00+08:00","value":31}],"skycon":[{"datetime":"2020-08-03T14:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T15:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-03T16:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-03T17:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-03T18:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-03T19:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-03T21:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T22:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T11:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T13:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T14:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T15:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T16:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T17:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T18:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T19:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T12:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T13:00+08:00","value":"CLOUDY"}],"description":"中雨，今天晚间20点钟后雨停，转阴，其后小雨","humidity":[{"datetime":"2020-08-03T14:00+08:00","value":1},{"datetime":"2020-08-03T15:00+08:00","value":0.86},{"datetime":"2020-08-03T16:00+08:00","value":0.85},{"datetime":"2020-08-03T17:00+08:00","value":0.84},{"datetime":"2020-08-03T18:00+08:00","value":0.79},{"datetime":"2020-08-03T19:00+08:00","value":0.79},{"datetime":"2020-08-03T20:00+08:00","value":0.8},{"datetime":"2020-08-03T21:00+08:00","value":0.8},{"datetime":"2020-08-03T22:00+08:00","value":0.81},{"datetime":"2020-08-03T23:00+08:00","value":0.81},{"datetime":"2020-08-04T00:00+08:00","value":0.81},{"datetime":"2020-08-04T01:00+08:00","value":0.82},{"datetime":"2020-08-04T02:00+08:00","value":0.82},{"datetime":"2020-08-04T03:00+08:00","value":0.81},{"datetime":"2020-08-04T04:00+08:00","value":0.8},{"datetime":"2020-08-04T05:00+08:00","value":0.8},{"datetime":"2020-08-04T06:00+08:00","value":0.79},{"datetime":"2020-08-04T07:00+08:00","value":0.78},{"datetime":"2020-08-04T08:00+08:00","value":0.74},{"datetime":"2020-08-04T09:00+08:00","value":0.72},{"datetime":"2020-08-04T10:00+08:00","value":0.7},{"datetime":"2020-08-04T11:00+08:00","value":0.69},{"datetime":"2020-08-04T12:00+08:00","value":0.7},{"datetime":"2020-08-04T13:00+08:00","value":0.71},{"datetime":"2020-08-04T14:00+08:00","value":0.73},{"datetime":"2020-08-04T15:00+08:00","value":0.76},{"datetime":"2020-08-04T16:00+08:00","value":0.81},{"datetime":"2020-08-04T17:00+08:00","value":0.85},{"datetime":"2020-08-04T18:00+08:00","value":0.88},{"datetime":"2020-08-04T19:00+08:00","value":0.89},{"datetime":"2020-08-04T20:00+08:00","value":0.87},{"datetime":"2020-08-04T21:00+08:00","value":0.87},{"datetime":"2020-08-04T22:00+08:00","value":0.89},{"datetime":"2020-08-04T23:00+08:00","value":0.88},{"datetime":"2020-08-05T00:00+08:00","value":0.87},{"datetime":"2020-08-05T01:00+08:00","value":0.86},{"datetime":"2020-08-05T02:00+08:00","value":0.86},{"datetime":"2020-08-05T03:00+08:00","value":0.85},{"datetime":"2020-08-05T04:00+08:00","value":0.85},{"datetime":"2020-08-05T05:00+08:00","value":0.84},{"datetime":"2020-08-05T06:00+08:00","value":0.81},{"datetime":"2020-08-05T07:00+08:00","value":0.78},{"datetime":"2020-08-05T08:00+08:00","value":0.75},{"datetime":"2020-08-05T09:00+08:00","value":0.71},{"datetime":"2020-08-05T10:00+08:00","value":0.68},{"datetime":"2020-08-05T11:00+08:00","value":0.64},{"datetime":"2020-08-05T12:00+08:00","value":0.63},{"datetime":"2020-08-05T13:00+08:00","value":0.63}],"air_quality":{"pm25":[{"datetime":"2020-08-03T14:00+08:00","value":3},{"datetime":"2020-08-03T15:00+08:00","value":3},{"datetime":"2020-08-03T16:00+08:00","value":4},{"datetime":"2020-08-03T17:00+08:00","value":4},{"datetime":"2020-08-03T18:00+08:00","value":4},{"datetime":"2020-08-03T19:00+08:00","value":5},{"datetime":"2020-08-03T20:00+08:00","value":5},{"datetime":"2020-08-03T21:00+08:00","value":6},{"datetime":"2020-08-03T22:00+08:00","value":6},{"datetime":"2020-08-03T23:00+08:00","value":6},{"datetime":"2020-08-04T00:00+08:00","value":6},{"datetime":"2020-08-04T01:00+08:00","value":6},{"datetime":"2020-08-04T02:00+08:00","value":6},{"datetime":"2020-08-04T03:00+08:00","value":6},{"datetime":"2020-08-04T04:00+08:00","value":5},{"datetime":"2020-08-04T05:00+08:00","value":5},{"datetime":"2020-08-04T06:00+08:00","value":5},{"datetime":"2020-08-04T07:00+08:00","value":4},{"datetime":"2020-08-04T08:00+08:00","value":5},{"datetime":"2020-08-04T09:00+08:00","value":5},{"datetime":"2020-08-04T10:00+08:00","value":4},{"datetime":"2020-08-04T11:00+08:00","value":4},{"datetime":"2020-08-04T12:00+08:00","value":4},{"datetime":"2020-08-04T13:00+08:00","value":3},{"datetime":"2020-08-04T14:00+08:00","value":3},{"datetime":"2020-08-04T15:00+08:00","value":4},{"datetime":"2020-08-04T16:00+08:00","value":4},{"datetime":"2020-08-04T17:00+08:00","value":4},{"datetime":"2020-08-04T18:00+08:00","value":5},{"datetime":"2020-08-04T19:00+08:00","value":5},{"datetime":"2020-08-04T20:00+08:00","value":5},{"datetime":"2020-08-04T21:00+08:00","value":6},{"datetime":"2020-08-04T22:00+08:00","value":6},{"datetime":"2020-08-04T23:00+08:00","value":6},{"datetime":"2020-08-05T00:00+08:00","value":6},{"datetime":"2020-08-05T01:00+08:00","value":6},{"datetime":"2020-08-05T02:00+08:00","value":6},{"datetime":"2020-08-05T03:00+08:00","value":6},{"datetime":"2020-08-05T04:00+08:00","value":5},{"datetime":"2020-08-05T05:00+08:00","value":5},{"datetime":"2020-08-05T06:00+08:00","value":6},{"datetime":"2020-08-05T07:00+08:00","value":5},{"datetime":"2020-08-05T08:00+08:00","value":5},{"datetime":"2020-08-05T09:00+08:00","value":5},{"datetime":"2020-08-05T10:00+08:00","value":4},{"datetime":"2020-08-05T11:00+08:00","value":4},{"datetime":"2020-08-05T12:00+08:00","value":4},{"datetime":"2020-08-05T13:00+08:00","value":3}],"aqi":[{"datetime":"2020-08-03T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T15:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T18:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T00:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T03:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T06:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T07:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T08:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T09:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T10:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T11:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T12:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T13:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T14:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T15:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T16:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T17:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T18:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T19:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T20:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T22:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T23:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T00:00+08:00","value":{"usa":9,"chn":9}},{"datetime":"2020-08-05T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T03:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T06:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T08:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T09:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T12:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T13:00+08:00","value":{"usa":8,"chn":8}}]},"pressure":[{"datetime":"2020-08-03T14:00+08:00","value":98363.43552},{"datetime":"2020-08-03T15:00+08:00","value":98363.24352},{"datetime":"2020-08-03T16:00+08:00","value":98363.24352},{"datetime":"2020-08-03T17:00+08:00","value":98393.87648},{"datetime":"2020-08-03T18:00+08:00","value":98424.27648},{"datetime":"2020-08-03T19:00+08:00","value":98523.47648},{"datetime":"2020-08-03T20:00+08:00","value":98553.87648},{"datetime":"2020-08-03T21:00+08:00","value":98603.28448},{"datetime":"2020-08-03T22:00+08:00","value":98713.87648},{"datetime":"2020-08-03T23:00+08:00","value":98713.87648},{"datetime":"2020-08-04T00:00+08:00","value":98713.87648},{"datetime":"2020-08-04T01:00+08:00","value":98633.87648},{"datetime":"2020-08-04T02:00+08:00","value":98572.84352},{"datetime":"2020-08-04T03:00+08:00","value":98603.47648},{"datetime":"2020-08-04T04:00+08:00","value":98603.47648},{"datetime":"2020-08-04T05:00+08:00","value":98652.84352},{"datetime":"2020-08-04T06:00+08:00","value":98732.84352},{"datetime":"2020-08-04T07:00+08:00","value":98763.47648},{"datetime":"2020-08-04T08:00+08:00","value":98793.87648},{"datetime":"2020-08-04T09:00+08:00","value":98812.84352},{"datetime":"2020-08-04T10:00+08:00","value":98843.47648},{"datetime":"2020-08-04T11:00+08:00","value":98843.47648},{"datetime":"2020-08-04T12:00+08:00","value":98892.84352},{"datetime":"2020-08-04T13:00+08:00","value":98893.07648},{"datetime":"2020-08-04T14:00+08:00","value":98892.88448},{"datetime":"2020-08-04T15:00+08:00","value":98862.25152},{"datetime":"2020-08-04T16:00+08:00","value":98862.25152},{"datetime":"2020-08-04T17:00+08:00","value":98892.88448},{"datetime":"2020-08-04T18:00+08:00","value":98904.50944},{"datetime":"2020-08-04T19:00+08:00","value":99015.1424},{"datetime":"2020-08-04T20:00+08:00","value":99095.1424},{"datetime":"2020-08-04T21:00+08:00","value":99163.47648},{"datetime":"2020-08-04T22:00+08:00","value":99274.10944},{"datetime":"2020-08-04T23:00+08:00","value":99274.10944},{"datetime":"2020-08-05T00:00+08:00","value":99243.47648},{"datetime":"2020-08-05T01:00+08:00","value":99163.47648},{"datetime":"2020-08-05T02:00+08:00","value":99163.47648},{"datetime":"2020-08-05T03:00+08:00","value":99163.47648},{"datetime":"2020-08-05T04:00+08:00","value":99163.47648},{"datetime":"2020-08-05T05:00+08:00","value":99175.10144},{"datetime":"2020-08-05T06:00+08:00","value":99243.47648},{"datetime":"2020-08-05T07:00+08:00","value":99285.7344},{"datetime":"2020-08-05T08:00+08:00","value":99323.47648},{"datetime":"2020-08-05T09:00+08:00","value":99323.47648},{"datetime":"2020-08-05T10:00+08:00","value":99403.47648},{"datetime":"2020-08-05T11:00+08:00","value":99403.47648},{"datetime":"2020-08-05T12:00+08:00","value":99323.47648},{"datetime":"2020-08-05T13:00+08:00","value":99311.85152}],"dswrf":[{"datetime":"2020-08-03T14:00+08:00","value":67.89936},{"datetime":"2020-08-03T15:00+08:00","value":46.23424},{"datetime":"2020-08-03T16:00+08:00","value":35.28224},{"datetime":"2020-08-03T17:00+08:00","value":25.28224},{"datetime":"2020-08-03T18:00+08:00","value":22.90624},{"datetime":"2020-08-03T19:00+08:00","value":21.45312},{"datetime":"2020-08-03T20:00+08:00","value":17.741856},{"datetime":"2020-08-03T21:00+08:00","value":0},{"datetime":"2020-08-03T22:00+08:00","value":0},{"datetime":"2020-08-03T23:00+08:00","value":0},{"datetime":"2020-08-04T00:00+08:00","value":0},{"datetime":"2020-08-04T01:00+08:00","value":0},{"datetime":"2020-08-04T02:00+08:00","value":0},{"datetime":"2020-08-04T03:00+08:00","value":0},{"datetime":"2020-08-04T04:00+08:00","value":0},{"datetime":"2020-08-04T05:00+08:00","value":0},{"datetime":"2020-08-04T06:00+08:00","value":0},{"datetime":"2020-08-04T07:00+08:00","value":30.380512},{"datetime":"2020-08-04T08:00+08:00","value":79.908736},{"datetime":"2020-08-04T09:00+08:00","value":464.87584},{"datetime":"2020-08-04T10:00+08:00","value":570.592},{"datetime":"2020-08-04T11:00+08:00","value":553.097504},{"datetime":"2020-08-04T12:00+08:00","value":527.884032},{"datetime":"2020-08-04T13:00+08:00","value":499.671808},{"datetime":"2020-08-04T14:00+08:00","value":577.041504},{"datetime":"2020-08-04T15:00+08:00","value":431.5648},{"datetime":"2020-08-04T16:00+08:00","value":311.04992},{"datetime":"2020-08-04T17:00+08:00","value":223.38816},{"datetime":"2020-08-04T18:00+08:00","value":170.9984},{"datetime":"2020-08-04T19:00+08:00","value":136.179744},{"datetime":"2020-08-04T20:00+08:00","value":113.840928},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":26.376224},{"datetime":"2020-08-05T08:00+08:00","value":67.0448},{"datetime":"2020-08-05T09:00+08:00","value":470.89056},{"datetime":"2020-08-05T10:00+08:00","value":564.99584},{"datetime":"2020-08-05T11:00+08:00","value":652.47824},{"datetime":"2020-08-05T12:00+08:00","value":715.986976},{"datetime":"2020-08-05T13:00+08:00","value":743.883648}],"status":"ok","wind":[{"datetime":"2020-08-03T14:00+08:00","speed":25.92,"direction":270},{"datetime":"2020-08-03T15:00+08:00","speed":35.16,"direction":261.93},{"datetime":"2020-08-03T16:00+08:00","speed":32.6,"direction":259.51},{"datetime":"2020-08-03T17:00+08:00","speed":24.99,"direction":251.56},{"datetime":"2020-08-03T18:00+08:00","speed":21.12,"direction":233.81},{"datetime":"2020-08-03T19:00+08:00","speed":17.78,"direction":231.48},{"datetime":"2020-08-03T20:00+08:00","speed":16.05,"direction":227.88},{"datetime":"2020-08-03T21:00+08:00","speed":13.98,"direction":198.27},{"datetime":"2020-08-03T22:00+08:00","speed":11.23,"direction":177.38},{"datetime":"2020-08-03T23:00+08:00","speed":8.53,"direction":166.3},{"datetime":"2020-08-04T00:00+08:00","speed":9.43,"direction":162.57},{"datetime":"2020-08-04T01:00+08:00","speed":8.34,"direction":154.95},{"datetime":"2020-08-04T02:00+08:00","speed":6.41,"direction":156.88},{"datetime":"2020-08-04T03:00+08:00","speed":4.48,"direction":161.03},{"datetime":"2020-08-04T04:00+08:00","speed":4.62,"direction":155.76},{"datetime":"2020-08-04T05:00+08:00","speed":2.55,"direction":166.65},{"datetime":"2020-08-04T06:00+08:00","speed":1.17,"direction":66.3},{"datetime":"2020-08-04T07:00+08:00","speed":1.13,"direction":103.45},{"datetime":"2020-08-04T08:00+08:00","speed":1.35,"direction":40.32},{"datetime":"2020-08-04T09:00+08:00","speed":5.69,"direction":22.37},{"datetime":"2020-08-04T10:00+08:00","speed":5.49,"direction":18.32},{"datetime":"2020-08-04T11:00+08:00","speed":5.38,"direction":30.92},{"datetime":"2020-08-04T12:00+08:00","speed":2.58,"direction":22.23},{"datetime":"2020-08-04T13:00+08:00","speed":6.48,"direction":100.41},{"datetime":"2020-08-04T14:00+08:00","speed":4.5,"direction":69.07},{"datetime":"2020-08-04T15:00+08:00","speed":5.67,"direction":105.78},{"datetime":"2020-08-04T16:00+08:00","speed":8.5,"direction":137.81},{"datetime":"2020-08-04T17:00+08:00","speed":8.7,"direction":149.57},{"datetime":"2020-08-04T18:00+08:00","speed":5.22,"direction":162.89},{"datetime":"2020-08-04T19:00+08:00","speed":3.16,"direction":77.64},{"datetime":"2020-08-04T20:00+08:00","speed":1.81,"direction":16.43},{"datetime":"2020-08-04T21:00+08:00","speed":3.95,"direction":311.57},{"datetime":"2020-08-04T22:00+08:00","speed":4.99,"direction":312.04},{"datetime":"2020-08-04T23:00+08:00","speed":5.36,"direction":351.75},{"datetime":"2020-08-05T00:00+08:00","speed":4.87,"direction":359.58},{"datetime":"2020-08-05T01:00+08:00","speed":2.89,"direction":34.46},{"datetime":"2020-08-05T02:00+08:00","speed":3.03,"direction":85.65},{"datetime":"2020-08-05T03:00+08:00","speed":1.89,"direction":167.72},{"datetime":"2020-08-05T04:00+08:00","speed":3.38,"direction":195.19},{"datetime":"2020-08-05T05:00+08:00","speed":4.03,"direction":184.44},{"datetime":"2020-08-05T06:00+08:00","speed":3.73,"direction":154.71},{"datetime":"2020-08-05T07:00+08:00","speed":3.89,"direction":132.1},{"datetime":"2020-08-05T08:00+08:00","speed":3.23,"direction":123.96},{"datetime":"2020-08-05T09:00+08:00","speed":3.48,"direction":133.35},{"datetime":"2020-08-05T10:00+08:00","speed":4.22,"direction":126.16},{"datetime":"2020-08-05T11:00+08:00","speed":5.02,"direction":105.38},{"datetime":"2020-08-05T12:00+08:00","speed":5.42,"direction":98.66},{"datetime":"2020-08-05T13:00+08:00","speed":5.65,"direction":99.98}]}
         * minutely : {"precipitation":[0.1195,0.1211,0.125,0.1316,0.1406,0.1516,0.1642,0.1779,0.1924,0.2073,0.2222,0.2365,0.25,0.2623,0.2732,0.2829,0.2912,0.2982,0.3038,0.308,0.3109,0.3124,0.3125,0.3112,0.309,0.3063,0.3036,0.3013,0.2999,0.2999,0.3017,0.3057,0.3125,0.3223,0.3346,0.3487,0.3638,0.3793,0.3945,0.4086,0.421,0.4308,0.4375,0.4405,0.4401,0.4368,0.4311,0.4235,0.4145,0.4047,0.3945,0.3844,0.375,0.3666,0.3592,0.3525,0.3464,0.3408,0.3354,0.33],"precipitation_2h":[0.1195,0.1211,0.125,0.1316,0.1406,0.1516,0.1642,0.1779,0.1924,0.2073,0.2222,0.2365,0.25,0.2623,0.2732,0.2829,0.2912,0.2982,0.3038,0.308,0.3109,0.3124,0.3125,0.3112,0.309,0.3063,0.3036,0.3013,0.2999,0.2999,0.3017,0.3057,0.3125,0.3223,0.3346,0.3487,0.3638,0.3793,0.3945,0.4086,0.421,0.4308,0.4375,0.4405,0.4401,0.4368,0.4311,0.4235,0.4145,0.4047,0.3945,0.3844,0.375,0.3666,0.3592,0.3525,0.3464,0.3408,0.3354,0.33,0.3245,0.3188,0.3125,0.3056,0.2983,0.2908,0.2832,0.2759,0.269,0.2627,0.2573,0.253,0.25,0.2484,0.2481,0.2486,0.2497,0.251,0.2522,0.2531,0.2532,0.2523,0.25,0.2461,0.2409,0.2347,0.2276,0.2202,0.2126,0.2053,0.1984,0.1924,0.1875,0.184,0.1817,0.1805,0.1803,0.1807,0.1817,0.1831,0.1846,0.1861,0.1875,0.1885,0.1892,0.1896,0.1898,0.1897,0.1895,0.1891,0.1886,0.1881,0.1875,0.1869,0.1864,0.1859,0.1856,0.1853,0.1853,0.1855],"datasource":"radar","probability":[0.9572008475,0.9807121165,0.9934570829,0.9624462221],"description":"雨渐大，14分钟后转为中雨，不过一小时后雨会再次变小","status":"ok"}
         * primary : 0
         */
        private RealtimeEntity realtime;
        private String forecast_keypoint;
        private DailyEntity daily;
        private HourlyEntity hourly;
        private MinutelyEntity minutely;
        private int primary;

        public void setRealtime(RealtimeEntity realtime) {
            this.realtime = realtime;
        }

        public void setForecast_keypoint(String forecast_keypoint) {
            this.forecast_keypoint = forecast_keypoint;
        }

        public void setDaily(DailyEntity daily) {
            this.daily = daily;
        }

        public void setHourly(HourlyEntity hourly) {
            this.hourly = hourly;
        }

        public void setMinutely(MinutelyEntity minutely) {
            this.minutely = minutely;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public RealtimeEntity getRealtime() {
            return realtime;
        }

        public String getForecast_keypoint() {
            return forecast_keypoint;
        }

        public DailyEntity getDaily() {
            return daily;
        }

        public HourlyEntity getHourly() {
            return hourly;
        }

        public MinutelyEntity getMinutely() {
            return minutely;
        }

        public int getPrimary() {
            return primary;
        }

        public class RealtimeEntity {
            /**
             * visibility : 5.0
             * air_quality : {"no2":0,"pm25":3,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":8},"description":{"usa":"","chn":"优"},"co":0}
             * dswrf : 67.9
             * pressure : 98363.44
             * precipitation : {"nearest":{"intensity":2,"distance":1,"status":"ok"},"local":{"intensity":0.1195,"datasource":"radar","status":"ok"}}
             * cloudrate : 1.0
             * temperature : 26.16
             * skycon : LIGHT_RAIN
             * humidity : 1.0
             * apparent_temperature : 26.6
             * life_index : {"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":4,"desc":"温暖"}}
             * status : ok
             * wind : {"speed":25.92,"direction":270}
             */
            private double visibility;
            private Air_qualityEntity air_quality;
            private double dswrf;
            private double pressure;
            private PrecipitationEntity precipitation;
            private double cloudrate;
            private double temperature;
            private String skycon;
            private double humidity;
            private double apparent_temperature;
            private Life_indexEntity life_index;
            private String status;
            private WindEntity wind;

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public void setAir_quality(Air_qualityEntity air_quality) {
                this.air_quality = air_quality;
            }

            public void setDswrf(double dswrf) {
                this.dswrf = dswrf;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public void setPrecipitation(PrecipitationEntity precipitation) {
                this.precipitation = precipitation;
            }

            public void setCloudrate(double cloudrate) {
                this.cloudrate = cloudrate;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public void setSkycon(String skycon) {
                this.skycon = skycon;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public void setApparent_temperature(double apparent_temperature) {
                this.apparent_temperature = apparent_temperature;
            }

            public void setLife_index(Life_indexEntity life_index) {
                this.life_index = life_index;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public void setWind(WindEntity wind) {
                this.wind = wind;
            }

            public double getVisibility() {
                return visibility;
            }

            public Air_qualityEntity getAir_quality() {
                return air_quality;
            }

            public double getDswrf() {
                return dswrf;
            }

            public double getPressure() {
                return pressure;
            }

            public PrecipitationEntity getPrecipitation() {
                return precipitation;
            }

            public double getCloudrate() {
                return cloudrate;
            }

            public double getTemperature() {
                return temperature;
            }

            public String getSkycon() {
                return skycon;
            }

            public double getHumidity() {
                return humidity;
            }

            public double getApparent_temperature() {
                return apparent_temperature;
            }

            public Life_indexEntity getLife_index() {
                return life_index;
            }

            public String getStatus() {
                return status;
            }

            public WindEntity getWind() {
                return wind;
            }

            public class Air_qualityEntity {
                /**
                 * no2 : 0
                 * pm25 : 3
                 * o3 : 0
                 * so2 : 0
                 * pm10 : 0
                 * aqi : {"usa":0,"chn":8}
                 * description : {"usa":"","chn":"优"}
                 * co : 0
                 */
                private int no2;
                private int pm25;
                private int o3;
                private int so2;
                private int pm10;
                private AqiEntity aqi;
                private DescriptionEntity description;
                private int co;

                public void setNo2(int no2) {
                    this.no2 = no2;
                }

                public void setPm25(int pm25) {
                    this.pm25 = pm25;
                }

                public void setO3(int o3) {
                    this.o3 = o3;
                }

                public void setSo2(int so2) {
                    this.so2 = so2;
                }

                public void setPm10(int pm10) {
                    this.pm10 = pm10;
                }

                public void setAqi(AqiEntity aqi) {
                    this.aqi = aqi;
                }

                public void setDescription(DescriptionEntity description) {
                    this.description = description;
                }

                public void setCo(int co) {
                    this.co = co;
                }

                public int getNo2() {
                    return no2;
                }

                public int getPm25() {
                    return pm25;
                }

                public int getO3() {
                    return o3;
                }

                public int getSo2() {
                    return so2;
                }

                public int getPm10() {
                    return pm10;
                }

                public AqiEntity getAqi() {
                    return aqi;
                }

                public DescriptionEntity getDescription() {
                    return description;
                }

                public int getCo() {
                    return co;
                }

                public class AqiEntity {
                    /**
                     * usa : 0
                     * chn : 8
                     */
                    private int usa;
                    private int chn;

                    public void setUsa(int usa) {
                        this.usa = usa;
                    }

                    public void setChn(int chn) {
                        this.chn = chn;
                    }

                    public int getUsa() {
                        return usa;
                    }

                    public int getChn() {
                        return chn;
                    }
                }

                public class DescriptionEntity {
                    /**
                     * usa :
                     * chn : 优
                     */
                    private String usa;
                    private String chn;

                    public void setUsa(String usa) {
                        this.usa = usa;
                    }

                    public void setChn(String chn) {
                        this.chn = chn;
                    }

                    public String getUsa() {
                        return usa;
                    }

                    public String getChn() {
                        return chn;
                    }
                }
            }

            public class PrecipitationEntity {
                /**
                 * nearest : {"intensity":2,"distance":1,"status":"ok"}
                 * local : {"intensity":0.1195,"datasource":"radar","status":"ok"}
                 */
                private NearestEntity nearest;
                private LocalEntity local;

                public void setNearest(NearestEntity nearest) {
                    this.nearest = nearest;
                }

                public void setLocal(LocalEntity local) {
                    this.local = local;
                }

                public NearestEntity getNearest() {
                    return nearest;
                }

                public LocalEntity getLocal() {
                    return local;
                }

                public class NearestEntity {
                    /**
                     * intensity : 2.0
                     * distance : 1.0
                     * status : ok
                     */
                    private double intensity;
                    private double distance;
                    private String status;

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }

                    public void setDistance(double distance) {
                        this.distance = distance;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public double getDistance() {
                        return distance;
                    }

                    public String getStatus() {
                        return status;
                    }
                }

                public class LocalEntity {
                    /**
                     * intensity : 0.1195
                     * datasource : radar
                     * status : ok
                     */
                    private double intensity;
                    private String datasource;
                    private String status;

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }

                    public void setDatasource(String datasource) {
                        this.datasource = datasource;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public String getDatasource() {
                        return datasource;
                    }

                    public String getStatus() {
                        return status;
                    }
                }
            }

            public class Life_indexEntity {
                /**
                 * ultraviolet : {"index":2,"desc":"很弱"}
                 * comfort : {"index":4,"desc":"温暖"}
                 */
                private UltravioletEntity ultraviolet;
                private ComfortEntity comfort;

                public void setUltraviolet(UltravioletEntity ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public void setComfort(ComfortEntity comfort) {
                    this.comfort = comfort;
                }

                public UltravioletEntity getUltraviolet() {
                    return ultraviolet;
                }

                public ComfortEntity getComfort() {
                    return comfort;
                }

                public class UltravioletEntity {
                    /**
                     * index : 2.0
                     * desc : 很弱
                     */
                    private double index;
                    private String desc;

                    public void setIndex(double index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public double getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }

                public class ComfortEntity {
                    /**
                     * index : 4
                     * desc : 温暖
                     */
                    private int index;
                    private String desc;

                    public void setIndex(int index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public int getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }
            }

            public class WindEntity {
                /**
                 * speed : 25.92
                 * direction : 270.0
                 */
                private double speed;
                private double direction;

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }

                public double getSpeed() {
                    return speed;
                }

                public double getDirection() {
                    return direction;
                }
            }
        }

        public class DailyEntity {
            /**
             * visibility : [{"date":"2020-08-03T00:00+08:00","min":2.22,"avg":6.86,"max":15.15},{"date":"2020-08-04T00:00+08:00","min":5.27,"avg":8.76,"max":15.17},{"date":"2020-08-05T00:00+08:00","min":5.6,"avg":10.16,"max":15.17},{"date":"2020-08-06T00:00+08:00","min":6.94,"avg":10.73,"max":15.17},{"date":"2020-08-07T00:00+08:00","min":6.8,"avg":10.88,"max":15.17}]
             * air_quality : {"pm25":[{"date":"2020-08-03T00:00+08:00","avg":4.6,"min":3,"max":6},{"date":"2020-08-04T00:00+08:00","avg":4.83,"min":3,"max":6},{"date":"2020-08-05T00:00+08:00","avg":4.54,"min":3,"max":6},{"date":"2020-08-06T00:00+08:00","avg":6.92,"min":6,"max":10},{"date":"2020-08-07T00:00+08:00","avg":9.71,"min":7,"max":12}],"aqi":[{"date":"2020-08-03T00:00+08:00","avg":{"usa":7.5,"chn":7.5},"min":{"usa":7,"chn":7},"max":{"usa":9,"chn":9}},{"date":"2020-08-04T00:00+08:00","avg":{"usa":7.62,"chn":7.62},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-05T00:00+08:00","avg":{"usa":7.54,"chn":7.54},"min":{"usa":7,"chn":7},"max":{"usa":9,"chn":9}},{"date":"2020-08-06T00:00+08:00","avg":{"usa":9.21,"chn":9.21},"min":{"usa":8,"chn":8},"max":{"usa":14,"chn":14}},{"date":"2020-08-07T00:00+08:00","avg":{"usa":13.42,"chn":13.42},"min":{"usa":10,"chn":10},"max":{"usa":16,"chn":16}}]}
             * pressure : [{"date":"2020-08-03T00:00+08:00","min":98363.24,"avg":98501.65,"max":99003.48},{"date":"2020-08-04T00:00+08:00","min":98572.84,"avg":98858.04,"max":99274.11},{"date":"2020-08-05T00:00+08:00","min":99163.48,"avg":99282.98,"max":99483.48},{"date":"2020-08-06T00:00+08:00","min":99262.25,"avg":99415.01,"max":99563.48},{"date":"2020-08-07T00:00+08:00","min":99083.48,"avg":99265.8,"max":99452.88}]
             * dswrf : [{"date":"2020-08-03T00:00+08:00","min":0,"avg":23.7,"max":77},{"date":"2020-08-04T00:00+08:00","min":0,"avg":195.4,"max":577},{"date":"2020-08-05T00:00+08:00","min":0,"avg":280.8,"max":749.2},{"date":"2020-08-06T00:00+08:00","min":0,"avg":298.5,"max":769.5},{"date":"2020-08-07T00:00+08:00","min":0,"avg":319.2,"max":825.8}]
             * precipitation : [{"date":"2020-08-03T00:00+08:00","min":0,"avg":1.2008,"max":13.1944},{"date":"2020-08-04T00:00+08:00","min":0,"avg":0.2479,"max":2.3121},{"date":"2020-08-05T00:00+08:00","min":0,"avg":0.024,"max":0.2093},{"date":"2020-08-06T00:00+08:00","min":0,"avg":0,"max":0},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.0444,"max":0.5362}]
             * skycon_08h_20h : [{"date":"2020-08-03T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-06T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-07T00:00+08:00","value":"PARTLY_CLOUDY_DAY"}]
             * cloudrate : [{"date":"2020-08-03T00:00+08:00","min":0.96,"avg":1,"max":1},{"date":"2020-08-04T00:00+08:00","min":0.98,"avg":1,"max":1},{"date":"2020-08-05T00:00+08:00","min":0.76,"avg":0.96,"max":1},{"date":"2020-08-06T00:00+08:00","min":0.06,"avg":0.76,"max":1},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.59,"max":0.97}]
             * astro : [{"date":"2020-08-03T00:00+08:00","sunrise":{"time":"05:21"},"sunset":{"time":"18:37"}},{"date":"2020-08-04T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-05T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-06T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:35"}},{"date":"2020-08-07T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:34"}}]
             * skycon_20h_32h : [{"date":"2020-08-03T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"}]
             * temperature : [{"date":"2020-08-03T00:00+08:00","min":25,"avg":26.86,"max":27.39},{"date":"2020-08-04T00:00+08:00","min":26,"avg":27.86,"max":30},{"date":"2020-08-05T00:00+08:00","min":26,"avg":28.83,"max":31},{"date":"2020-08-06T00:00+08:00","min":26,"avg":28.4,"max":31},{"date":"2020-08-07T00:00+08:00","min":26,"avg":28.46,"max":31}]
             * skycon : [{"date":"2020-08-03T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"}]
             * humidity : [{"date":"2020-08-03T00:00+08:00","min":0.79,"avg":0.84,"max":1},{"date":"2020-08-04T00:00+08:00","min":0.69,"avg":0.8,"max":0.89},{"date":"2020-08-05T00:00+08:00","min":0.63,"avg":0.76,"max":0.87},{"date":"2020-08-06T00:00+08:00","min":0.62,"avg":0.74,"max":0.82},{"date":"2020-08-07T00:00+08:00","min":0.64,"avg":0.74,"max":0.82}]
             * life_index : {"dressing":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"很热"}],"ultraviolet":[{"date":"2020-08-03T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-05T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-06T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"弱"}],"coldRisk":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"易发"}],"carWashing":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"较不适宜"}],"comfort":[{"date":"2020-08-03T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"热"}]}
             * status : ok
             * wind : [{"date":"2020-08-03T00:00+08:00","min":{"speed":7.72,"direction":50.79},"avg":{"speed":19.17,"direction":283.59},"max":{"speed":35.16,"direction":261.93}},{"date":"2020-08-04T00:00+08:00","min":{"speed":1.13,"direction":103.45},"avg":{"speed":4.87,"direction":113.81},"max":{"speed":9.43,"direction":162.57}},{"date":"2020-08-05T00:00+08:00","min":{"speed":1.89,"direction":167.72},"avg":{"speed":8.36,"direction":136.26},"max":{"speed":19.15,"direction":144.96}},{"date":"2020-08-06T00:00+08:00","min":{"speed":0.43,"direction":264.18},"avg":{"speed":10.14,"direction":127.38},"max":{"speed":19.16,"direction":156.36}},{"date":"2020-08-07T00:00+08:00","min":{"speed":0.73,"direction":339.19},"avg":{"speed":6.06,"direction":169.78},"max":{"speed":11.57,"direction":174.62}}]
             */
            private List<VisibilityEntity> visibility;
            private Air_qualityEntity air_quality;
            private List<PressureEntity> pressure;
            private List<DswrfEntity> dswrf;
            private List<PrecipitationEntity> precipitation;
            private List<Skycon_08h_20hEntity> skycon_08h_20h;
            private List<CloudrateEntity> cloudrate;
            private List<AstroEntity> astro;
            private List<Skycon_20h_32hEntity> skycon_20h_32h;
            private List<TemperatureEntity> temperature;
            private List<SkyconEntity> skycon;
            private List<HumidityEntity> humidity;
            private Life_indexEntity life_index;
            private String status;
            private List<WindEntity> wind;

            public void setVisibility(List<VisibilityEntity> visibility) {
                this.visibility = visibility;
            }

            public void setAir_quality(Air_qualityEntity air_quality) {
                this.air_quality = air_quality;
            }

            public void setPressure(List<PressureEntity> pressure) {
                this.pressure = pressure;
            }

            public void setDswrf(List<DswrfEntity> dswrf) {
                this.dswrf = dswrf;
            }

            public void setPrecipitation(List<PrecipitationEntity> precipitation) {
                this.precipitation = precipitation;
            }

            public void setSkycon_08h_20h(List<Skycon_08h_20hEntity> skycon_08h_20h) {
                this.skycon_08h_20h = skycon_08h_20h;
            }

            public void setCloudrate(List<CloudrateEntity> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public void setAstro(List<AstroEntity> astro) {
                this.astro = astro;
            }

            public void setSkycon_20h_32h(List<Skycon_20h_32hEntity> skycon_20h_32h) {
                this.skycon_20h_32h = skycon_20h_32h;
            }

            public void setTemperature(List<TemperatureEntity> temperature) {
                this.temperature = temperature;
            }

            public void setSkycon(List<SkyconEntity> skycon) {
                this.skycon = skycon;
            }

            public void setHumidity(List<HumidityEntity> humidity) {
                this.humidity = humidity;
            }

            public void setLife_index(Life_indexEntity life_index) {
                this.life_index = life_index;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public void setWind(List<WindEntity> wind) {
                this.wind = wind;
            }

            public List<VisibilityEntity> getVisibility() {
                return visibility;
            }

            public Air_qualityEntity getAir_quality() {
                return air_quality;
            }

            public List<PressureEntity> getPressure() {
                return pressure;
            }

            public List<DswrfEntity> getDswrf() {
                return dswrf;
            }

            public List<PrecipitationEntity> getPrecipitation() {
                return precipitation;
            }

            public List<Skycon_08h_20hEntity> getSkycon_08h_20h() {
                return skycon_08h_20h;
            }

            public List<CloudrateEntity> getCloudrate() {
                return cloudrate;
            }

            public List<AstroEntity> getAstro() {
                return astro;
            }

            public List<Skycon_20h_32hEntity> getSkycon_20h_32h() {
                return skycon_20h_32h;
            }

            public List<TemperatureEntity> getTemperature() {
                return temperature;
            }

            public List<SkyconEntity> getSkycon() {
                return skycon;
            }

            public List<HumidityEntity> getHumidity() {
                return humidity;
            }

            public Life_indexEntity getLife_index() {
                return life_index;
            }

            public String getStatus() {
                return status;
            }

            public List<WindEntity> getWind() {
                return wind;
            }

            public class VisibilityEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * min : 2.22
                 * avg : 6.86
                 * max : 15.15
                 */
                private String date;
                private double min;
                private double avg;
                private double max;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public String getDate() {
                    return date;
                }

                public double getMin() {
                    return min;
                }

                public double getAvg() {
                    return avg;
                }

                public double getMax() {
                    return max;
                }
            }

            public class Air_qualityEntity {
                /**
                 * pm25 : [{"date":"2020-08-03T00:00+08:00","avg":4.6,"min":3,"max":6},{"date":"2020-08-04T00:00+08:00","avg":4.83,"min":3,"max":6},{"date":"2020-08-05T00:00+08:00","avg":4.54,"min":3,"max":6},{"date":"2020-08-06T00:00+08:00","avg":6.92,"min":6,"max":10},{"date":"2020-08-07T00:00+08:00","avg":9.71,"min":7,"max":12}]
                 * aqi : [{"date":"2020-08-03T00:00+08:00","avg":{"usa":7.5,"chn":7.5},"min":{"usa":7,"chn":7},"max":{"usa":9,"chn":9}},{"date":"2020-08-04T00:00+08:00","avg":{"usa":7.62,"chn":7.62},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-05T00:00+08:00","avg":{"usa":7.54,"chn":7.54},"min":{"usa":7,"chn":7},"max":{"usa":9,"chn":9}},{"date":"2020-08-06T00:00+08:00","avg":{"usa":9.21,"chn":9.21},"min":{"usa":8,"chn":8},"max":{"usa":14,"chn":14}},{"date":"2020-08-07T00:00+08:00","avg":{"usa":13.42,"chn":13.42},"min":{"usa":10,"chn":10},"max":{"usa":16,"chn":16}}]
                 */
                private List<Pm25Entity> pm25;
                private List<AqiEntity> aqi;

                public void setPm25(List<Pm25Entity> pm25) {
                    this.pm25 = pm25;
                }

                public void setAqi(List<AqiEntity> aqi) {
                    this.aqi = aqi;
                }

                public List<Pm25Entity> getPm25() {
                    return pm25;
                }

                public List<AqiEntity> getAqi() {
                    return aqi;
                }

                public class Pm25Entity {
                    /**
                     * date : 2020-08-03T00:00+08:00
                     * avg : 4.6
                     * min : 3
                     * max : 6
                     */
                    private String date;
                    private double avg;
                    private int min;
                    private int max;

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public void setAvg(double avg) {
                        this.avg = avg;
                    }

                    public void setMin(int min) {
                        this.min = min;
                    }

                    public void setMax(int max) {
                        this.max = max;
                    }

                    public String getDate() {
                        return date;
                    }

                    public double getAvg() {
                        return avg;
                    }

                    public int getMin() {
                        return min;
                    }

                    public int getMax() {
                        return max;
                    }
                }

                public class AqiEntity {
                    /**
                     * date : 2020-08-03T00:00+08:00
                     * avg : {"usa":7.5,"chn":7.5}
                     * min : {"usa":7,"chn":7}
                     * max : {"usa":9,"chn":9}
                     */
                    private String date;
                    private AvgEntity avg;
                    private MinEntity min;
                    private MaxEntity max;

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public void setAvg(AvgEntity avg) {
                        this.avg = avg;
                    }

                    public void setMin(MinEntity min) {
                        this.min = min;
                    }

                    public void setMax(MaxEntity max) {
                        this.max = max;
                    }

                    public String getDate() {
                        return date;
                    }

                    public AvgEntity getAvg() {
                        return avg;
                    }

                    public MinEntity getMin() {
                        return min;
                    }

                    public MaxEntity getMax() {
                        return max;
                    }

                    public class AvgEntity {
                        /**
                         * usa : 7.5
                         * chn : 7.5
                         */
                        private double usa;
                        private double chn;

                        public void setUsa(double usa) {
                            this.usa = usa;
                        }

                        public void setChn(double chn) {
                            this.chn = chn;
                        }

                        public double getUsa() {
                            return usa;
                        }

                        public double getChn() {
                            return chn;
                        }
                    }

                    public class MinEntity {
                        /**
                         * usa : 7
                         * chn : 7
                         */
                        private int usa;
                        private int chn;

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public int getChn() {
                            return chn;
                        }
                    }

                    public class MaxEntity {
                        /**
                         * usa : 9
                         * chn : 9
                         */
                        private int usa;
                        private int chn;

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public int getChn() {
                            return chn;
                        }
                    }
                }
            }

            public class PressureEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * min : 98363.24
                 * avg : 98501.65
                 * max : 99003.48
                 */
                private String date;
                private double min;
                private double avg;
                private double max;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public String getDate() {
                    return date;
                }

                public double getMin() {
                    return min;
                }

                public double getAvg() {
                    return avg;
                }

                public double getMax() {
                    return max;
                }
            }

            public class DswrfEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * min : 0.0
                 * avg : 23.7
                 * max : 77.0
                 */
                private String date;
                private double min;
                private double avg;
                private double max;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public String getDate() {
                    return date;
                }

                public double getMin() {
                    return min;
                }

                public double getAvg() {
                    return avg;
                }

                public double getMax() {
                    return max;
                }
            }

            public class PrecipitationEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * min : 0.0
                 * avg : 1.2008
                 * max : 13.1944
                 */
                private String date;
                private double min;
                private double avg;
                private double max;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public String getDate() {
                    return date;
                }

                public double getMin() {
                    return min;
                }

                public double getAvg() {
                    return avg;
                }

                public double getMax() {
                    return max;
                }
            }

            public class Skycon_08h_20hEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * value : HEAVY_RAIN
                 */
                private String date;
                private String value;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getDate() {
                    return date;
                }

                public String getValue() {
                    return value;
                }
            }

            public class CloudrateEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * min : 0.96
                 * avg : 1.0
                 * max : 1.0
                 */
                private String date;
                private double min;
                private double avg;
                private double max;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public String getDate() {
                    return date;
                }

                public double getMin() {
                    return min;
                }

                public double getAvg() {
                    return avg;
                }

                public double getMax() {
                    return max;
                }
            }

            public class AstroEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * sunrise : {"time":"05:21"}
                 * sunset : {"time":"18:37"}
                 */
                private String date;
                private SunriseEntity sunrise;
                private SunsetEntity sunset;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setSunrise(SunriseEntity sunrise) {
                    this.sunrise = sunrise;
                }

                public void setSunset(SunsetEntity sunset) {
                    this.sunset = sunset;
                }

                public String getDate() {
                    return date;
                }

                public SunriseEntity getSunrise() {
                    return sunrise;
                }

                public SunsetEntity getSunset() {
                    return sunset;
                }

                public class SunriseEntity {
                    /**
                     * time : 05:21
                     */
                    private String time;

                    public void setTime(String time) {
                        this.time = time;
                    }

                    public String getTime() {
                        return time;
                    }
                }

                public class SunsetEntity {
                    /**
                     * time : 18:37
                     */
                    private String time;

                    public void setTime(String time) {
                        this.time = time;
                    }

                    public String getTime() {
                        return time;
                    }
                }
            }

            public class Skycon_20h_32hEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * value : LIGHT_RAIN
                 */
                private String date;
                private String value;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getDate() {
                    return date;
                }

                public String getValue() {
                    return value;
                }
            }

            public class TemperatureEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * min : 25.0
                 * avg : 26.86
                 * max : 27.39
                 */
                private String date;
                private double min;
                private double avg;
                private double max;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public String getDate() {
                    return date;
                }

                public double getMin() {
                    return min;
                }

                public double getAvg() {
                    return avg;
                }

                public double getMax() {
                    return max;
                }
            }

            public class SkyconEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * value : MODERATE_RAIN
                 */
                private String date;
                private String value;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getDate() {
                    return date;
                }

                public String getValue() {
                    return value;
                }
            }

            public class HumidityEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * min : 0.79
                 * avg : 0.84
                 * max : 1.0
                 */
                private String date;
                private double min;
                private double avg;
                private double max;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public String getDate() {
                    return date;
                }

                public double getMin() {
                    return min;
                }

                public double getAvg() {
                    return avg;
                }

                public double getMax() {
                    return max;
                }
            }

            public class Life_indexEntity {
                /**
                 * dressing : [{"date":"2020-08-03T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"很热"}]
                 * ultraviolet : [{"date":"2020-08-03T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-05T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-06T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"弱"}]
                 * coldRisk : [{"date":"2020-08-03T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"易发"}]
                 * carWashing : [{"date":"2020-08-03T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"较不适宜"}]
                 * comfort : [{"date":"2020-08-03T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"热"}]
                 */
                private List<DressingEntity> dressing;
                private List<UltravioletEntity> ultraviolet;
                private List<ColdRiskEntity> coldRisk;
                private List<CarWashingEntity> carWashing;
                private List<ComfortEntity> comfort;

                public void setDressing(List<DressingEntity> dressing) {
                    this.dressing = dressing;
                }

                public void setUltraviolet(List<UltravioletEntity> ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public void setColdRisk(List<ColdRiskEntity> coldRisk) {
                    this.coldRisk = coldRisk;
                }

                public void setCarWashing(List<CarWashingEntity> carWashing) {
                    this.carWashing = carWashing;
                }

                public void setComfort(List<ComfortEntity> comfort) {
                    this.comfort = comfort;
                }

                public List<DressingEntity> getDressing() {
                    return dressing;
                }

                public List<UltravioletEntity> getUltraviolet() {
                    return ultraviolet;
                }

                public List<ColdRiskEntity> getColdRisk() {
                    return coldRisk;
                }

                public List<CarWashingEntity> getCarWashing() {
                    return carWashing;
                }

                public List<ComfortEntity> getComfort() {
                    return comfort;
                }

                public class DressingEntity {
                    /**
                     * date : 2020-08-03T00:00+08:00
                     * index : 3
                     * desc : 热
                     */
                    private String date;
                    private String index;
                    private String desc;

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getDate() {
                        return date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }

                public class UltravioletEntity {
                    /**
                     * date : 2020-08-03T00:00+08:00
                     * index : 1
                     * desc : 最弱
                     */
                    private String date;
                    private String index;
                    private String desc;

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getDate() {
                        return date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }

                public class ColdRiskEntity {
                    /**
                     * date : 2020-08-03T00:00+08:00
                     * index : 3
                     * desc : 易发
                     */
                    private String date;
                    private String index;
                    private String desc;

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getDate() {
                        return date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }

                public class CarWashingEntity {
                    /**
                     * date : 2020-08-03T00:00+08:00
                     * index : 3
                     * desc : 较不适宜
                     */
                    private String date;
                    private String index;
                    private String desc;

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getDate() {
                        return date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }

                public class ComfortEntity {
                    /**
                     * date : 2020-08-03T00:00+08:00
                     * index : 3
                     * desc : 热
                     */
                    private String date;
                    private String index;
                    private String desc;

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getDate() {
                        return date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public String getDesc() {
                        return desc;
                    }
                }
            }

            public class WindEntity {
                /**
                 * date : 2020-08-03T00:00+08:00
                 * min : {"speed":7.72,"direction":50.79}
                 * avg : {"speed":19.17,"direction":283.59}
                 * max : {"speed":35.16,"direction":261.93}
                 */
                private String date;
                private MinEntity min;
                private AvgEntity avg;
                private MaxEntity max;

                public void setDate(String date) {
                    this.date = date;
                }

                public void setMin(MinEntity min) {
                    this.min = min;
                }

                public void setAvg(AvgEntity avg) {
                    this.avg = avg;
                }

                public void setMax(MaxEntity max) {
                    this.max = max;
                }

                public String getDate() {
                    return date;
                }

                public MinEntity getMin() {
                    return min;
                }

                public AvgEntity getAvg() {
                    return avg;
                }

                public MaxEntity getMax() {
                    return max;
                }

                public class MinEntity {
                    /**
                     * speed : 7.72
                     * direction : 50.79
                     */
                    private double speed;
                    private double direction;

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public double getDirection() {
                        return direction;
                    }
                }

                public class AvgEntity {
                    /**
                     * speed : 19.17
                     * direction : 283.59
                     */
                    private double speed;
                    private double direction;

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public double getDirection() {
                        return direction;
                    }
                }

                public class MaxEntity {
                    /**
                     * speed : 35.16
                     * direction : 261.93
                     */
                    private double speed;
                    private double direction;

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public double getDirection() {
                        return direction;
                    }
                }
            }
        }

        public class HourlyEntity {
            /**
             * precipitation : [{"datetime":"2020-08-03T14:00+08:00","value":0.3722},{"datetime":"2020-08-03T15:00+08:00","value":2.9975},{"datetime":"2020-08-03T16:00+08:00","value":1.1469},{"datetime":"2020-08-03T17:00+08:00","value":4.6699},{"datetime":"2020-08-03T18:00+08:00","value":1.9772},{"datetime":"2020-08-03T19:00+08:00","value":0.3692},{"datetime":"2020-08-03T20:00+08:00","value":0.0534},{"datetime":"2020-08-03T21:00+08:00","value":0.1899},{"datetime":"2020-08-03T22:00+08:00","value":0.2316},{"datetime":"2020-08-03T23:00+08:00","value":0},{"datetime":"2020-08-04T00:00+08:00","value":0},{"datetime":"2020-08-04T01:00+08:00","value":0},{"datetime":"2020-08-04T02:00+08:00","value":0},{"datetime":"2020-08-04T03:00+08:00","value":0},{"datetime":"2020-08-04T04:00+08:00","value":0},{"datetime":"2020-08-04T05:00+08:00","value":0},{"datetime":"2020-08-04T06:00+08:00","value":0},{"datetime":"2020-08-04T07:00+08:00","value":0},{"datetime":"2020-08-04T08:00+08:00","value":0},{"datetime":"2020-08-04T09:00+08:00","value":0},{"datetime":"2020-08-04T10:00+08:00","value":0},{"datetime":"2020-08-04T11:00+08:00","value":0.0614},{"datetime":"2020-08-04T12:00+08:00","value":0.2218},{"datetime":"2020-08-04T13:00+08:00","value":1.2394},{"datetime":"2020-08-04T14:00+08:00","value":2.3121},{"datetime":"2020-08-04T15:00+08:00","value":0.8649},{"datetime":"2020-08-04T16:00+08:00","value":0.3599},{"datetime":"2020-08-04T17:00+08:00","value":0.5713},{"datetime":"2020-08-04T18:00+08:00","value":0.2497},{"datetime":"2020-08-04T19:00+08:00","value":0.0702},{"datetime":"2020-08-04T20:00+08:00","value":0},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":0},{"datetime":"2020-08-05T08:00+08:00","value":0},{"datetime":"2020-08-05T09:00+08:00","value":0},{"datetime":"2020-08-05T10:00+08:00","value":0},{"datetime":"2020-08-05T11:00+08:00","value":0},{"datetime":"2020-08-05T12:00+08:00","value":0},{"datetime":"2020-08-05T13:00+08:00","value":0.0536}]
             * cloudrate : [{"datetime":"2020-08-03T14:00+08:00","value":1},{"datetime":"2020-08-03T15:00+08:00","value":1},{"datetime":"2020-08-03T16:00+08:00","value":1},{"datetime":"2020-08-03T17:00+08:00","value":1},{"datetime":"2020-08-03T18:00+08:00","value":1},{"datetime":"2020-08-03T19:00+08:00","value":1},{"datetime":"2020-08-03T20:00+08:00","value":1},{"datetime":"2020-08-03T21:00+08:00","value":1},{"datetime":"2020-08-03T22:00+08:00","value":1},{"datetime":"2020-08-03T23:00+08:00","value":1},{"datetime":"2020-08-04T00:00+08:00","value":1},{"datetime":"2020-08-04T01:00+08:00","value":1},{"datetime":"2020-08-04T02:00+08:00","value":1},{"datetime":"2020-08-04T03:00+08:00","value":1},{"datetime":"2020-08-04T04:00+08:00","value":1},{"datetime":"2020-08-04T05:00+08:00","value":1},{"datetime":"2020-08-04T06:00+08:00","value":1},{"datetime":"2020-08-04T07:00+08:00","value":1},{"datetime":"2020-08-04T08:00+08:00","value":1},{"datetime":"2020-08-04T09:00+08:00","value":1},{"datetime":"2020-08-04T10:00+08:00","value":1},{"datetime":"2020-08-04T11:00+08:00","value":1},{"datetime":"2020-08-04T12:00+08:00","value":1},{"datetime":"2020-08-04T13:00+08:00","value":0.98},{"datetime":"2020-08-04T14:00+08:00","value":1},{"datetime":"2020-08-04T15:00+08:00","value":1},{"datetime":"2020-08-04T16:00+08:00","value":1},{"datetime":"2020-08-04T17:00+08:00","value":1},{"datetime":"2020-08-04T18:00+08:00","value":1},{"datetime":"2020-08-04T19:00+08:00","value":1},{"datetime":"2020-08-04T20:00+08:00","value":1},{"datetime":"2020-08-04T21:00+08:00","value":1},{"datetime":"2020-08-04T22:00+08:00","value":1},{"datetime":"2020-08-04T23:00+08:00","value":1},{"datetime":"2020-08-05T00:00+08:00","value":1},{"datetime":"2020-08-05T01:00+08:00","value":1},{"datetime":"2020-08-05T02:00+08:00","value":1},{"datetime":"2020-08-05T03:00+08:00","value":1},{"datetime":"2020-08-05T04:00+08:00","value":1},{"datetime":"2020-08-05T05:00+08:00","value":1},{"datetime":"2020-08-05T06:00+08:00","value":1},{"datetime":"2020-08-05T07:00+08:00","value":1},{"datetime":"2020-08-05T08:00+08:00","value":1},{"datetime":"2020-08-05T09:00+08:00","value":1},{"datetime":"2020-08-05T10:00+08:00","value":1},{"datetime":"2020-08-05T11:00+08:00","value":1},{"datetime":"2020-08-05T12:00+08:00","value":1},{"datetime":"2020-08-05T13:00+08:00","value":1}]
             * visibility : [{"datetime":"2020-08-03T14:00+08:00","value":5},{"datetime":"2020-08-03T15:00+08:00","value":5.93},{"datetime":"2020-08-03T16:00+08:00","value":6.05},{"datetime":"2020-08-03T17:00+08:00","value":6.39},{"datetime":"2020-08-03T18:00+08:00","value":7.87},{"datetime":"2020-08-03T19:00+08:00","value":7.91},{"datetime":"2020-08-03T20:00+08:00","value":7.7},{"datetime":"2020-08-03T21:00+08:00","value":7.47},{"datetime":"2020-08-03T22:00+08:00","value":7.07},{"datetime":"2020-08-03T23:00+08:00","value":7.23},{"datetime":"2020-08-04T00:00+08:00","value":7.18},{"datetime":"2020-08-04T01:00+08:00","value":7},{"datetime":"2020-08-04T02:00+08:00","value":6.9},{"datetime":"2020-08-04T03:00+08:00","value":7.23},{"datetime":"2020-08-04T04:00+08:00","value":7.5},{"datetime":"2020-08-04T05:00+08:00","value":7.74},{"datetime":"2020-08-04T06:00+08:00","value":7.82},{"datetime":"2020-08-04T07:00+08:00","value":8.6},{"datetime":"2020-08-04T08:00+08:00","value":10.58},{"datetime":"2020-08-04T09:00+08:00","value":13.1},{"datetime":"2020-08-04T10:00+08:00","value":15.17},{"datetime":"2020-08-04T11:00+08:00","value":15.17},{"datetime":"2020-08-04T12:00+08:00","value":15.13},{"datetime":"2020-08-04T13:00+08:00","value":13.88},{"datetime":"2020-08-04T14:00+08:00","value":11.81},{"datetime":"2020-08-04T15:00+08:00","value":9.61},{"datetime":"2020-08-04T16:00+08:00","value":7.19},{"datetime":"2020-08-04T17:00+08:00","value":6.09},{"datetime":"2020-08-04T18:00+08:00","value":5.47},{"datetime":"2020-08-04T19:00+08:00","value":5.27},{"datetime":"2020-08-04T20:00+08:00","value":5.61},{"datetime":"2020-08-04T21:00+08:00","value":5.57},{"datetime":"2020-08-04T22:00+08:00","value":5.28},{"datetime":"2020-08-04T23:00+08:00","value":5.44},{"datetime":"2020-08-05T00:00+08:00","value":5.6},{"datetime":"2020-08-05T01:00+08:00","value":5.73},{"datetime":"2020-08-05T02:00+08:00","value":5.9},{"datetime":"2020-08-05T03:00+08:00","value":6.08},{"datetime":"2020-08-05T04:00+08:00","value":6.14},{"datetime":"2020-08-05T05:00+08:00","value":6.45},{"datetime":"2020-08-05T06:00+08:00","value":7.13},{"datetime":"2020-08-05T07:00+08:00","value":8.29},{"datetime":"2020-08-05T08:00+08:00","value":10.43},{"datetime":"2020-08-05T09:00+08:00","value":13.65},{"datetime":"2020-08-05T10:00+08:00","value":15.17},{"datetime":"2020-08-05T11:00+08:00","value":15.17},{"datetime":"2020-08-05T12:00+08:00","value":15.17},{"datetime":"2020-08-05T13:00+08:00","value":15.17}]
             * temperature : [{"datetime":"2020-08-03T14:00+08:00","value":26.16},{"datetime":"2020-08-03T15:00+08:00","value":26.47},{"datetime":"2020-08-03T16:00+08:00","value":26.77},{"datetime":"2020-08-03T17:00+08:00","value":27.08},{"datetime":"2020-08-03T18:00+08:00","value":27.39},{"datetime":"2020-08-03T19:00+08:00","value":26.69},{"datetime":"2020-08-03T20:00+08:00","value":27},{"datetime":"2020-08-03T21:00+08:00","value":27},{"datetime":"2020-08-03T22:00+08:00","value":27},{"datetime":"2020-08-03T23:00+08:00","value":27},{"datetime":"2020-08-04T00:00+08:00","value":27},{"datetime":"2020-08-04T01:00+08:00","value":27},{"datetime":"2020-08-04T02:00+08:00","value":27},{"datetime":"2020-08-04T03:00+08:00","value":27},{"datetime":"2020-08-04T04:00+08:00","value":27},{"datetime":"2020-08-04T05:00+08:00","value":26.4},{"datetime":"2020-08-04T06:00+08:00","value":27.6},{"datetime":"2020-08-04T07:00+08:00","value":28.6},{"datetime":"2020-08-04T08:00+08:00","value":28.8},{"datetime":"2020-08-04T09:00+08:00","value":29.5},{"datetime":"2020-08-04T10:00+08:00","value":29.6},{"datetime":"2020-08-04T11:00+08:00","value":29.7},{"datetime":"2020-08-04T12:00+08:00","value":29.8},{"datetime":"2020-08-04T13:00+08:00","value":29.6},{"datetime":"2020-08-04T14:00+08:00","value":30},{"datetime":"2020-08-04T15:00+08:00","value":28.67},{"datetime":"2020-08-04T16:00+08:00","value":28.23},{"datetime":"2020-08-04T17:00+08:00","value":27.79},{"datetime":"2020-08-04T18:00+08:00","value":27.35},{"datetime":"2020-08-04T19:00+08:00","value":26.97},{"datetime":"2020-08-04T20:00+08:00","value":26.58},{"datetime":"2020-08-04T21:00+08:00","value":26.34},{"datetime":"2020-08-04T22:00+08:00","value":26},{"datetime":"2020-08-04T23:00+08:00","value":26.04},{"datetime":"2020-08-05T00:00+08:00","value":26},{"datetime":"2020-08-05T01:00+08:00","value":26},{"datetime":"2020-08-05T02:00+08:00","value":26.02},{"datetime":"2020-08-05T03:00+08:00","value":26.52},{"datetime":"2020-08-05T04:00+08:00","value":27.04},{"datetime":"2020-08-05T05:00+08:00","value":27.56},{"datetime":"2020-08-05T06:00+08:00","value":28.13},{"datetime":"2020-08-05T07:00+08:00","value":28.78},{"datetime":"2020-08-05T08:00+08:00","value":29.44},{"datetime":"2020-08-05T09:00+08:00","value":30.08},{"datetime":"2020-08-05T10:00+08:00","value":30.76},{"datetime":"2020-08-05T11:00+08:00","value":30.96},{"datetime":"2020-08-05T12:00+08:00","value":31},{"datetime":"2020-08-05T13:00+08:00","value":31}]
             * skycon : [{"datetime":"2020-08-03T14:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T15:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-03T16:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-03T17:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-03T18:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-03T19:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-03T21:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T22:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-03T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T11:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T13:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T14:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T15:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T16:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T17:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T18:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T19:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T12:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T13:00+08:00","value":"CLOUDY"}]
             * description : 中雨，今天晚间20点钟后雨停，转阴，其后小雨
             * humidity : [{"datetime":"2020-08-03T14:00+08:00","value":1},{"datetime":"2020-08-03T15:00+08:00","value":0.86},{"datetime":"2020-08-03T16:00+08:00","value":0.85},{"datetime":"2020-08-03T17:00+08:00","value":0.84},{"datetime":"2020-08-03T18:00+08:00","value":0.79},{"datetime":"2020-08-03T19:00+08:00","value":0.79},{"datetime":"2020-08-03T20:00+08:00","value":0.8},{"datetime":"2020-08-03T21:00+08:00","value":0.8},{"datetime":"2020-08-03T22:00+08:00","value":0.81},{"datetime":"2020-08-03T23:00+08:00","value":0.81},{"datetime":"2020-08-04T00:00+08:00","value":0.81},{"datetime":"2020-08-04T01:00+08:00","value":0.82},{"datetime":"2020-08-04T02:00+08:00","value":0.82},{"datetime":"2020-08-04T03:00+08:00","value":0.81},{"datetime":"2020-08-04T04:00+08:00","value":0.8},{"datetime":"2020-08-04T05:00+08:00","value":0.8},{"datetime":"2020-08-04T06:00+08:00","value":0.79},{"datetime":"2020-08-04T07:00+08:00","value":0.78},{"datetime":"2020-08-04T08:00+08:00","value":0.74},{"datetime":"2020-08-04T09:00+08:00","value":0.72},{"datetime":"2020-08-04T10:00+08:00","value":0.7},{"datetime":"2020-08-04T11:00+08:00","value":0.69},{"datetime":"2020-08-04T12:00+08:00","value":0.7},{"datetime":"2020-08-04T13:00+08:00","value":0.71},{"datetime":"2020-08-04T14:00+08:00","value":0.73},{"datetime":"2020-08-04T15:00+08:00","value":0.76},{"datetime":"2020-08-04T16:00+08:00","value":0.81},{"datetime":"2020-08-04T17:00+08:00","value":0.85},{"datetime":"2020-08-04T18:00+08:00","value":0.88},{"datetime":"2020-08-04T19:00+08:00","value":0.89},{"datetime":"2020-08-04T20:00+08:00","value":0.87},{"datetime":"2020-08-04T21:00+08:00","value":0.87},{"datetime":"2020-08-04T22:00+08:00","value":0.89},{"datetime":"2020-08-04T23:00+08:00","value":0.88},{"datetime":"2020-08-05T00:00+08:00","value":0.87},{"datetime":"2020-08-05T01:00+08:00","value":0.86},{"datetime":"2020-08-05T02:00+08:00","value":0.86},{"datetime":"2020-08-05T03:00+08:00","value":0.85},{"datetime":"2020-08-05T04:00+08:00","value":0.85},{"datetime":"2020-08-05T05:00+08:00","value":0.84},{"datetime":"2020-08-05T06:00+08:00","value":0.81},{"datetime":"2020-08-05T07:00+08:00","value":0.78},{"datetime":"2020-08-05T08:00+08:00","value":0.75},{"datetime":"2020-08-05T09:00+08:00","value":0.71},{"datetime":"2020-08-05T10:00+08:00","value":0.68},{"datetime":"2020-08-05T11:00+08:00","value":0.64},{"datetime":"2020-08-05T12:00+08:00","value":0.63},{"datetime":"2020-08-05T13:00+08:00","value":0.63}]
             * air_quality : {"pm25":[{"datetime":"2020-08-03T14:00+08:00","value":3},{"datetime":"2020-08-03T15:00+08:00","value":3},{"datetime":"2020-08-03T16:00+08:00","value":4},{"datetime":"2020-08-03T17:00+08:00","value":4},{"datetime":"2020-08-03T18:00+08:00","value":4},{"datetime":"2020-08-03T19:00+08:00","value":5},{"datetime":"2020-08-03T20:00+08:00","value":5},{"datetime":"2020-08-03T21:00+08:00","value":6},{"datetime":"2020-08-03T22:00+08:00","value":6},{"datetime":"2020-08-03T23:00+08:00","value":6},{"datetime":"2020-08-04T00:00+08:00","value":6},{"datetime":"2020-08-04T01:00+08:00","value":6},{"datetime":"2020-08-04T02:00+08:00","value":6},{"datetime":"2020-08-04T03:00+08:00","value":6},{"datetime":"2020-08-04T04:00+08:00","value":5},{"datetime":"2020-08-04T05:00+08:00","value":5},{"datetime":"2020-08-04T06:00+08:00","value":5},{"datetime":"2020-08-04T07:00+08:00","value":4},{"datetime":"2020-08-04T08:00+08:00","value":5},{"datetime":"2020-08-04T09:00+08:00","value":5},{"datetime":"2020-08-04T10:00+08:00","value":4},{"datetime":"2020-08-04T11:00+08:00","value":4},{"datetime":"2020-08-04T12:00+08:00","value":4},{"datetime":"2020-08-04T13:00+08:00","value":3},{"datetime":"2020-08-04T14:00+08:00","value":3},{"datetime":"2020-08-04T15:00+08:00","value":4},{"datetime":"2020-08-04T16:00+08:00","value":4},{"datetime":"2020-08-04T17:00+08:00","value":4},{"datetime":"2020-08-04T18:00+08:00","value":5},{"datetime":"2020-08-04T19:00+08:00","value":5},{"datetime":"2020-08-04T20:00+08:00","value":5},{"datetime":"2020-08-04T21:00+08:00","value":6},{"datetime":"2020-08-04T22:00+08:00","value":6},{"datetime":"2020-08-04T23:00+08:00","value":6},{"datetime":"2020-08-05T00:00+08:00","value":6},{"datetime":"2020-08-05T01:00+08:00","value":6},{"datetime":"2020-08-05T02:00+08:00","value":6},{"datetime":"2020-08-05T03:00+08:00","value":6},{"datetime":"2020-08-05T04:00+08:00","value":5},{"datetime":"2020-08-05T05:00+08:00","value":5},{"datetime":"2020-08-05T06:00+08:00","value":6},{"datetime":"2020-08-05T07:00+08:00","value":5},{"datetime":"2020-08-05T08:00+08:00","value":5},{"datetime":"2020-08-05T09:00+08:00","value":5},{"datetime":"2020-08-05T10:00+08:00","value":4},{"datetime":"2020-08-05T11:00+08:00","value":4},{"datetime":"2020-08-05T12:00+08:00","value":4},{"datetime":"2020-08-05T13:00+08:00","value":3}],"aqi":[{"datetime":"2020-08-03T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T15:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T18:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T00:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T03:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T06:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T07:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T08:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T09:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T10:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T11:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T12:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T13:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T14:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T15:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T16:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T17:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T18:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T19:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T20:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T22:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T23:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T00:00+08:00","value":{"usa":9,"chn":9}},{"datetime":"2020-08-05T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T03:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T06:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T08:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T09:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T12:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T13:00+08:00","value":{"usa":8,"chn":8}}]}
             * pressure : [{"datetime":"2020-08-03T14:00+08:00","value":98363.43552},{"datetime":"2020-08-03T15:00+08:00","value":98363.24352},{"datetime":"2020-08-03T16:00+08:00","value":98363.24352},{"datetime":"2020-08-03T17:00+08:00","value":98393.87648},{"datetime":"2020-08-03T18:00+08:00","value":98424.27648},{"datetime":"2020-08-03T19:00+08:00","value":98523.47648},{"datetime":"2020-08-03T20:00+08:00","value":98553.87648},{"datetime":"2020-08-03T21:00+08:00","value":98603.28448},{"datetime":"2020-08-03T22:00+08:00","value":98713.87648},{"datetime":"2020-08-03T23:00+08:00","value":98713.87648},{"datetime":"2020-08-04T00:00+08:00","value":98713.87648},{"datetime":"2020-08-04T01:00+08:00","value":98633.87648},{"datetime":"2020-08-04T02:00+08:00","value":98572.84352},{"datetime":"2020-08-04T03:00+08:00","value":98603.47648},{"datetime":"2020-08-04T04:00+08:00","value":98603.47648},{"datetime":"2020-08-04T05:00+08:00","value":98652.84352},{"datetime":"2020-08-04T06:00+08:00","value":98732.84352},{"datetime":"2020-08-04T07:00+08:00","value":98763.47648},{"datetime":"2020-08-04T08:00+08:00","value":98793.87648},{"datetime":"2020-08-04T09:00+08:00","value":98812.84352},{"datetime":"2020-08-04T10:00+08:00","value":98843.47648},{"datetime":"2020-08-04T11:00+08:00","value":98843.47648},{"datetime":"2020-08-04T12:00+08:00","value":98892.84352},{"datetime":"2020-08-04T13:00+08:00","value":98893.07648},{"datetime":"2020-08-04T14:00+08:00","value":98892.88448},{"datetime":"2020-08-04T15:00+08:00","value":98862.25152},{"datetime":"2020-08-04T16:00+08:00","value":98862.25152},{"datetime":"2020-08-04T17:00+08:00","value":98892.88448},{"datetime":"2020-08-04T18:00+08:00","value":98904.50944},{"datetime":"2020-08-04T19:00+08:00","value":99015.1424},{"datetime":"2020-08-04T20:00+08:00","value":99095.1424},{"datetime":"2020-08-04T21:00+08:00","value":99163.47648},{"datetime":"2020-08-04T22:00+08:00","value":99274.10944},{"datetime":"2020-08-04T23:00+08:00","value":99274.10944},{"datetime":"2020-08-05T00:00+08:00","value":99243.47648},{"datetime":"2020-08-05T01:00+08:00","value":99163.47648},{"datetime":"2020-08-05T02:00+08:00","value":99163.47648},{"datetime":"2020-08-05T03:00+08:00","value":99163.47648},{"datetime":"2020-08-05T04:00+08:00","value":99163.47648},{"datetime":"2020-08-05T05:00+08:00","value":99175.10144},{"datetime":"2020-08-05T06:00+08:00","value":99243.47648},{"datetime":"2020-08-05T07:00+08:00","value":99285.7344},{"datetime":"2020-08-05T08:00+08:00","value":99323.47648},{"datetime":"2020-08-05T09:00+08:00","value":99323.47648},{"datetime":"2020-08-05T10:00+08:00","value":99403.47648},{"datetime":"2020-08-05T11:00+08:00","value":99403.47648},{"datetime":"2020-08-05T12:00+08:00","value":99323.47648},{"datetime":"2020-08-05T13:00+08:00","value":99311.85152}]
             * dswrf : [{"datetime":"2020-08-03T14:00+08:00","value":67.89936},{"datetime":"2020-08-03T15:00+08:00","value":46.23424},{"datetime":"2020-08-03T16:00+08:00","value":35.28224},{"datetime":"2020-08-03T17:00+08:00","value":25.28224},{"datetime":"2020-08-03T18:00+08:00","value":22.90624},{"datetime":"2020-08-03T19:00+08:00","value":21.45312},{"datetime":"2020-08-03T20:00+08:00","value":17.741856},{"datetime":"2020-08-03T21:00+08:00","value":0},{"datetime":"2020-08-03T22:00+08:00","value":0},{"datetime":"2020-08-03T23:00+08:00","value":0},{"datetime":"2020-08-04T00:00+08:00","value":0},{"datetime":"2020-08-04T01:00+08:00","value":0},{"datetime":"2020-08-04T02:00+08:00","value":0},{"datetime":"2020-08-04T03:00+08:00","value":0},{"datetime":"2020-08-04T04:00+08:00","value":0},{"datetime":"2020-08-04T05:00+08:00","value":0},{"datetime":"2020-08-04T06:00+08:00","value":0},{"datetime":"2020-08-04T07:00+08:00","value":30.380512},{"datetime":"2020-08-04T08:00+08:00","value":79.908736},{"datetime":"2020-08-04T09:00+08:00","value":464.87584},{"datetime":"2020-08-04T10:00+08:00","value":570.592},{"datetime":"2020-08-04T11:00+08:00","value":553.097504},{"datetime":"2020-08-04T12:00+08:00","value":527.884032},{"datetime":"2020-08-04T13:00+08:00","value":499.671808},{"datetime":"2020-08-04T14:00+08:00","value":577.041504},{"datetime":"2020-08-04T15:00+08:00","value":431.5648},{"datetime":"2020-08-04T16:00+08:00","value":311.04992},{"datetime":"2020-08-04T17:00+08:00","value":223.38816},{"datetime":"2020-08-04T18:00+08:00","value":170.9984},{"datetime":"2020-08-04T19:00+08:00","value":136.179744},{"datetime":"2020-08-04T20:00+08:00","value":113.840928},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":26.376224},{"datetime":"2020-08-05T08:00+08:00","value":67.0448},{"datetime":"2020-08-05T09:00+08:00","value":470.89056},{"datetime":"2020-08-05T10:00+08:00","value":564.99584},{"datetime":"2020-08-05T11:00+08:00","value":652.47824},{"datetime":"2020-08-05T12:00+08:00","value":715.986976},{"datetime":"2020-08-05T13:00+08:00","value":743.883648}]
             * status : ok
             * wind : [{"datetime":"2020-08-03T14:00+08:00","speed":25.92,"direction":270},{"datetime":"2020-08-03T15:00+08:00","speed":35.16,"direction":261.93},{"datetime":"2020-08-03T16:00+08:00","speed":32.6,"direction":259.51},{"datetime":"2020-08-03T17:00+08:00","speed":24.99,"direction":251.56},{"datetime":"2020-08-03T18:00+08:00","speed":21.12,"direction":233.81},{"datetime":"2020-08-03T19:00+08:00","speed":17.78,"direction":231.48},{"datetime":"2020-08-03T20:00+08:00","speed":16.05,"direction":227.88},{"datetime":"2020-08-03T21:00+08:00","speed":13.98,"direction":198.27},{"datetime":"2020-08-03T22:00+08:00","speed":11.23,"direction":177.38},{"datetime":"2020-08-03T23:00+08:00","speed":8.53,"direction":166.3},{"datetime":"2020-08-04T00:00+08:00","speed":9.43,"direction":162.57},{"datetime":"2020-08-04T01:00+08:00","speed":8.34,"direction":154.95},{"datetime":"2020-08-04T02:00+08:00","speed":6.41,"direction":156.88},{"datetime":"2020-08-04T03:00+08:00","speed":4.48,"direction":161.03},{"datetime":"2020-08-04T04:00+08:00","speed":4.62,"direction":155.76},{"datetime":"2020-08-04T05:00+08:00","speed":2.55,"direction":166.65},{"datetime":"2020-08-04T06:00+08:00","speed":1.17,"direction":66.3},{"datetime":"2020-08-04T07:00+08:00","speed":1.13,"direction":103.45},{"datetime":"2020-08-04T08:00+08:00","speed":1.35,"direction":40.32},{"datetime":"2020-08-04T09:00+08:00","speed":5.69,"direction":22.37},{"datetime":"2020-08-04T10:00+08:00","speed":5.49,"direction":18.32},{"datetime":"2020-08-04T11:00+08:00","speed":5.38,"direction":30.92},{"datetime":"2020-08-04T12:00+08:00","speed":2.58,"direction":22.23},{"datetime":"2020-08-04T13:00+08:00","speed":6.48,"direction":100.41},{"datetime":"2020-08-04T14:00+08:00","speed":4.5,"direction":69.07},{"datetime":"2020-08-04T15:00+08:00","speed":5.67,"direction":105.78},{"datetime":"2020-08-04T16:00+08:00","speed":8.5,"direction":137.81},{"datetime":"2020-08-04T17:00+08:00","speed":8.7,"direction":149.57},{"datetime":"2020-08-04T18:00+08:00","speed":5.22,"direction":162.89},{"datetime":"2020-08-04T19:00+08:00","speed":3.16,"direction":77.64},{"datetime":"2020-08-04T20:00+08:00","speed":1.81,"direction":16.43},{"datetime":"2020-08-04T21:00+08:00","speed":3.95,"direction":311.57},{"datetime":"2020-08-04T22:00+08:00","speed":4.99,"direction":312.04},{"datetime":"2020-08-04T23:00+08:00","speed":5.36,"direction":351.75},{"datetime":"2020-08-05T00:00+08:00","speed":4.87,"direction":359.58},{"datetime":"2020-08-05T01:00+08:00","speed":2.89,"direction":34.46},{"datetime":"2020-08-05T02:00+08:00","speed":3.03,"direction":85.65},{"datetime":"2020-08-05T03:00+08:00","speed":1.89,"direction":167.72},{"datetime":"2020-08-05T04:00+08:00","speed":3.38,"direction":195.19},{"datetime":"2020-08-05T05:00+08:00","speed":4.03,"direction":184.44},{"datetime":"2020-08-05T06:00+08:00","speed":3.73,"direction":154.71},{"datetime":"2020-08-05T07:00+08:00","speed":3.89,"direction":132.1},{"datetime":"2020-08-05T08:00+08:00","speed":3.23,"direction":123.96},{"datetime":"2020-08-05T09:00+08:00","speed":3.48,"direction":133.35},{"datetime":"2020-08-05T10:00+08:00","speed":4.22,"direction":126.16},{"datetime":"2020-08-05T11:00+08:00","speed":5.02,"direction":105.38},{"datetime":"2020-08-05T12:00+08:00","speed":5.42,"direction":98.66},{"datetime":"2020-08-05T13:00+08:00","speed":5.65,"direction":99.98}]
             */
            private List<PrecipitationEntity> precipitation;
            private List<CloudrateEntity> cloudrate;
            private List<VisibilityEntity> visibility;
            private List<TemperatureEntity> temperature;
            private List<SkyconEntity> skycon;
            private String description;
            private List<HumidityEntity> humidity;
            private Air_qualityEntity air_quality;
            private List<PressureEntity> pressure;
            private List<DswrfEntity> dswrf;
            private String status;
            private List<WindEntity> wind;

            public void setPrecipitation(List<PrecipitationEntity> precipitation) {
                this.precipitation = precipitation;
            }

            public void setCloudrate(List<CloudrateEntity> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public void setVisibility(List<VisibilityEntity> visibility) {
                this.visibility = visibility;
            }

            public void setTemperature(List<TemperatureEntity> temperature) {
                this.temperature = temperature;
            }

            public void setSkycon(List<SkyconEntity> skycon) {
                this.skycon = skycon;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setHumidity(List<HumidityEntity> humidity) {
                this.humidity = humidity;
            }

            public void setAir_quality(Air_qualityEntity air_quality) {
                this.air_quality = air_quality;
            }

            public void setPressure(List<PressureEntity> pressure) {
                this.pressure = pressure;
            }

            public void setDswrf(List<DswrfEntity> dswrf) {
                this.dswrf = dswrf;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public void setWind(List<WindEntity> wind) {
                this.wind = wind;
            }

            public List<PrecipitationEntity> getPrecipitation() {
                return precipitation;
            }

            public List<CloudrateEntity> getCloudrate() {
                return cloudrate;
            }

            public List<VisibilityEntity> getVisibility() {
                return visibility;
            }

            public List<TemperatureEntity> getTemperature() {
                return temperature;
            }

            public List<SkyconEntity> getSkycon() {
                return skycon;
            }

            public String getDescription() {
                return description;
            }

            public List<HumidityEntity> getHumidity() {
                return humidity;
            }

            public Air_qualityEntity getAir_quality() {
                return air_quality;
            }

            public List<PressureEntity> getPressure() {
                return pressure;
            }

            public List<DswrfEntity> getDswrf() {
                return dswrf;
            }

            public String getStatus() {
                return status;
            }

            public List<WindEntity> getWind() {
                return wind;
            }

            public class PrecipitationEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * value : 0.3722
                 */
                private String datetime;
                private double value;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public double getValue() {
                    return value;
                }
            }

            public class CloudrateEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * value : 1.0
                 */
                private String datetime;
                private double value;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public double getValue() {
                    return value;
                }
            }

            public class VisibilityEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * value : 5.0
                 */
                private String datetime;
                private double value;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public double getValue() {
                    return value;
                }
            }

            public class TemperatureEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * value : 26.16
                 */
                private String datetime;
                private double value;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public double getValue() {
                    return value;
                }
            }

            public class SkyconEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * value : LIGHT_RAIN
                 */
                private String datetime;
                private String value;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public String getValue() {
                    return value;
                }
            }

            public class HumidityEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * value : 1.0
                 */
                private String datetime;
                private double value;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public double getValue() {
                    return value;
                }
            }

            public class Air_qualityEntity {
                /**
                 * pm25 : [{"datetime":"2020-08-03T14:00+08:00","value":3},{"datetime":"2020-08-03T15:00+08:00","value":3},{"datetime":"2020-08-03T16:00+08:00","value":4},{"datetime":"2020-08-03T17:00+08:00","value":4},{"datetime":"2020-08-03T18:00+08:00","value":4},{"datetime":"2020-08-03T19:00+08:00","value":5},{"datetime":"2020-08-03T20:00+08:00","value":5},{"datetime":"2020-08-03T21:00+08:00","value":6},{"datetime":"2020-08-03T22:00+08:00","value":6},{"datetime":"2020-08-03T23:00+08:00","value":6},{"datetime":"2020-08-04T00:00+08:00","value":6},{"datetime":"2020-08-04T01:00+08:00","value":6},{"datetime":"2020-08-04T02:00+08:00","value":6},{"datetime":"2020-08-04T03:00+08:00","value":6},{"datetime":"2020-08-04T04:00+08:00","value":5},{"datetime":"2020-08-04T05:00+08:00","value":5},{"datetime":"2020-08-04T06:00+08:00","value":5},{"datetime":"2020-08-04T07:00+08:00","value":4},{"datetime":"2020-08-04T08:00+08:00","value":5},{"datetime":"2020-08-04T09:00+08:00","value":5},{"datetime":"2020-08-04T10:00+08:00","value":4},{"datetime":"2020-08-04T11:00+08:00","value":4},{"datetime":"2020-08-04T12:00+08:00","value":4},{"datetime":"2020-08-04T13:00+08:00","value":3},{"datetime":"2020-08-04T14:00+08:00","value":3},{"datetime":"2020-08-04T15:00+08:00","value":4},{"datetime":"2020-08-04T16:00+08:00","value":4},{"datetime":"2020-08-04T17:00+08:00","value":4},{"datetime":"2020-08-04T18:00+08:00","value":5},{"datetime":"2020-08-04T19:00+08:00","value":5},{"datetime":"2020-08-04T20:00+08:00","value":5},{"datetime":"2020-08-04T21:00+08:00","value":6},{"datetime":"2020-08-04T22:00+08:00","value":6},{"datetime":"2020-08-04T23:00+08:00","value":6},{"datetime":"2020-08-05T00:00+08:00","value":6},{"datetime":"2020-08-05T01:00+08:00","value":6},{"datetime":"2020-08-05T02:00+08:00","value":6},{"datetime":"2020-08-05T03:00+08:00","value":6},{"datetime":"2020-08-05T04:00+08:00","value":5},{"datetime":"2020-08-05T05:00+08:00","value":5},{"datetime":"2020-08-05T06:00+08:00","value":6},{"datetime":"2020-08-05T07:00+08:00","value":5},{"datetime":"2020-08-05T08:00+08:00","value":5},{"datetime":"2020-08-05T09:00+08:00","value":5},{"datetime":"2020-08-05T10:00+08:00","value":4},{"datetime":"2020-08-05T11:00+08:00","value":4},{"datetime":"2020-08-05T12:00+08:00","value":4},{"datetime":"2020-08-05T13:00+08:00","value":3}]
                 * aqi : [{"datetime":"2020-08-03T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T15:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T18:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-03T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-03T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T00:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T03:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T06:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T07:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T08:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T09:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T10:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T11:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T12:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T13:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T14:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T15:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T16:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T17:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T18:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T19:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T20:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T22:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T23:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T00:00+08:00","value":{"usa":9,"chn":9}},{"datetime":"2020-08-05T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T03:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T06:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T08:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T09:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T12:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T13:00+08:00","value":{"usa":8,"chn":8}}]
                 */
                private List<Pm25Entity> pm25;
                private List<AqiEntity> aqi;

                public void setPm25(List<Pm25Entity> pm25) {
                    this.pm25 = pm25;
                }

                public void setAqi(List<AqiEntity> aqi) {
                    this.aqi = aqi;
                }

                public List<Pm25Entity> getPm25() {
                    return pm25;
                }

                public List<AqiEntity> getAqi() {
                    return aqi;
                }

                public class Pm25Entity {
                    /**
                     * datetime : 2020-08-03T14:00+08:00
                     * value : 3
                     */
                    private String datetime;
                    private int value;

                    public void setDatetime(String datetime) {
                        this.datetime = datetime;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }

                    public String getDatetime() {
                        return datetime;
                    }

                    public int getValue() {
                        return value;
                    }
                }

                public class AqiEntity {
                    /**
                     * datetime : 2020-08-03T14:00+08:00
                     * value : {"usa":8,"chn":8}
                     */
                    private String datetime;
                    private ValueEntity value;

                    public void setDatetime(String datetime) {
                        this.datetime = datetime;
                    }

                    public void setValue(ValueEntity value) {
                        this.value = value;
                    }

                    public String getDatetime() {
                        return datetime;
                    }

                    public ValueEntity getValue() {
                        return value;
                    }

                    public class ValueEntity {
                        /**
                         * usa : 8
                         * chn : 8
                         */
                        private int usa;
                        private int chn;

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public int getChn() {
                            return chn;
                        }
                    }
                }
            }

            public class PressureEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * value : 98363.43552
                 */
                private String datetime;
                private double value;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public double getValue() {
                    return value;
                }
            }

            public class DswrfEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * value : 67.89936
                 */
                private String datetime;
                private double value;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public double getValue() {
                    return value;
                }
            }

            public class WindEntity {
                /**
                 * datetime : 2020-08-03T14:00+08:00
                 * speed : 25.92
                 * direction : 270.0
                 */
                private String datetime;
                private double speed;
                private double direction;

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }

                public String getDatetime() {
                    return datetime;
                }

                public double getSpeed() {
                    return speed;
                }

                public double getDirection() {
                    return direction;
                }
            }
        }

        public class MinutelyEntity {
            /**
             * precipitation : [0.1195,0.1211,0.125,0.1316,0.1406,0.1516,0.1642,0.1779,0.1924,0.2073,0.2222,0.2365,0.25,0.2623,0.2732,0.2829,0.2912,0.2982,0.3038,0.308,0.3109,0.3124,0.3125,0.3112,0.309,0.3063,0.3036,0.3013,0.2999,0.2999,0.3017,0.3057,0.3125,0.3223,0.3346,0.3487,0.3638,0.3793,0.3945,0.4086,0.421,0.4308,0.4375,0.4405,0.4401,0.4368,0.4311,0.4235,0.4145,0.4047,0.3945,0.3844,0.375,0.3666,0.3592,0.3525,0.3464,0.3408,0.3354,0.33]
             * precipitation_2h : [0.1195,0.1211,0.125,0.1316,0.1406,0.1516,0.1642,0.1779,0.1924,0.2073,0.2222,0.2365,0.25,0.2623,0.2732,0.2829,0.2912,0.2982,0.3038,0.308,0.3109,0.3124,0.3125,0.3112,0.309,0.3063,0.3036,0.3013,0.2999,0.2999,0.3017,0.3057,0.3125,0.3223,0.3346,0.3487,0.3638,0.3793,0.3945,0.4086,0.421,0.4308,0.4375,0.4405,0.4401,0.4368,0.4311,0.4235,0.4145,0.4047,0.3945,0.3844,0.375,0.3666,0.3592,0.3525,0.3464,0.3408,0.3354,0.33,0.3245,0.3188,0.3125,0.3056,0.2983,0.2908,0.2832,0.2759,0.269,0.2627,0.2573,0.253,0.25,0.2484,0.2481,0.2486,0.2497,0.251,0.2522,0.2531,0.2532,0.2523,0.25,0.2461,0.2409,0.2347,0.2276,0.2202,0.2126,0.2053,0.1984,0.1924,0.1875,0.184,0.1817,0.1805,0.1803,0.1807,0.1817,0.1831,0.1846,0.1861,0.1875,0.1885,0.1892,0.1896,0.1898,0.1897,0.1895,0.1891,0.1886,0.1881,0.1875,0.1869,0.1864,0.1859,0.1856,0.1853,0.1853,0.1855]
             * datasource : radar
             * probability : [0.9572008475,0.9807121165,0.9934570829,0.9624462221]
             * description : 雨渐大，14分钟后转为中雨，不过一小时后雨会再次变小
             * status : ok
             */
            private List<Double> precipitation;
            private List<Double> precipitation_2h;
            private String datasource;
            private List<Double> probability;
            private String description;
            private String status;

            public void setPrecipitation(List<Double> precipitation) {
                this.precipitation = precipitation;
            }

            public void setPrecipitation_2h(List<Double> precipitation_2h) {
                this.precipitation_2h = precipitation_2h;
            }

            public void setDatasource(String datasource) {
                this.datasource = datasource;
            }

            public void setProbability(List<Double> probability) {
                this.probability = probability;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<Double> getPrecipitation() {
                return precipitation;
            }

            public List<Double> getPrecipitation_2h() {
                return precipitation_2h;
            }

            public String getDatasource() {
                return datasource;
            }

            public List<Double> getProbability() {
                return probability;
            }

            public String getDescription() {
                return description;
            }

            public String getStatus() {
                return status;
            }
        }
    }
}
