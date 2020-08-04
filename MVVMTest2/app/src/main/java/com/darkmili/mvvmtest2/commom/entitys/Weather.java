package com.darkmili.mvvmtest2.commom.entitys;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "weather")
public class Weather {
    /**
     * result : {"realtime":{"visibility":16,"air_quality":{"no2":0,"pm25":4,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":8},"description":{"usa":"","chn":"优"},"co":0},"dswrf":513.8,"pressure":98953.88,"precipitation":{"nearest":{"intensity":2,"distance":13,"status":"ok"},"local":{"intensity":0,"datasource":"radar","status":"ok"}},"cloudrate":0.9,"temperature":30.16,"skycon":"CLOUDY","humidity":0.74,"apparent_temperature":33.7,"life_index":{"ultraviolet":{"index":1,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}},"status":"ok","wind":{"speed":6.84,"direction":220}},"forecast_keypoint":"您北边13公里正下着暴雨呢","daily":{"visibility":[{"date":"2020-08-04T00:00+08:00","min":5.44,"avg":9.85,"max":24.13},{"date":"2020-08-05T00:00+08:00","min":6.89,"avg":10.38,"max":16.27},{"date":"2020-08-06T00:00+08:00","min":7.24,"avg":11.46,"max":16.27},{"date":"2020-08-07T00:00+08:00","min":6.95,"avg":10.92,"max":16.27},{"date":"2020-08-08T00:00+08:00","min":6.25,"avg":10.34,"max":16.27}],"air_quality":{"pm25":[{"date":"2020-08-04T00:00+08:00","avg":3.87,"min":3,"max":5},{"date":"2020-08-05T00:00+08:00","avg":3.54,"min":3,"max":5},{"date":"2020-08-06T00:00+08:00","avg":5.62,"min":4,"max":9},{"date":"2020-08-07T00:00+08:00","avg":7.46,"min":5,"max":10},{"date":"2020-08-08T00:00+08:00","avg":7.42,"min":6,"max":9}],"aqi":[{"date":"2020-08-04T00:00+08:00","avg":{"usa":7.53,"chn":7.53},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-05T00:00+08:00","avg":{"usa":7.46,"chn":7.46},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-06T00:00+08:00","avg":{"usa":7.96,"chn":7.96},"min":{"usa":7,"chn":7},"max":{"usa":12,"chn":12}},{"date":"2020-08-07T00:00+08:00","avg":{"usa":10.29,"chn":10.29},"min":{"usa":7,"chn":7},"max":{"usa":12,"chn":12}},{"date":"2020-08-08T00:00+08:00","avg":{"usa":10.17,"chn":10.17},"min":{"usa":8,"chn":8},"max":{"usa":13,"chn":13}}]},"pressure":[{"date":"2020-08-04T00:00+08:00","min":98633.88,"avg":99060.87,"max":99323.48},{"date":"2020-08-05T00:00+08:00","min":99243.48,"avg":99344.41,"max":99483.48},{"date":"2020-08-06T00:00+08:00","min":99231.85,"avg":99401.87,"max":99563.48},{"date":"2020-08-07T00:00+08:00","min":99102.25,"avg":99265.79,"max":99403.48},{"date":"2020-08-08T00:00+08:00","min":98942.25,"avg":99088.04,"max":99224.51}],"dswrf":[{"date":"2020-08-04T00:00+08:00","min":0,"avg":298.7,"max":683.7},{"date":"2020-08-05T00:00+08:00","min":0,"avg":301.7,"max":769.3},{"date":"2020-08-06T00:00+08:00","min":0,"avg":317.2,"max":791.5},{"date":"2020-08-07T00:00+08:00","min":0,"avg":293.1,"max":741},{"date":"2020-08-08T00:00+08:00","min":0,"avg":318.1,"max":798.4}],"precipitation":[{"date":"2020-08-04T00:00+08:00","min":0,"avg":2.3384,"max":13.2652},{"date":"2020-08-05T00:00+08:00","min":0,"avg":0.0071,"max":0.0778},{"date":"2020-08-06T00:00+08:00","min":0,"avg":0.0341,"max":0.3662},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.2526,"max":1.7363},{"date":"2020-08-08T00:00+08:00","min":0,"avg":0.2687,"max":1.2713}],"skycon_08h_20h":[{"date":"2020-08-04T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"LIGHT_RAIN"}],"cloudrate":[{"date":"2020-08-04T00:00+08:00","min":0.9,"avg":0.99,"max":1},{"date":"2020-08-05T00:00+08:00","min":0.45,"avg":0.92,"max":1},{"date":"2020-08-06T00:00+08:00","min":0.21,"avg":0.6,"max":0.96},{"date":"2020-08-07T00:00+08:00","min":0.68,"avg":0.89,"max":0.99},{"date":"2020-08-08T00:00+08:00","min":0.01,"avg":0.49,"max":0.9}],"astro":[{"date":"2020-08-04T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-05T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-06T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:35"}},{"date":"2020-08-07T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:34"}},{"date":"2020-08-08T00:00+08:00","sunrise":{"time":"05:24"},"sunset":{"time":"18:33"}}],"skycon_20h_32h":[{"date":"2020-08-04T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"CLEAR_NIGHT"}],"temperature":[{"date":"2020-08-04T00:00+08:00","min":26,"avg":27.86,"max":30.97},{"date":"2020-08-05T00:00+08:00","min":26,"avg":28.71,"max":31},{"date":"2020-08-06T00:00+08:00","min":26,"avg":28.47,"max":31},{"date":"2020-08-07T00:00+08:00","min":26,"avg":28.47,"max":31},{"date":"2020-08-08T00:00+08:00","min":26,"avg":28.46,"max":31}],"skycon":[{"date":"2020-08-04T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"LIGHT_RAIN"}],"humidity":[{"date":"2020-08-04T00:00+08:00","min":0.68,"avg":0.8,"max":0.9},{"date":"2020-08-05T00:00+08:00","min":0.68,"avg":0.77,"max":0.84},{"date":"2020-08-06T00:00+08:00","min":0.64,"avg":0.75,"max":0.82},{"date":"2020-08-07T00:00+08:00","min":0.68,"avg":0.76,"max":0.83},{"date":"2020-08-08T00:00+08:00","min":0.68,"avg":0.77,"max":0.86}],"life_index":{"dressing":[{"date":"2020-08-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-08T00:00+08:00","index":"2","desc":"很热"}],"ultraviolet":[{"date":"2020-08-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-05T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"中等"},{"date":"2020-08-07T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"中等"}],"coldRisk":[{"date":"2020-08-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"易发"}],"carWashing":[{"date":"2020-08-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"较不适宜"}],"comfort":[{"date":"2020-08-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-05T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-07T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-08T00:00+08:00","index":"0","desc":"闷热"}]},"status":"ok","wind":[{"date":"2020-08-04T00:00+08:00","min":{"speed":2.15,"direction":171.35},"avg":{"speed":6.02,"direction":221.83},"max":{"speed":10.76,"direction":253.63}},{"date":"2020-08-05T00:00+08:00","min":{"speed":0.37,"direction":162.66},"avg":{"speed":10.39,"direction":126.61},"max":{"speed":17.47,"direction":125.23}},{"date":"2020-08-06T00:00+08:00","min":{"speed":1.99,"direction":255.8},"avg":{"speed":9.46,"direction":132.95},"max":{"speed":16.48,"direction":153.81}},{"date":"2020-08-07T00:00+08:00","min":{"speed":1.74,"direction":153.17},"avg":{"speed":6.34,"direction":189.09},"max":{"speed":11.52,"direction":258.32}},{"date":"2020-08-08T00:00+08:00","min":{"speed":2.17,"direction":342.05},"avg":{"speed":9.74,"direction":144.11},"max":{"speed":21.17,"direction":148.59}}]},"hourly":{"precipitation":[{"datetime":"2020-08-04T09:00+08:00","value":0},{"datetime":"2020-08-04T10:00+08:00","value":0},{"datetime":"2020-08-04T11:00+08:00","value":0.1252},{"datetime":"2020-08-04T12:00+08:00","value":0.0713},{"datetime":"2020-08-04T13:00+08:00","value":0},{"datetime":"2020-08-04T14:00+08:00","value":0},{"datetime":"2020-08-04T15:00+08:00","value":0},{"datetime":"2020-08-04T16:00+08:00","value":0.5953},{"datetime":"2020-08-04T17:00+08:00","value":6.796},{"datetime":"2020-08-04T18:00+08:00","value":2.5179},{"datetime":"2020-08-04T19:00+08:00","value":13.2652},{"datetime":"2020-08-04T20:00+08:00","value":10.9738},{"datetime":"2020-08-04T21:00+08:00","value":0.4283},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0.3037},{"datetime":"2020-08-05T00:00+08:00","value":0.0517},{"datetime":"2020-08-05T01:00+08:00","value":0.0778},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0.0411},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":0},{"datetime":"2020-08-05T08:00+08:00","value":0},{"datetime":"2020-08-05T09:00+08:00","value":0},{"datetime":"2020-08-05T10:00+08:00","value":0},{"datetime":"2020-08-05T11:00+08:00","value":0},{"datetime":"2020-08-05T12:00+08:00","value":0},{"datetime":"2020-08-05T13:00+08:00","value":0},{"datetime":"2020-08-05T14:00+08:00","value":0},{"datetime":"2020-08-05T15:00+08:00","value":0},{"datetime":"2020-08-05T16:00+08:00","value":0},{"datetime":"2020-08-05T17:00+08:00","value":0},{"datetime":"2020-08-05T18:00+08:00","value":0},{"datetime":"2020-08-05T19:00+08:00","value":0},{"datetime":"2020-08-05T20:00+08:00","value":0},{"datetime":"2020-08-05T21:00+08:00","value":0},{"datetime":"2020-08-05T22:00+08:00","value":0},{"datetime":"2020-08-05T23:00+08:00","value":0},{"datetime":"2020-08-06T00:00+08:00","value":0},{"datetime":"2020-08-06T01:00+08:00","value":0},{"datetime":"2020-08-06T02:00+08:00","value":0},{"datetime":"2020-08-06T03:00+08:00","value":0},{"datetime":"2020-08-06T04:00+08:00","value":0},{"datetime":"2020-08-06T05:00+08:00","value":0.1464},{"datetime":"2020-08-06T06:00+08:00","value":0.0975},{"datetime":"2020-08-06T07:00+08:00","value":0},{"datetime":"2020-08-06T08:00+08:00","value":0}],"cloudrate":[{"datetime":"2020-08-04T09:00+08:00","value":0.9},{"datetime":"2020-08-04T10:00+08:00","value":0.9},{"datetime":"2020-08-04T11:00+08:00","value":1},{"datetime":"2020-08-04T12:00+08:00","value":1},{"datetime":"2020-08-04T13:00+08:00","value":1},{"datetime":"2020-08-04T14:00+08:00","value":1},{"datetime":"2020-08-04T15:00+08:00","value":1},{"datetime":"2020-08-04T16:00+08:00","value":1},{"datetime":"2020-08-04T17:00+08:00","value":1},{"datetime":"2020-08-04T18:00+08:00","value":1},{"datetime":"2020-08-04T19:00+08:00","value":1},{"datetime":"2020-08-04T20:00+08:00","value":1},{"datetime":"2020-08-04T21:00+08:00","value":1},{"datetime":"2020-08-04T22:00+08:00","value":1},{"datetime":"2020-08-04T23:00+08:00","value":1},{"datetime":"2020-08-05T00:00+08:00","value":1},{"datetime":"2020-08-05T01:00+08:00","value":1},{"datetime":"2020-08-05T02:00+08:00","value":1},{"datetime":"2020-08-05T03:00+08:00","value":1},{"datetime":"2020-08-05T04:00+08:00","value":1},{"datetime":"2020-08-05T05:00+08:00","value":1},{"datetime":"2020-08-05T06:00+08:00","value":1},{"datetime":"2020-08-05T07:00+08:00","value":1},{"datetime":"2020-08-05T08:00+08:00","value":1},{"datetime":"2020-08-05T09:00+08:00","value":1},{"datetime":"2020-08-05T10:00+08:00","value":1},{"datetime":"2020-08-05T11:00+08:00","value":1},{"datetime":"2020-08-05T12:00+08:00","value":1},{"datetime":"2020-08-05T13:00+08:00","value":1},{"datetime":"2020-08-05T14:00+08:00","value":0.96},{"datetime":"2020-08-05T15:00+08:00","value":0.45},{"datetime":"2020-08-05T16:00+08:00","value":0.69},{"datetime":"2020-08-05T17:00+08:00","value":0.73},{"datetime":"2020-08-05T18:00+08:00","value":0.75},{"datetime":"2020-08-05T19:00+08:00","value":0.78},{"datetime":"2020-08-05T20:00+08:00","value":0.82},{"datetime":"2020-08-05T21:00+08:00","value":1},{"datetime":"2020-08-05T22:00+08:00","value":1},{"datetime":"2020-08-05T23:00+08:00","value":1},{"datetime":"2020-08-06T00:00+08:00","value":0.96},{"datetime":"2020-08-06T01:00+08:00","value":0.89},{"datetime":"2020-08-06T02:00+08:00","value":0.9},{"datetime":"2020-08-06T03:00+08:00","value":0.91},{"datetime":"2020-08-06T04:00+08:00","value":0.81},{"datetime":"2020-08-06T05:00+08:00","value":0.81},{"datetime":"2020-08-06T06:00+08:00","value":0.83},{"datetime":"2020-08-06T07:00+08:00","value":0.79},{"datetime":"2020-08-06T08:00+08:00","value":0.68}],"visibility":[{"datetime":"2020-08-04T09:00+08:00","value":16},{"datetime":"2020-08-04T10:00+08:00","value":16.27},{"datetime":"2020-08-04T11:00+08:00","value":16.27},{"datetime":"2020-08-04T12:00+08:00","value":16.27},{"datetime":"2020-08-04T13:00+08:00","value":13.49},{"datetime":"2020-08-04T14:00+08:00","value":10.28},{"datetime":"2020-08-04T15:00+08:00","value":9.72},{"datetime":"2020-08-04T16:00+08:00","value":7.65},{"datetime":"2020-08-04T17:00+08:00","value":6.75},{"datetime":"2020-08-04T18:00+08:00","value":6.01},{"datetime":"2020-08-04T19:00+08:00","value":5.46},{"datetime":"2020-08-04T20:00+08:00","value":5.44},{"datetime":"2020-08-04T21:00+08:00","value":5.52},{"datetime":"2020-08-04T22:00+08:00","value":5.97},{"datetime":"2020-08-04T23:00+08:00","value":6.58},{"datetime":"2020-08-05T00:00+08:00","value":7.29},{"datetime":"2020-08-05T01:00+08:00","value":7.19},{"datetime":"2020-08-05T02:00+08:00","value":6.89},{"datetime":"2020-08-05T03:00+08:00","value":6.93},{"datetime":"2020-08-05T04:00+08:00","value":7.05},{"datetime":"2020-08-05T05:00+08:00","value":7.37},{"datetime":"2020-08-05T06:00+08:00","value":7.58},{"datetime":"2020-08-05T07:00+08:00","value":8.35},{"datetime":"2020-08-05T08:00+08:00","value":10.07},{"datetime":"2020-08-05T09:00+08:00","value":13.02},{"datetime":"2020-08-05T10:00+08:00","value":16.27},{"datetime":"2020-08-05T11:00+08:00","value":16.27},{"datetime":"2020-08-05T12:00+08:00","value":16.27},{"datetime":"2020-08-05T13:00+08:00","value":16.27},{"datetime":"2020-08-05T14:00+08:00","value":16.27},{"datetime":"2020-08-05T15:00+08:00","value":14.75},{"datetime":"2020-08-05T16:00+08:00","value":12.13},{"datetime":"2020-08-05T17:00+08:00","value":10.54},{"datetime":"2020-08-05T18:00+08:00","value":9.11},{"datetime":"2020-08-05T19:00+08:00","value":8.28},{"datetime":"2020-08-05T20:00+08:00","value":8.32},{"datetime":"2020-08-05T21:00+08:00","value":7.99},{"datetime":"2020-08-05T22:00+08:00","value":7.63},{"datetime":"2020-08-05T23:00+08:00","value":7.37},{"datetime":"2020-08-06T00:00+08:00","value":7.48},{"datetime":"2020-08-06T01:00+08:00","value":7.37},{"datetime":"2020-08-06T02:00+08:00","value":7.37},{"datetime":"2020-08-06T03:00+08:00","value":7.24},{"datetime":"2020-08-06T04:00+08:00","value":7.37},{"datetime":"2020-08-06T05:00+08:00","value":7.82},{"datetime":"2020-08-06T06:00+08:00","value":8.25},{"datetime":"2020-08-06T07:00+08:00","value":10.16},{"datetime":"2020-08-06T08:00+08:00","value":16.27}],"temperature":[{"datetime":"2020-08-04T09:00+08:00","value":30.16},{"datetime":"2020-08-04T10:00+08:00","value":30.97},{"datetime":"2020-08-04T11:00+08:00","value":30.77},{"datetime":"2020-08-04T12:00+08:00","value":30.58},{"datetime":"2020-08-04T13:00+08:00","value":29.39},{"datetime":"2020-08-04T14:00+08:00","value":28.19},{"datetime":"2020-08-04T15:00+08:00","value":27.8},{"datetime":"2020-08-04T16:00+08:00","value":26.8},{"datetime":"2020-08-04T17:00+08:00","value":26.7},{"datetime":"2020-08-04T18:00+08:00","value":26.6},{"datetime":"2020-08-04T19:00+08:00","value":26},{"datetime":"2020-08-04T20:00+08:00","value":26},{"datetime":"2020-08-04T21:00+08:00","value":26},{"datetime":"2020-08-04T22:00+08:00","value":26},{"datetime":"2020-08-04T23:00+08:00","value":26},{"datetime":"2020-08-05T00:00+08:00","value":26},{"datetime":"2020-08-05T01:00+08:00","value":26},{"datetime":"2020-08-05T02:00+08:00","value":26},{"datetime":"2020-08-05T03:00+08:00","value":26},{"datetime":"2020-08-05T04:00+08:00","value":26},{"datetime":"2020-08-05T05:00+08:00","value":26.5},{"datetime":"2020-08-05T06:00+08:00","value":27.4},{"datetime":"2020-08-05T07:00+08:00","value":28.3},{"datetime":"2020-08-05T08:00+08:00","value":28.8},{"datetime":"2020-08-05T09:00+08:00","value":29.68},{"datetime":"2020-08-05T10:00+08:00","value":30.54},{"datetime":"2020-08-05T11:00+08:00","value":30.86},{"datetime":"2020-08-05T12:00+08:00","value":30.88},{"datetime":"2020-08-05T13:00+08:00","value":30.95},{"datetime":"2020-08-05T14:00+08:00","value":31},{"datetime":"2020-08-05T15:00+08:00","value":30.93},{"datetime":"2020-08-05T16:00+08:00","value":30.78},{"datetime":"2020-08-05T17:00+08:00","value":30.54},{"datetime":"2020-08-05T18:00+08:00","value":30.15},{"datetime":"2020-08-05T19:00+08:00","value":29.64},{"datetime":"2020-08-05T20:00+08:00","value":28.88},{"datetime":"2020-08-05T21:00+08:00","value":28.3},{"datetime":"2020-08-05T22:00+08:00","value":27.69},{"datetime":"2020-08-05T23:00+08:00","value":27.2},{"datetime":"2020-08-06T00:00+08:00","value":26.79},{"datetime":"2020-08-06T01:00+08:00","value":26.53},{"datetime":"2020-08-06T02:00+08:00","value":26.74},{"datetime":"2020-08-06T03:00+08:00","value":27},{"datetime":"2020-08-06T04:00+08:00","value":27.31},{"datetime":"2020-08-06T05:00+08:00","value":26},{"datetime":"2020-08-06T06:00+08:00","value":28.06},{"datetime":"2020-08-06T07:00+08:00","value":28.23},{"datetime":"2020-08-06T08:00+08:00","value":28.33}],"skycon":[{"datetime":"2020-08-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T11:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T13:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T16:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T17:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-04T18:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T19:00+08:00","value":"STORM_RAIN"},{"datetime":"2020-08-04T20:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-04T21:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T23:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T01:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T12:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T13:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T15:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T16:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T17:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T18:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-08-05T19:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-08-05T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T05:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-06T06:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-06T07:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-06T08:00+08:00","value":"PARTLY_CLOUDY_DAY"}],"description":"阴，今天中午11点钟后转小雨，其后阴","humidity":[{"datetime":"2020-08-04T09:00+08:00","value":0.74},{"datetime":"2020-08-04T10:00+08:00","value":0.68},{"datetime":"2020-08-04T11:00+08:00","value":0.68},{"datetime":"2020-08-04T12:00+08:00","value":0.7},{"datetime":"2020-08-04T13:00+08:00","value":0.72},{"datetime":"2020-08-04T14:00+08:00","value":0.76},{"datetime":"2020-08-04T15:00+08:00","value":0.77},{"datetime":"2020-08-04T16:00+08:00","value":0.81},{"datetime":"2020-08-04T17:00+08:00","value":0.84},{"datetime":"2020-08-04T18:00+08:00","value":0.87},{"datetime":"2020-08-04T19:00+08:00","value":0.9},{"datetime":"2020-08-04T20:00+08:00","value":0.9},{"datetime":"2020-08-04T21:00+08:00","value":0.89},{"datetime":"2020-08-04T22:00+08:00","value":0.87},{"datetime":"2020-08-04T23:00+08:00","value":0.85},{"datetime":"2020-08-05T00:00+08:00","value":0.82},{"datetime":"2020-08-05T01:00+08:00","value":0.83},{"datetime":"2020-08-05T02:00+08:00","value":0.84},{"datetime":"2020-08-05T03:00+08:00","value":0.83},{"datetime":"2020-08-05T04:00+08:00","value":0.83},{"datetime":"2020-08-05T05:00+08:00","value":0.82},{"datetime":"2020-08-05T06:00+08:00","value":0.81},{"datetime":"2020-08-05T07:00+08:00","value":0.79},{"datetime":"2020-08-05T08:00+08:00","value":0.76},{"datetime":"2020-08-05T09:00+08:00","value":0.72},{"datetime":"2020-08-05T10:00+08:00","value":0.7},{"datetime":"2020-08-05T11:00+08:00","value":0.68},{"datetime":"2020-08-05T12:00+08:00","value":0.68},{"datetime":"2020-08-05T13:00+08:00","value":0.69},{"datetime":"2020-08-05T14:00+08:00","value":0.69},{"datetime":"2020-08-05T15:00+08:00","value":0.71},{"datetime":"2020-08-05T16:00+08:00","value":0.73},{"datetime":"2020-08-05T17:00+08:00","value":0.75},{"datetime":"2020-08-05T18:00+08:00","value":0.78},{"datetime":"2020-08-05T19:00+08:00","value":0.8},{"datetime":"2020-08-05T20:00+08:00","value":0.8},{"datetime":"2020-08-05T21:00+08:00","value":0.8},{"datetime":"2020-08-05T22:00+08:00","value":0.81},{"datetime":"2020-08-05T23:00+08:00","value":0.82},{"datetime":"2020-08-06T00:00+08:00","value":0.82},{"datetime":"2020-08-06T01:00+08:00","value":0.82},{"datetime":"2020-08-06T02:00+08:00","value":0.82},{"datetime":"2020-08-06T03:00+08:00","value":0.82},{"datetime":"2020-08-06T04:00+08:00","value":0.82},{"datetime":"2020-08-06T05:00+08:00","value":0.81},{"datetime":"2020-08-06T06:00+08:00","value":0.8},{"datetime":"2020-08-06T07:00+08:00","value":0.76},{"datetime":"2020-08-06T08:00+08:00","value":0.7}],"air_quality":{"pm25":[{"datetime":"2020-08-04T09:00+08:00","value":4},{"datetime":"2020-08-04T10:00+08:00","value":3},{"datetime":"2020-08-04T11:00+08:00","value":3},{"datetime":"2020-08-04T12:00+08:00","value":4},{"datetime":"2020-08-04T13:00+08:00","value":4},{"datetime":"2020-08-04T14:00+08:00","value":4},{"datetime":"2020-08-04T15:00+08:00","value":3},{"datetime":"2020-08-04T16:00+08:00","value":3},{"datetime":"2020-08-04T17:00+08:00","value":3},{"datetime":"2020-08-04T18:00+08:00","value":4},{"datetime":"2020-08-04T19:00+08:00","value":4},{"datetime":"2020-08-04T20:00+08:00","value":4},{"datetime":"2020-08-04T21:00+08:00","value":5},{"datetime":"2020-08-04T22:00+08:00","value":5},{"datetime":"2020-08-04T23:00+08:00","value":5},{"datetime":"2020-08-05T00:00+08:00","value":5},{"datetime":"2020-08-05T01:00+08:00","value":4},{"datetime":"2020-08-05T02:00+08:00","value":4},{"datetime":"2020-08-05T03:00+08:00","value":4},{"datetime":"2020-08-05T04:00+08:00","value":3},{"datetime":"2020-08-05T05:00+08:00","value":3},{"datetime":"2020-08-05T06:00+08:00","value":3},{"datetime":"2020-08-05T07:00+08:00","value":4},{"datetime":"2020-08-05T08:00+08:00","value":4},{"datetime":"2020-08-05T09:00+08:00","value":3},{"datetime":"2020-08-05T10:00+08:00","value":3},{"datetime":"2020-08-05T11:00+08:00","value":3},{"datetime":"2020-08-05T12:00+08:00","value":3},{"datetime":"2020-08-05T13:00+08:00","value":3},{"datetime":"2020-08-05T14:00+08:00","value":3},{"datetime":"2020-08-05T15:00+08:00","value":4},{"datetime":"2020-08-05T16:00+08:00","value":4},{"datetime":"2020-08-05T17:00+08:00","value":4},{"datetime":"2020-08-05T18:00+08:00","value":3},{"datetime":"2020-08-05T19:00+08:00","value":3},{"datetime":"2020-08-05T20:00+08:00","value":3},{"datetime":"2020-08-05T21:00+08:00","value":3},{"datetime":"2020-08-05T22:00+08:00","value":4},{"datetime":"2020-08-05T23:00+08:00","value":5},{"datetime":"2020-08-06T00:00+08:00","value":6},{"datetime":"2020-08-06T01:00+08:00","value":5},{"datetime":"2020-08-06T02:00+08:00","value":5},{"datetime":"2020-08-06T03:00+08:00","value":5},{"datetime":"2020-08-06T04:00+08:00","value":4},{"datetime":"2020-08-06T05:00+08:00","value":4},{"datetime":"2020-08-06T06:00+08:00","value":5},{"datetime":"2020-08-06T07:00+08:00","value":5},{"datetime":"2020-08-06T08:00+08:00","value":5}],"aqi":[{"datetime":"2020-08-04T09:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T12:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T13:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T15:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T18:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T00:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T03:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T06:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T08:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T09:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T12:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T13:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T15:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T18:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T21:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T00:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T03:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T06:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T08:00+08:00","value":{"usa":8,"chn":8}}]},"pressure":[{"datetime":"2020-08-04T09:00+08:00","value":98953.87648},{"datetime":"2020-08-04T10:00+08:00","value":99003.47648},{"datetime":"2020-08-04T11:00+08:00","value":99003.47648},{"datetime":"2020-08-04T12:00+08:00","value":99003.47648},{"datetime":"2020-08-04T13:00+08:00","value":98923.47648},{"datetime":"2020-08-04T14:00+08:00","value":98954.10944},{"datetime":"2020-08-04T15:00+08:00","value":98954.10944},{"datetime":"2020-08-04T16:00+08:00","value":98972.88448},{"datetime":"2020-08-04T17:00+08:00","value":98972.88448},{"datetime":"2020-08-04T18:00+08:00","value":99022.25152},{"datetime":"2020-08-04T19:00+08:00","value":99114.10944},{"datetime":"2020-08-04T20:00+08:00","value":99163.47648},{"datetime":"2020-08-04T21:00+08:00","value":99243.47648},{"datetime":"2020-08-04T22:00+08:00","value":99304.50944},{"datetime":"2020-08-04T23:00+08:00","value":99323.47648},{"datetime":"2020-08-05T00:00+08:00","value":99323.47648},{"datetime":"2020-08-05T01:00+08:00","value":99304.50944},{"datetime":"2020-08-05T02:00+08:00","value":99243.47648},{"datetime":"2020-08-05T03:00+08:00","value":99243.47648},{"datetime":"2020-08-05T04:00+08:00","value":99243.47648},{"datetime":"2020-08-05T05:00+08:00","value":99255.10144},{"datetime":"2020-08-05T06:00+08:00","value":99323.47648},{"datetime":"2020-08-05T07:00+08:00","value":99365.7344},{"datetime":"2020-08-05T08:00+08:00","value":99403.47648},{"datetime":"2020-08-05T09:00+08:00","value":99403.47648},{"datetime":"2020-08-05T10:00+08:00","value":99483.47648},{"datetime":"2020-08-05T11:00+08:00","value":99471.85152},{"datetime":"2020-08-05T12:00+08:00","value":99403.47648},{"datetime":"2020-08-05T13:00+08:00","value":99323.47648},{"datetime":"2020-08-05T14:00+08:00","value":99262.25152},{"datetime":"2020-08-05T15:00+08:00","value":99243.47648},{"datetime":"2020-08-05T16:00+08:00","value":99243.47648},{"datetime":"2020-08-05T17:00+08:00","value":99262.25152},{"datetime":"2020-08-05T18:00+08:00","value":99273.87648},{"datetime":"2020-08-05T19:00+08:00","value":99353.87648},{"datetime":"2020-08-05T20:00+08:00","value":99403.28448},{"datetime":"2020-08-05T21:00+08:00","value":99464.50944},{"datetime":"2020-08-05T22:00+08:00","value":99483.47648},{"datetime":"2020-08-05T23:00+08:00","value":99483.47648},{"datetime":"2020-08-06T00:00+08:00","value":99464.50944},{"datetime":"2020-08-06T01:00+08:00","value":99403.47648},{"datetime":"2020-08-06T02:00+08:00","value":99335.10144},{"datetime":"2020-08-06T03:00+08:00","value":99335.10144},{"datetime":"2020-08-06T04:00+08:00","value":99335.10144},{"datetime":"2020-08-06T05:00+08:00","value":99403.47648},{"datetime":"2020-08-06T06:00+08:00","value":99433.87648},{"datetime":"2020-08-06T07:00+08:00","value":99483.47648},{"datetime":"2020-08-06T08:00+08:00","value":99525.7344}],"dswrf":[{"datetime":"2020-08-04T09:00+08:00","value":513.77088},{"datetime":"2020-08-04T10:00+08:00","value":606.14176},{"datetime":"2020-08-04T11:00+08:00","value":653.327232},{"datetime":"2020-08-04T12:00+08:00","value":683.690592},{"datetime":"2020-08-04T13:00+08:00","value":673.515808},{"datetime":"2020-08-04T14:00+08:00","value":615.383744},{"datetime":"2020-08-04T15:00+08:00","value":212.07712},{"datetime":"2020-08-04T16:00+08:00","value":157.75744},{"datetime":"2020-08-04T17:00+08:00","value":124.26464},{"datetime":"2020-08-04T18:00+08:00","value":97.83648},{"datetime":"2020-08-04T19:00+08:00","value":77.735136},{"datetime":"2020-08-04T20:00+08:00","value":64.691072},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":24.619488},{"datetime":"2020-08-05T08:00+08:00","value":70.536256},{"datetime":"2020-08-05T09:00+08:00","value":529.06848},{"datetime":"2020-08-05T10:00+08:00","value":630.57472},{"datetime":"2020-08-05T11:00+08:00","value":701.98224},{"datetime":"2020-08-05T12:00+08:00","value":745.306176},{"datetime":"2020-08-05T13:00+08:00","value":761.400288},{"datetime":"2020-08-05T14:00+08:00","value":769.255008},{"datetime":"2020-08-05T15:00+08:00","value":726.58336},{"datetime":"2020-08-05T16:00+08:00","value":638.59584},{"datetime":"2020-08-05T17:00+08:00","value":542.9312},{"datetime":"2020-08-05T18:00+08:00","value":444.91968},{"datetime":"2020-08-05T19:00+08:00","value":357.134592},{"datetime":"2020-08-05T20:00+08:00","value":297.84336},{"datetime":"2020-08-05T21:00+08:00","value":0},{"datetime":"2020-08-05T22:00+08:00","value":0},{"datetime":"2020-08-05T23:00+08:00","value":0},{"datetime":"2020-08-06T00:00+08:00","value":0},{"datetime":"2020-08-06T01:00+08:00","value":0},{"datetime":"2020-08-06T02:00+08:00","value":0},{"datetime":"2020-08-06T03:00+08:00","value":0},{"datetime":"2020-08-06T04:00+08:00","value":0},{"datetime":"2020-08-06T05:00+08:00","value":0},{"datetime":"2020-08-06T06:00+08:00","value":0},{"datetime":"2020-08-06T07:00+08:00","value":34.766848},{"datetime":"2020-08-06T08:00+08:00","value":94.473312}],"status":"ok","wind":[{"datetime":"2020-08-04T09:00+08:00","speed":6.84,"direction":220},{"datetime":"2020-08-04T10:00+08:00","speed":7.42,"direction":22.43},{"datetime":"2020-08-04T11:00+08:00","speed":9.23,"direction":30.6},{"datetime":"2020-08-04T12:00+08:00","speed":10.48,"direction":33.47},{"datetime":"2020-08-04T13:00+08:00","speed":4.38,"direction":40.45},{"datetime":"2020-08-04T14:00+08:00","speed":4.16,"direction":230.4},{"datetime":"2020-08-04T15:00+08:00","speed":6.07,"direction":228.75},{"datetime":"2020-08-04T16:00+08:00","speed":3.25,"direction":158.12},{"datetime":"2020-08-04T17:00+08:00","speed":2.94,"direction":183.44},{"datetime":"2020-08-04T18:00+08:00","speed":10.76,"direction":253.63},{"datetime":"2020-08-04T19:00+08:00","speed":8.26,"direction":241.14},{"datetime":"2020-08-04T20:00+08:00","speed":5,"direction":244.32},{"datetime":"2020-08-04T21:00+08:00","speed":9.12,"direction":259.44},{"datetime":"2020-08-04T22:00+08:00","speed":9.12,"direction":245.58},{"datetime":"2020-08-04T23:00+08:00","speed":4.01,"direction":234.4},{"datetime":"2020-08-05T00:00+08:00","speed":0.37,"direction":162.66},{"datetime":"2020-08-05T01:00+08:00","speed":4.54,"direction":86.92},{"datetime":"2020-08-05T02:00+08:00","speed":4.05,"direction":97.21},{"datetime":"2020-08-05T03:00+08:00","speed":1.58,"direction":118.23},{"datetime":"2020-08-05T04:00+08:00","speed":2.06,"direction":138.96},{"datetime":"2020-08-05T05:00+08:00","speed":2.19,"direction":140.66},{"datetime":"2020-08-05T06:00+08:00","speed":2.92,"direction":113.35},{"datetime":"2020-08-05T07:00+08:00","speed":4.82,"direction":87.03},{"datetime":"2020-08-05T08:00+08:00","speed":7.1,"direction":76.29},{"datetime":"2020-08-05T09:00+08:00","speed":8.33,"direction":81.9},{"datetime":"2020-08-05T10:00+08:00","speed":9.64,"direction":86.66},{"datetime":"2020-08-05T11:00+08:00","speed":12.11,"direction":97.6},{"datetime":"2020-08-05T12:00+08:00","speed":14.89,"direction":107.99},{"datetime":"2020-08-05T13:00+08:00","speed":17.35,"direction":116.54},{"datetime":"2020-08-05T14:00+08:00","speed":16.86,"direction":123.62},{"datetime":"2020-08-05T15:00+08:00","speed":17.47,"direction":125.23},{"datetime":"2020-08-05T16:00+08:00","speed":17.27,"direction":129.74},{"datetime":"2020-08-05T17:00+08:00","speed":14.6,"direction":137.89},{"datetime":"2020-08-05T18:00+08:00","speed":14.49,"direction":139.98},{"datetime":"2020-08-05T19:00+08:00","speed":15.63,"direction":150.25},{"datetime":"2020-08-05T20:00+08:00","speed":15.02,"direction":155.03},{"datetime":"2020-08-05T21:00+08:00","speed":15.92,"direction":150.87},{"datetime":"2020-08-05T22:00+08:00","speed":15.37,"direction":151.2},{"datetime":"2020-08-05T23:00+08:00","speed":14.78,"direction":153.27},{"datetime":"2020-08-06T00:00+08:00","speed":16.48,"direction":153.81},{"datetime":"2020-08-06T01:00+08:00","speed":11.3,"direction":165.9},{"datetime":"2020-08-06T02:00+08:00","speed":9.84,"direction":169.74},{"datetime":"2020-08-06T03:00+08:00","speed":8.75,"direction":187.54},{"datetime":"2020-08-06T04:00+08:00","speed":7.3,"direction":204.98},{"datetime":"2020-08-06T05:00+08:00","speed":4.99,"direction":206.04},{"datetime":"2020-08-06T06:00+08:00","speed":4.07,"direction":198.15},{"datetime":"2020-08-06T07:00+08:00","speed":4.49,"direction":212.93},{"datetime":"2020-08-06T08:00+08:00","speed":1.99,"direction":255.8}]},"minutely":{"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"datasource":"radar","probability":[0,0,0,0],"description":"您北边13公里正下着暴雨呢","status":"ok"},"primary":0}
     * server_time : 1596505166
     * unit : metric
     * timezone : Asia/Taipei
     * api_status : active
     * location : [25.1552,121.6544]
     * tzshift : 28800
     * api_version : v2.5
     * lang : zh_CN
     * status : ok
     */
    @PrimaryKey(autoGenerate = true)
    private int id;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
         * realtime : {"visibility":16,"air_quality":{"no2":0,"pm25":4,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":8},"description":{"usa":"","chn":"优"},"co":0},"dswrf":513.8,"pressure":98953.88,"precipitation":{"nearest":{"intensity":2,"distance":13,"status":"ok"},"local":{"intensity":0,"datasource":"radar","status":"ok"}},"cloudrate":0.9,"temperature":30.16,"skycon":"CLOUDY","humidity":0.74,"apparent_temperature":33.7,"life_index":{"ultraviolet":{"index":1,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}},"status":"ok","wind":{"speed":6.84,"direction":220}}
         * forecast_keypoint : 您北边13公里正下着暴雨呢
         * daily : {"visibility":[{"date":"2020-08-04T00:00+08:00","min":5.44,"avg":9.85,"max":24.13},{"date":"2020-08-05T00:00+08:00","min":6.89,"avg":10.38,"max":16.27},{"date":"2020-08-06T00:00+08:00","min":7.24,"avg":11.46,"max":16.27},{"date":"2020-08-07T00:00+08:00","min":6.95,"avg":10.92,"max":16.27},{"date":"2020-08-08T00:00+08:00","min":6.25,"avg":10.34,"max":16.27}],"air_quality":{"pm25":[{"date":"2020-08-04T00:00+08:00","avg":3.87,"min":3,"max":5},{"date":"2020-08-05T00:00+08:00","avg":3.54,"min":3,"max":5},{"date":"2020-08-06T00:00+08:00","avg":5.62,"min":4,"max":9},{"date":"2020-08-07T00:00+08:00","avg":7.46,"min":5,"max":10},{"date":"2020-08-08T00:00+08:00","avg":7.42,"min":6,"max":9}],"aqi":[{"date":"2020-08-04T00:00+08:00","avg":{"usa":7.53,"chn":7.53},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-05T00:00+08:00","avg":{"usa":7.46,"chn":7.46},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-06T00:00+08:00","avg":{"usa":7.96,"chn":7.96},"min":{"usa":7,"chn":7},"max":{"usa":12,"chn":12}},{"date":"2020-08-07T00:00+08:00","avg":{"usa":10.29,"chn":10.29},"min":{"usa":7,"chn":7},"max":{"usa":12,"chn":12}},{"date":"2020-08-08T00:00+08:00","avg":{"usa":10.17,"chn":10.17},"min":{"usa":8,"chn":8},"max":{"usa":13,"chn":13}}]},"pressure":[{"date":"2020-08-04T00:00+08:00","min":98633.88,"avg":99060.87,"max":99323.48},{"date":"2020-08-05T00:00+08:00","min":99243.48,"avg":99344.41,"max":99483.48},{"date":"2020-08-06T00:00+08:00","min":99231.85,"avg":99401.87,"max":99563.48},{"date":"2020-08-07T00:00+08:00","min":99102.25,"avg":99265.79,"max":99403.48},{"date":"2020-08-08T00:00+08:00","min":98942.25,"avg":99088.04,"max":99224.51}],"dswrf":[{"date":"2020-08-04T00:00+08:00","min":0,"avg":298.7,"max":683.7},{"date":"2020-08-05T00:00+08:00","min":0,"avg":301.7,"max":769.3},{"date":"2020-08-06T00:00+08:00","min":0,"avg":317.2,"max":791.5},{"date":"2020-08-07T00:00+08:00","min":0,"avg":293.1,"max":741},{"date":"2020-08-08T00:00+08:00","min":0,"avg":318.1,"max":798.4}],"precipitation":[{"date":"2020-08-04T00:00+08:00","min":0,"avg":2.3384,"max":13.2652},{"date":"2020-08-05T00:00+08:00","min":0,"avg":0.0071,"max":0.0778},{"date":"2020-08-06T00:00+08:00","min":0,"avg":0.0341,"max":0.3662},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.2526,"max":1.7363},{"date":"2020-08-08T00:00+08:00","min":0,"avg":0.2687,"max":1.2713}],"skycon_08h_20h":[{"date":"2020-08-04T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"LIGHT_RAIN"}],"cloudrate":[{"date":"2020-08-04T00:00+08:00","min":0.9,"avg":0.99,"max":1},{"date":"2020-08-05T00:00+08:00","min":0.45,"avg":0.92,"max":1},{"date":"2020-08-06T00:00+08:00","min":0.21,"avg":0.6,"max":0.96},{"date":"2020-08-07T00:00+08:00","min":0.68,"avg":0.89,"max":0.99},{"date":"2020-08-08T00:00+08:00","min":0.01,"avg":0.49,"max":0.9}],"astro":[{"date":"2020-08-04T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-05T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-06T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:35"}},{"date":"2020-08-07T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:34"}},{"date":"2020-08-08T00:00+08:00","sunrise":{"time":"05:24"},"sunset":{"time":"18:33"}}],"skycon_20h_32h":[{"date":"2020-08-04T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"CLEAR_NIGHT"}],"temperature":[{"date":"2020-08-04T00:00+08:00","min":26,"avg":27.86,"max":30.97},{"date":"2020-08-05T00:00+08:00","min":26,"avg":28.71,"max":31},{"date":"2020-08-06T00:00+08:00","min":26,"avg":28.47,"max":31},{"date":"2020-08-07T00:00+08:00","min":26,"avg":28.47,"max":31},{"date":"2020-08-08T00:00+08:00","min":26,"avg":28.46,"max":31}],"skycon":[{"date":"2020-08-04T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"LIGHT_RAIN"}],"humidity":[{"date":"2020-08-04T00:00+08:00","min":0.68,"avg":0.8,"max":0.9},{"date":"2020-08-05T00:00+08:00","min":0.68,"avg":0.77,"max":0.84},{"date":"2020-08-06T00:00+08:00","min":0.64,"avg":0.75,"max":0.82},{"date":"2020-08-07T00:00+08:00","min":0.68,"avg":0.76,"max":0.83},{"date":"2020-08-08T00:00+08:00","min":0.68,"avg":0.77,"max":0.86}],"life_index":{"dressing":[{"date":"2020-08-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-08T00:00+08:00","index":"2","desc":"很热"}],"ultraviolet":[{"date":"2020-08-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-05T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"中等"},{"date":"2020-08-07T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"中等"}],"coldRisk":[{"date":"2020-08-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"易发"}],"carWashing":[{"date":"2020-08-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"较不适宜"}],"comfort":[{"date":"2020-08-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-05T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-07T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-08T00:00+08:00","index":"0","desc":"闷热"}]},"status":"ok","wind":[{"date":"2020-08-04T00:00+08:00","min":{"speed":2.15,"direction":171.35},"avg":{"speed":6.02,"direction":221.83},"max":{"speed":10.76,"direction":253.63}},{"date":"2020-08-05T00:00+08:00","min":{"speed":0.37,"direction":162.66},"avg":{"speed":10.39,"direction":126.61},"max":{"speed":17.47,"direction":125.23}},{"date":"2020-08-06T00:00+08:00","min":{"speed":1.99,"direction":255.8},"avg":{"speed":9.46,"direction":132.95},"max":{"speed":16.48,"direction":153.81}},{"date":"2020-08-07T00:00+08:00","min":{"speed":1.74,"direction":153.17},"avg":{"speed":6.34,"direction":189.09},"max":{"speed":11.52,"direction":258.32}},{"date":"2020-08-08T00:00+08:00","min":{"speed":2.17,"direction":342.05},"avg":{"speed":9.74,"direction":144.11},"max":{"speed":21.17,"direction":148.59}}]}
         * hourly : {"precipitation":[{"datetime":"2020-08-04T09:00+08:00","value":0},{"datetime":"2020-08-04T10:00+08:00","value":0},{"datetime":"2020-08-04T11:00+08:00","value":0.1252},{"datetime":"2020-08-04T12:00+08:00","value":0.0713},{"datetime":"2020-08-04T13:00+08:00","value":0},{"datetime":"2020-08-04T14:00+08:00","value":0},{"datetime":"2020-08-04T15:00+08:00","value":0},{"datetime":"2020-08-04T16:00+08:00","value":0.5953},{"datetime":"2020-08-04T17:00+08:00","value":6.796},{"datetime":"2020-08-04T18:00+08:00","value":2.5179},{"datetime":"2020-08-04T19:00+08:00","value":13.2652},{"datetime":"2020-08-04T20:00+08:00","value":10.9738},{"datetime":"2020-08-04T21:00+08:00","value":0.4283},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0.3037},{"datetime":"2020-08-05T00:00+08:00","value":0.0517},{"datetime":"2020-08-05T01:00+08:00","value":0.0778},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0.0411},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":0},{"datetime":"2020-08-05T08:00+08:00","value":0},{"datetime":"2020-08-05T09:00+08:00","value":0},{"datetime":"2020-08-05T10:00+08:00","value":0},{"datetime":"2020-08-05T11:00+08:00","value":0},{"datetime":"2020-08-05T12:00+08:00","value":0},{"datetime":"2020-08-05T13:00+08:00","value":0},{"datetime":"2020-08-05T14:00+08:00","value":0},{"datetime":"2020-08-05T15:00+08:00","value":0},{"datetime":"2020-08-05T16:00+08:00","value":0},{"datetime":"2020-08-05T17:00+08:00","value":0},{"datetime":"2020-08-05T18:00+08:00","value":0},{"datetime":"2020-08-05T19:00+08:00","value":0},{"datetime":"2020-08-05T20:00+08:00","value":0},{"datetime":"2020-08-05T21:00+08:00","value":0},{"datetime":"2020-08-05T22:00+08:00","value":0},{"datetime":"2020-08-05T23:00+08:00","value":0},{"datetime":"2020-08-06T00:00+08:00","value":0},{"datetime":"2020-08-06T01:00+08:00","value":0},{"datetime":"2020-08-06T02:00+08:00","value":0},{"datetime":"2020-08-06T03:00+08:00","value":0},{"datetime":"2020-08-06T04:00+08:00","value":0},{"datetime":"2020-08-06T05:00+08:00","value":0.1464},{"datetime":"2020-08-06T06:00+08:00","value":0.0975},{"datetime":"2020-08-06T07:00+08:00","value":0},{"datetime":"2020-08-06T08:00+08:00","value":0}],"cloudrate":[{"datetime":"2020-08-04T09:00+08:00","value":0.9},{"datetime":"2020-08-04T10:00+08:00","value":0.9},{"datetime":"2020-08-04T11:00+08:00","value":1},{"datetime":"2020-08-04T12:00+08:00","value":1},{"datetime":"2020-08-04T13:00+08:00","value":1},{"datetime":"2020-08-04T14:00+08:00","value":1},{"datetime":"2020-08-04T15:00+08:00","value":1},{"datetime":"2020-08-04T16:00+08:00","value":1},{"datetime":"2020-08-04T17:00+08:00","value":1},{"datetime":"2020-08-04T18:00+08:00","value":1},{"datetime":"2020-08-04T19:00+08:00","value":1},{"datetime":"2020-08-04T20:00+08:00","value":1},{"datetime":"2020-08-04T21:00+08:00","value":1},{"datetime":"2020-08-04T22:00+08:00","value":1},{"datetime":"2020-08-04T23:00+08:00","value":1},{"datetime":"2020-08-05T00:00+08:00","value":1},{"datetime":"2020-08-05T01:00+08:00","value":1},{"datetime":"2020-08-05T02:00+08:00","value":1},{"datetime":"2020-08-05T03:00+08:00","value":1},{"datetime":"2020-08-05T04:00+08:00","value":1},{"datetime":"2020-08-05T05:00+08:00","value":1},{"datetime":"2020-08-05T06:00+08:00","value":1},{"datetime":"2020-08-05T07:00+08:00","value":1},{"datetime":"2020-08-05T08:00+08:00","value":1},{"datetime":"2020-08-05T09:00+08:00","value":1},{"datetime":"2020-08-05T10:00+08:00","value":1},{"datetime":"2020-08-05T11:00+08:00","value":1},{"datetime":"2020-08-05T12:00+08:00","value":1},{"datetime":"2020-08-05T13:00+08:00","value":1},{"datetime":"2020-08-05T14:00+08:00","value":0.96},{"datetime":"2020-08-05T15:00+08:00","value":0.45},{"datetime":"2020-08-05T16:00+08:00","value":0.69},{"datetime":"2020-08-05T17:00+08:00","value":0.73},{"datetime":"2020-08-05T18:00+08:00","value":0.75},{"datetime":"2020-08-05T19:00+08:00","value":0.78},{"datetime":"2020-08-05T20:00+08:00","value":0.82},{"datetime":"2020-08-05T21:00+08:00","value":1},{"datetime":"2020-08-05T22:00+08:00","value":1},{"datetime":"2020-08-05T23:00+08:00","value":1},{"datetime":"2020-08-06T00:00+08:00","value":0.96},{"datetime":"2020-08-06T01:00+08:00","value":0.89},{"datetime":"2020-08-06T02:00+08:00","value":0.9},{"datetime":"2020-08-06T03:00+08:00","value":0.91},{"datetime":"2020-08-06T04:00+08:00","value":0.81},{"datetime":"2020-08-06T05:00+08:00","value":0.81},{"datetime":"2020-08-06T06:00+08:00","value":0.83},{"datetime":"2020-08-06T07:00+08:00","value":0.79},{"datetime":"2020-08-06T08:00+08:00","value":0.68}],"visibility":[{"datetime":"2020-08-04T09:00+08:00","value":16},{"datetime":"2020-08-04T10:00+08:00","value":16.27},{"datetime":"2020-08-04T11:00+08:00","value":16.27},{"datetime":"2020-08-04T12:00+08:00","value":16.27},{"datetime":"2020-08-04T13:00+08:00","value":13.49},{"datetime":"2020-08-04T14:00+08:00","value":10.28},{"datetime":"2020-08-04T15:00+08:00","value":9.72},{"datetime":"2020-08-04T16:00+08:00","value":7.65},{"datetime":"2020-08-04T17:00+08:00","value":6.75},{"datetime":"2020-08-04T18:00+08:00","value":6.01},{"datetime":"2020-08-04T19:00+08:00","value":5.46},{"datetime":"2020-08-04T20:00+08:00","value":5.44},{"datetime":"2020-08-04T21:00+08:00","value":5.52},{"datetime":"2020-08-04T22:00+08:00","value":5.97},{"datetime":"2020-08-04T23:00+08:00","value":6.58},{"datetime":"2020-08-05T00:00+08:00","value":7.29},{"datetime":"2020-08-05T01:00+08:00","value":7.19},{"datetime":"2020-08-05T02:00+08:00","value":6.89},{"datetime":"2020-08-05T03:00+08:00","value":6.93},{"datetime":"2020-08-05T04:00+08:00","value":7.05},{"datetime":"2020-08-05T05:00+08:00","value":7.37},{"datetime":"2020-08-05T06:00+08:00","value":7.58},{"datetime":"2020-08-05T07:00+08:00","value":8.35},{"datetime":"2020-08-05T08:00+08:00","value":10.07},{"datetime":"2020-08-05T09:00+08:00","value":13.02},{"datetime":"2020-08-05T10:00+08:00","value":16.27},{"datetime":"2020-08-05T11:00+08:00","value":16.27},{"datetime":"2020-08-05T12:00+08:00","value":16.27},{"datetime":"2020-08-05T13:00+08:00","value":16.27},{"datetime":"2020-08-05T14:00+08:00","value":16.27},{"datetime":"2020-08-05T15:00+08:00","value":14.75},{"datetime":"2020-08-05T16:00+08:00","value":12.13},{"datetime":"2020-08-05T17:00+08:00","value":10.54},{"datetime":"2020-08-05T18:00+08:00","value":9.11},{"datetime":"2020-08-05T19:00+08:00","value":8.28},{"datetime":"2020-08-05T20:00+08:00","value":8.32},{"datetime":"2020-08-05T21:00+08:00","value":7.99},{"datetime":"2020-08-05T22:00+08:00","value":7.63},{"datetime":"2020-08-05T23:00+08:00","value":7.37},{"datetime":"2020-08-06T00:00+08:00","value":7.48},{"datetime":"2020-08-06T01:00+08:00","value":7.37},{"datetime":"2020-08-06T02:00+08:00","value":7.37},{"datetime":"2020-08-06T03:00+08:00","value":7.24},{"datetime":"2020-08-06T04:00+08:00","value":7.37},{"datetime":"2020-08-06T05:00+08:00","value":7.82},{"datetime":"2020-08-06T06:00+08:00","value":8.25},{"datetime":"2020-08-06T07:00+08:00","value":10.16},{"datetime":"2020-08-06T08:00+08:00","value":16.27}],"temperature":[{"datetime":"2020-08-04T09:00+08:00","value":30.16},{"datetime":"2020-08-04T10:00+08:00","value":30.97},{"datetime":"2020-08-04T11:00+08:00","value":30.77},{"datetime":"2020-08-04T12:00+08:00","value":30.58},{"datetime":"2020-08-04T13:00+08:00","value":29.39},{"datetime":"2020-08-04T14:00+08:00","value":28.19},{"datetime":"2020-08-04T15:00+08:00","value":27.8},{"datetime":"2020-08-04T16:00+08:00","value":26.8},{"datetime":"2020-08-04T17:00+08:00","value":26.7},{"datetime":"2020-08-04T18:00+08:00","value":26.6},{"datetime":"2020-08-04T19:00+08:00","value":26},{"datetime":"2020-08-04T20:00+08:00","value":26},{"datetime":"2020-08-04T21:00+08:00","value":26},{"datetime":"2020-08-04T22:00+08:00","value":26},{"datetime":"2020-08-04T23:00+08:00","value":26},{"datetime":"2020-08-05T00:00+08:00","value":26},{"datetime":"2020-08-05T01:00+08:00","value":26},{"datetime":"2020-08-05T02:00+08:00","value":26},{"datetime":"2020-08-05T03:00+08:00","value":26},{"datetime":"2020-08-05T04:00+08:00","value":26},{"datetime":"2020-08-05T05:00+08:00","value":26.5},{"datetime":"2020-08-05T06:00+08:00","value":27.4},{"datetime":"2020-08-05T07:00+08:00","value":28.3},{"datetime":"2020-08-05T08:00+08:00","value":28.8},{"datetime":"2020-08-05T09:00+08:00","value":29.68},{"datetime":"2020-08-05T10:00+08:00","value":30.54},{"datetime":"2020-08-05T11:00+08:00","value":30.86},{"datetime":"2020-08-05T12:00+08:00","value":30.88},{"datetime":"2020-08-05T13:00+08:00","value":30.95},{"datetime":"2020-08-05T14:00+08:00","value":31},{"datetime":"2020-08-05T15:00+08:00","value":30.93},{"datetime":"2020-08-05T16:00+08:00","value":30.78},{"datetime":"2020-08-05T17:00+08:00","value":30.54},{"datetime":"2020-08-05T18:00+08:00","value":30.15},{"datetime":"2020-08-05T19:00+08:00","value":29.64},{"datetime":"2020-08-05T20:00+08:00","value":28.88},{"datetime":"2020-08-05T21:00+08:00","value":28.3},{"datetime":"2020-08-05T22:00+08:00","value":27.69},{"datetime":"2020-08-05T23:00+08:00","value":27.2},{"datetime":"2020-08-06T00:00+08:00","value":26.79},{"datetime":"2020-08-06T01:00+08:00","value":26.53},{"datetime":"2020-08-06T02:00+08:00","value":26.74},{"datetime":"2020-08-06T03:00+08:00","value":27},{"datetime":"2020-08-06T04:00+08:00","value":27.31},{"datetime":"2020-08-06T05:00+08:00","value":26},{"datetime":"2020-08-06T06:00+08:00","value":28.06},{"datetime":"2020-08-06T07:00+08:00","value":28.23},{"datetime":"2020-08-06T08:00+08:00","value":28.33}],"skycon":[{"datetime":"2020-08-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T11:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T13:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T16:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T17:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-04T18:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T19:00+08:00","value":"STORM_RAIN"},{"datetime":"2020-08-04T20:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-04T21:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T23:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T01:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T12:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T13:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T15:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T16:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T17:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T18:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-08-05T19:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-08-05T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T05:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-06T06:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-06T07:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-06T08:00+08:00","value":"PARTLY_CLOUDY_DAY"}],"description":"阴，今天中午11点钟后转小雨，其后阴","humidity":[{"datetime":"2020-08-04T09:00+08:00","value":0.74},{"datetime":"2020-08-04T10:00+08:00","value":0.68},{"datetime":"2020-08-04T11:00+08:00","value":0.68},{"datetime":"2020-08-04T12:00+08:00","value":0.7},{"datetime":"2020-08-04T13:00+08:00","value":0.72},{"datetime":"2020-08-04T14:00+08:00","value":0.76},{"datetime":"2020-08-04T15:00+08:00","value":0.77},{"datetime":"2020-08-04T16:00+08:00","value":0.81},{"datetime":"2020-08-04T17:00+08:00","value":0.84},{"datetime":"2020-08-04T18:00+08:00","value":0.87},{"datetime":"2020-08-04T19:00+08:00","value":0.9},{"datetime":"2020-08-04T20:00+08:00","value":0.9},{"datetime":"2020-08-04T21:00+08:00","value":0.89},{"datetime":"2020-08-04T22:00+08:00","value":0.87},{"datetime":"2020-08-04T23:00+08:00","value":0.85},{"datetime":"2020-08-05T00:00+08:00","value":0.82},{"datetime":"2020-08-05T01:00+08:00","value":0.83},{"datetime":"2020-08-05T02:00+08:00","value":0.84},{"datetime":"2020-08-05T03:00+08:00","value":0.83},{"datetime":"2020-08-05T04:00+08:00","value":0.83},{"datetime":"2020-08-05T05:00+08:00","value":0.82},{"datetime":"2020-08-05T06:00+08:00","value":0.81},{"datetime":"2020-08-05T07:00+08:00","value":0.79},{"datetime":"2020-08-05T08:00+08:00","value":0.76},{"datetime":"2020-08-05T09:00+08:00","value":0.72},{"datetime":"2020-08-05T10:00+08:00","value":0.7},{"datetime":"2020-08-05T11:00+08:00","value":0.68},{"datetime":"2020-08-05T12:00+08:00","value":0.68},{"datetime":"2020-08-05T13:00+08:00","value":0.69},{"datetime":"2020-08-05T14:00+08:00","value":0.69},{"datetime":"2020-08-05T15:00+08:00","value":0.71},{"datetime":"2020-08-05T16:00+08:00","value":0.73},{"datetime":"2020-08-05T17:00+08:00","value":0.75},{"datetime":"2020-08-05T18:00+08:00","value":0.78},{"datetime":"2020-08-05T19:00+08:00","value":0.8},{"datetime":"2020-08-05T20:00+08:00","value":0.8},{"datetime":"2020-08-05T21:00+08:00","value":0.8},{"datetime":"2020-08-05T22:00+08:00","value":0.81},{"datetime":"2020-08-05T23:00+08:00","value":0.82},{"datetime":"2020-08-06T00:00+08:00","value":0.82},{"datetime":"2020-08-06T01:00+08:00","value":0.82},{"datetime":"2020-08-06T02:00+08:00","value":0.82},{"datetime":"2020-08-06T03:00+08:00","value":0.82},{"datetime":"2020-08-06T04:00+08:00","value":0.82},{"datetime":"2020-08-06T05:00+08:00","value":0.81},{"datetime":"2020-08-06T06:00+08:00","value":0.8},{"datetime":"2020-08-06T07:00+08:00","value":0.76},{"datetime":"2020-08-06T08:00+08:00","value":0.7}],"air_quality":{"pm25":[{"datetime":"2020-08-04T09:00+08:00","value":4},{"datetime":"2020-08-04T10:00+08:00","value":3},{"datetime":"2020-08-04T11:00+08:00","value":3},{"datetime":"2020-08-04T12:00+08:00","value":4},{"datetime":"2020-08-04T13:00+08:00","value":4},{"datetime":"2020-08-04T14:00+08:00","value":4},{"datetime":"2020-08-04T15:00+08:00","value":3},{"datetime":"2020-08-04T16:00+08:00","value":3},{"datetime":"2020-08-04T17:00+08:00","value":3},{"datetime":"2020-08-04T18:00+08:00","value":4},{"datetime":"2020-08-04T19:00+08:00","value":4},{"datetime":"2020-08-04T20:00+08:00","value":4},{"datetime":"2020-08-04T21:00+08:00","value":5},{"datetime":"2020-08-04T22:00+08:00","value":5},{"datetime":"2020-08-04T23:00+08:00","value":5},{"datetime":"2020-08-05T00:00+08:00","value":5},{"datetime":"2020-08-05T01:00+08:00","value":4},{"datetime":"2020-08-05T02:00+08:00","value":4},{"datetime":"2020-08-05T03:00+08:00","value":4},{"datetime":"2020-08-05T04:00+08:00","value":3},{"datetime":"2020-08-05T05:00+08:00","value":3},{"datetime":"2020-08-05T06:00+08:00","value":3},{"datetime":"2020-08-05T07:00+08:00","value":4},{"datetime":"2020-08-05T08:00+08:00","value":4},{"datetime":"2020-08-05T09:00+08:00","value":3},{"datetime":"2020-08-05T10:00+08:00","value":3},{"datetime":"2020-08-05T11:00+08:00","value":3},{"datetime":"2020-08-05T12:00+08:00","value":3},{"datetime":"2020-08-05T13:00+08:00","value":3},{"datetime":"2020-08-05T14:00+08:00","value":3},{"datetime":"2020-08-05T15:00+08:00","value":4},{"datetime":"2020-08-05T16:00+08:00","value":4},{"datetime":"2020-08-05T17:00+08:00","value":4},{"datetime":"2020-08-05T18:00+08:00","value":3},{"datetime":"2020-08-05T19:00+08:00","value":3},{"datetime":"2020-08-05T20:00+08:00","value":3},{"datetime":"2020-08-05T21:00+08:00","value":3},{"datetime":"2020-08-05T22:00+08:00","value":4},{"datetime":"2020-08-05T23:00+08:00","value":5},{"datetime":"2020-08-06T00:00+08:00","value":6},{"datetime":"2020-08-06T01:00+08:00","value":5},{"datetime":"2020-08-06T02:00+08:00","value":5},{"datetime":"2020-08-06T03:00+08:00","value":5},{"datetime":"2020-08-06T04:00+08:00","value":4},{"datetime":"2020-08-06T05:00+08:00","value":4},{"datetime":"2020-08-06T06:00+08:00","value":5},{"datetime":"2020-08-06T07:00+08:00","value":5},{"datetime":"2020-08-06T08:00+08:00","value":5}],"aqi":[{"datetime":"2020-08-04T09:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T12:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T13:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T15:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T18:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T00:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T03:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T06:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T08:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T09:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T12:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T13:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T15:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T18:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T21:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T00:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T03:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T06:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T08:00+08:00","value":{"usa":8,"chn":8}}]},"pressure":[{"datetime":"2020-08-04T09:00+08:00","value":98953.87648},{"datetime":"2020-08-04T10:00+08:00","value":99003.47648},{"datetime":"2020-08-04T11:00+08:00","value":99003.47648},{"datetime":"2020-08-04T12:00+08:00","value":99003.47648},{"datetime":"2020-08-04T13:00+08:00","value":98923.47648},{"datetime":"2020-08-04T14:00+08:00","value":98954.10944},{"datetime":"2020-08-04T15:00+08:00","value":98954.10944},{"datetime":"2020-08-04T16:00+08:00","value":98972.88448},{"datetime":"2020-08-04T17:00+08:00","value":98972.88448},{"datetime":"2020-08-04T18:00+08:00","value":99022.25152},{"datetime":"2020-08-04T19:00+08:00","value":99114.10944},{"datetime":"2020-08-04T20:00+08:00","value":99163.47648},{"datetime":"2020-08-04T21:00+08:00","value":99243.47648},{"datetime":"2020-08-04T22:00+08:00","value":99304.50944},{"datetime":"2020-08-04T23:00+08:00","value":99323.47648},{"datetime":"2020-08-05T00:00+08:00","value":99323.47648},{"datetime":"2020-08-05T01:00+08:00","value":99304.50944},{"datetime":"2020-08-05T02:00+08:00","value":99243.47648},{"datetime":"2020-08-05T03:00+08:00","value":99243.47648},{"datetime":"2020-08-05T04:00+08:00","value":99243.47648},{"datetime":"2020-08-05T05:00+08:00","value":99255.10144},{"datetime":"2020-08-05T06:00+08:00","value":99323.47648},{"datetime":"2020-08-05T07:00+08:00","value":99365.7344},{"datetime":"2020-08-05T08:00+08:00","value":99403.47648},{"datetime":"2020-08-05T09:00+08:00","value":99403.47648},{"datetime":"2020-08-05T10:00+08:00","value":99483.47648},{"datetime":"2020-08-05T11:00+08:00","value":99471.85152},{"datetime":"2020-08-05T12:00+08:00","value":99403.47648},{"datetime":"2020-08-05T13:00+08:00","value":99323.47648},{"datetime":"2020-08-05T14:00+08:00","value":99262.25152},{"datetime":"2020-08-05T15:00+08:00","value":99243.47648},{"datetime":"2020-08-05T16:00+08:00","value":99243.47648},{"datetime":"2020-08-05T17:00+08:00","value":99262.25152},{"datetime":"2020-08-05T18:00+08:00","value":99273.87648},{"datetime":"2020-08-05T19:00+08:00","value":99353.87648},{"datetime":"2020-08-05T20:00+08:00","value":99403.28448},{"datetime":"2020-08-05T21:00+08:00","value":99464.50944},{"datetime":"2020-08-05T22:00+08:00","value":99483.47648},{"datetime":"2020-08-05T23:00+08:00","value":99483.47648},{"datetime":"2020-08-06T00:00+08:00","value":99464.50944},{"datetime":"2020-08-06T01:00+08:00","value":99403.47648},{"datetime":"2020-08-06T02:00+08:00","value":99335.10144},{"datetime":"2020-08-06T03:00+08:00","value":99335.10144},{"datetime":"2020-08-06T04:00+08:00","value":99335.10144},{"datetime":"2020-08-06T05:00+08:00","value":99403.47648},{"datetime":"2020-08-06T06:00+08:00","value":99433.87648},{"datetime":"2020-08-06T07:00+08:00","value":99483.47648},{"datetime":"2020-08-06T08:00+08:00","value":99525.7344}],"dswrf":[{"datetime":"2020-08-04T09:00+08:00","value":513.77088},{"datetime":"2020-08-04T10:00+08:00","value":606.14176},{"datetime":"2020-08-04T11:00+08:00","value":653.327232},{"datetime":"2020-08-04T12:00+08:00","value":683.690592},{"datetime":"2020-08-04T13:00+08:00","value":673.515808},{"datetime":"2020-08-04T14:00+08:00","value":615.383744},{"datetime":"2020-08-04T15:00+08:00","value":212.07712},{"datetime":"2020-08-04T16:00+08:00","value":157.75744},{"datetime":"2020-08-04T17:00+08:00","value":124.26464},{"datetime":"2020-08-04T18:00+08:00","value":97.83648},{"datetime":"2020-08-04T19:00+08:00","value":77.735136},{"datetime":"2020-08-04T20:00+08:00","value":64.691072},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":24.619488},{"datetime":"2020-08-05T08:00+08:00","value":70.536256},{"datetime":"2020-08-05T09:00+08:00","value":529.06848},{"datetime":"2020-08-05T10:00+08:00","value":630.57472},{"datetime":"2020-08-05T11:00+08:00","value":701.98224},{"datetime":"2020-08-05T12:00+08:00","value":745.306176},{"datetime":"2020-08-05T13:00+08:00","value":761.400288},{"datetime":"2020-08-05T14:00+08:00","value":769.255008},{"datetime":"2020-08-05T15:00+08:00","value":726.58336},{"datetime":"2020-08-05T16:00+08:00","value":638.59584},{"datetime":"2020-08-05T17:00+08:00","value":542.9312},{"datetime":"2020-08-05T18:00+08:00","value":444.91968},{"datetime":"2020-08-05T19:00+08:00","value":357.134592},{"datetime":"2020-08-05T20:00+08:00","value":297.84336},{"datetime":"2020-08-05T21:00+08:00","value":0},{"datetime":"2020-08-05T22:00+08:00","value":0},{"datetime":"2020-08-05T23:00+08:00","value":0},{"datetime":"2020-08-06T00:00+08:00","value":0},{"datetime":"2020-08-06T01:00+08:00","value":0},{"datetime":"2020-08-06T02:00+08:00","value":0},{"datetime":"2020-08-06T03:00+08:00","value":0},{"datetime":"2020-08-06T04:00+08:00","value":0},{"datetime":"2020-08-06T05:00+08:00","value":0},{"datetime":"2020-08-06T06:00+08:00","value":0},{"datetime":"2020-08-06T07:00+08:00","value":34.766848},{"datetime":"2020-08-06T08:00+08:00","value":94.473312}],"status":"ok","wind":[{"datetime":"2020-08-04T09:00+08:00","speed":6.84,"direction":220},{"datetime":"2020-08-04T10:00+08:00","speed":7.42,"direction":22.43},{"datetime":"2020-08-04T11:00+08:00","speed":9.23,"direction":30.6},{"datetime":"2020-08-04T12:00+08:00","speed":10.48,"direction":33.47},{"datetime":"2020-08-04T13:00+08:00","speed":4.38,"direction":40.45},{"datetime":"2020-08-04T14:00+08:00","speed":4.16,"direction":230.4},{"datetime":"2020-08-04T15:00+08:00","speed":6.07,"direction":228.75},{"datetime":"2020-08-04T16:00+08:00","speed":3.25,"direction":158.12},{"datetime":"2020-08-04T17:00+08:00","speed":2.94,"direction":183.44},{"datetime":"2020-08-04T18:00+08:00","speed":10.76,"direction":253.63},{"datetime":"2020-08-04T19:00+08:00","speed":8.26,"direction":241.14},{"datetime":"2020-08-04T20:00+08:00","speed":5,"direction":244.32},{"datetime":"2020-08-04T21:00+08:00","speed":9.12,"direction":259.44},{"datetime":"2020-08-04T22:00+08:00","speed":9.12,"direction":245.58},{"datetime":"2020-08-04T23:00+08:00","speed":4.01,"direction":234.4},{"datetime":"2020-08-05T00:00+08:00","speed":0.37,"direction":162.66},{"datetime":"2020-08-05T01:00+08:00","speed":4.54,"direction":86.92},{"datetime":"2020-08-05T02:00+08:00","speed":4.05,"direction":97.21},{"datetime":"2020-08-05T03:00+08:00","speed":1.58,"direction":118.23},{"datetime":"2020-08-05T04:00+08:00","speed":2.06,"direction":138.96},{"datetime":"2020-08-05T05:00+08:00","speed":2.19,"direction":140.66},{"datetime":"2020-08-05T06:00+08:00","speed":2.92,"direction":113.35},{"datetime":"2020-08-05T07:00+08:00","speed":4.82,"direction":87.03},{"datetime":"2020-08-05T08:00+08:00","speed":7.1,"direction":76.29},{"datetime":"2020-08-05T09:00+08:00","speed":8.33,"direction":81.9},{"datetime":"2020-08-05T10:00+08:00","speed":9.64,"direction":86.66},{"datetime":"2020-08-05T11:00+08:00","speed":12.11,"direction":97.6},{"datetime":"2020-08-05T12:00+08:00","speed":14.89,"direction":107.99},{"datetime":"2020-08-05T13:00+08:00","speed":17.35,"direction":116.54},{"datetime":"2020-08-05T14:00+08:00","speed":16.86,"direction":123.62},{"datetime":"2020-08-05T15:00+08:00","speed":17.47,"direction":125.23},{"datetime":"2020-08-05T16:00+08:00","speed":17.27,"direction":129.74},{"datetime":"2020-08-05T17:00+08:00","speed":14.6,"direction":137.89},{"datetime":"2020-08-05T18:00+08:00","speed":14.49,"direction":139.98},{"datetime":"2020-08-05T19:00+08:00","speed":15.63,"direction":150.25},{"datetime":"2020-08-05T20:00+08:00","speed":15.02,"direction":155.03},{"datetime":"2020-08-05T21:00+08:00","speed":15.92,"direction":150.87},{"datetime":"2020-08-05T22:00+08:00","speed":15.37,"direction":151.2},{"datetime":"2020-08-05T23:00+08:00","speed":14.78,"direction":153.27},{"datetime":"2020-08-06T00:00+08:00","speed":16.48,"direction":153.81},{"datetime":"2020-08-06T01:00+08:00","speed":11.3,"direction":165.9},{"datetime":"2020-08-06T02:00+08:00","speed":9.84,"direction":169.74},{"datetime":"2020-08-06T03:00+08:00","speed":8.75,"direction":187.54},{"datetime":"2020-08-06T04:00+08:00","speed":7.3,"direction":204.98},{"datetime":"2020-08-06T05:00+08:00","speed":4.99,"direction":206.04},{"datetime":"2020-08-06T06:00+08:00","speed":4.07,"direction":198.15},{"datetime":"2020-08-06T07:00+08:00","speed":4.49,"direction":212.93},{"datetime":"2020-08-06T08:00+08:00","speed":1.99,"direction":255.8}]}
         * minutely : {"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"datasource":"radar","probability":[0,0,0,0],"description":"您北边13公里正下着暴雨呢","status":"ok"}
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
             * visibility : 16.0
             * air_quality : {"no2":0,"pm25":4,"o3":0,"so2":0,"pm10":0,"aqi":{"usa":0,"chn":8},"description":{"usa":"","chn":"优"},"co":0}
             * dswrf : 513.8
             * pressure : 98953.88
             * precipitation : {"nearest":{"intensity":2,"distance":13,"status":"ok"},"local":{"intensity":0,"datasource":"radar","status":"ok"}}
             * cloudrate : 0.9
             * temperature : 30.16
             * skycon : CLOUDY
             * humidity : 0.74
             * apparent_temperature : 33.7
             * life_index : {"ultraviolet":{"index":1,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}}
             * status : ok
             * wind : {"speed":6.84,"direction":220}
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
                 * pm25 : 4
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
                 * nearest : {"intensity":2,"distance":13,"status":"ok"}
                 * local : {"intensity":0,"datasource":"radar","status":"ok"}
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
                     * distance : 13.0
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
                     * intensity : 0.0
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
                 * ultraviolet : {"index":1,"desc":"很弱"}
                 * comfort : {"index":0,"desc":"闷热"}
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
                     * index : 1.0
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
                     * index : 0
                     * desc : 闷热
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
                 * speed : 6.84
                 * direction : 220.0
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
             * visibility : [{"date":"2020-08-04T00:00+08:00","min":5.44,"avg":9.85,"max":24.13},{"date":"2020-08-05T00:00+08:00","min":6.89,"avg":10.38,"max":16.27},{"date":"2020-08-06T00:00+08:00","min":7.24,"avg":11.46,"max":16.27},{"date":"2020-08-07T00:00+08:00","min":6.95,"avg":10.92,"max":16.27},{"date":"2020-08-08T00:00+08:00","min":6.25,"avg":10.34,"max":16.27}]
             * air_quality : {"pm25":[{"date":"2020-08-04T00:00+08:00","avg":3.87,"min":3,"max":5},{"date":"2020-08-05T00:00+08:00","avg":3.54,"min":3,"max":5},{"date":"2020-08-06T00:00+08:00","avg":5.62,"min":4,"max":9},{"date":"2020-08-07T00:00+08:00","avg":7.46,"min":5,"max":10},{"date":"2020-08-08T00:00+08:00","avg":7.42,"min":6,"max":9}],"aqi":[{"date":"2020-08-04T00:00+08:00","avg":{"usa":7.53,"chn":7.53},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-05T00:00+08:00","avg":{"usa":7.46,"chn":7.46},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-06T00:00+08:00","avg":{"usa":7.96,"chn":7.96},"min":{"usa":7,"chn":7},"max":{"usa":12,"chn":12}},{"date":"2020-08-07T00:00+08:00","avg":{"usa":10.29,"chn":10.29},"min":{"usa":7,"chn":7},"max":{"usa":12,"chn":12}},{"date":"2020-08-08T00:00+08:00","avg":{"usa":10.17,"chn":10.17},"min":{"usa":8,"chn":8},"max":{"usa":13,"chn":13}}]}
             * pressure : [{"date":"2020-08-04T00:00+08:00","min":98633.88,"avg":99060.87,"max":99323.48},{"date":"2020-08-05T00:00+08:00","min":99243.48,"avg":99344.41,"max":99483.48},{"date":"2020-08-06T00:00+08:00","min":99231.85,"avg":99401.87,"max":99563.48},{"date":"2020-08-07T00:00+08:00","min":99102.25,"avg":99265.79,"max":99403.48},{"date":"2020-08-08T00:00+08:00","min":98942.25,"avg":99088.04,"max":99224.51}]
             * dswrf : [{"date":"2020-08-04T00:00+08:00","min":0,"avg":298.7,"max":683.7},{"date":"2020-08-05T00:00+08:00","min":0,"avg":301.7,"max":769.3},{"date":"2020-08-06T00:00+08:00","min":0,"avg":317.2,"max":791.5},{"date":"2020-08-07T00:00+08:00","min":0,"avg":293.1,"max":741},{"date":"2020-08-08T00:00+08:00","min":0,"avg":318.1,"max":798.4}]
             * precipitation : [{"date":"2020-08-04T00:00+08:00","min":0,"avg":2.3384,"max":13.2652},{"date":"2020-08-05T00:00+08:00","min":0,"avg":0.0071,"max":0.0778},{"date":"2020-08-06T00:00+08:00","min":0,"avg":0.0341,"max":0.3662},{"date":"2020-08-07T00:00+08:00","min":0,"avg":0.2526,"max":1.7363},{"date":"2020-08-08T00:00+08:00","min":0,"avg":0.2687,"max":1.2713}]
             * skycon_08h_20h : [{"date":"2020-08-04T00:00+08:00","value":"MODERATE_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"LIGHT_RAIN"}]
             * cloudrate : [{"date":"2020-08-04T00:00+08:00","min":0.9,"avg":0.99,"max":1},{"date":"2020-08-05T00:00+08:00","min":0.45,"avg":0.92,"max":1},{"date":"2020-08-06T00:00+08:00","min":0.21,"avg":0.6,"max":0.96},{"date":"2020-08-07T00:00+08:00","min":0.68,"avg":0.89,"max":0.99},{"date":"2020-08-08T00:00+08:00","min":0.01,"avg":0.49,"max":0.9}]
             * astro : [{"date":"2020-08-04T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-05T00:00+08:00","sunrise":{"time":"05:22"},"sunset":{"time":"18:36"}},{"date":"2020-08-06T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:35"}},{"date":"2020-08-07T00:00+08:00","sunrise":{"time":"05:23"},"sunset":{"time":"18:34"}},{"date":"2020-08-08T00:00+08:00","sunrise":{"time":"05:24"},"sunset":{"time":"18:33"}}]
             * skycon_20h_32h : [{"date":"2020-08-04T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"CLEAR_NIGHT"}]
             * temperature : [{"date":"2020-08-04T00:00+08:00","min":26,"avg":27.86,"max":30.97},{"date":"2020-08-05T00:00+08:00","min":26,"avg":28.71,"max":31},{"date":"2020-08-06T00:00+08:00","min":26,"avg":28.47,"max":31},{"date":"2020-08-07T00:00+08:00","min":26,"avg":28.47,"max":31},{"date":"2020-08-08T00:00+08:00","min":26,"avg":28.46,"max":31}]
             * skycon : [{"date":"2020-08-04T00:00+08:00","value":"HEAVY_RAIN"},{"date":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-08-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-07T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-08-08T00:00+08:00","value":"LIGHT_RAIN"}]
             * humidity : [{"date":"2020-08-04T00:00+08:00","min":0.68,"avg":0.8,"max":0.9},{"date":"2020-08-05T00:00+08:00","min":0.68,"avg":0.77,"max":0.84},{"date":"2020-08-06T00:00+08:00","min":0.64,"avg":0.75,"max":0.82},{"date":"2020-08-07T00:00+08:00","min":0.68,"avg":0.76,"max":0.83},{"date":"2020-08-08T00:00+08:00","min":0.68,"avg":0.77,"max":0.86}]
             * life_index : {"dressing":[{"date":"2020-08-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-08T00:00+08:00","index":"2","desc":"很热"}],"ultraviolet":[{"date":"2020-08-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-05T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"中等"},{"date":"2020-08-07T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"中等"}],"coldRisk":[{"date":"2020-08-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"易发"}],"carWashing":[{"date":"2020-08-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"较不适宜"}],"comfort":[{"date":"2020-08-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-05T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-07T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-08T00:00+08:00","index":"0","desc":"闷热"}]}
             * status : ok
             * wind : [{"date":"2020-08-04T00:00+08:00","min":{"speed":2.15,"direction":171.35},"avg":{"speed":6.02,"direction":221.83},"max":{"speed":10.76,"direction":253.63}},{"date":"2020-08-05T00:00+08:00","min":{"speed":0.37,"direction":162.66},"avg":{"speed":10.39,"direction":126.61},"max":{"speed":17.47,"direction":125.23}},{"date":"2020-08-06T00:00+08:00","min":{"speed":1.99,"direction":255.8},"avg":{"speed":9.46,"direction":132.95},"max":{"speed":16.48,"direction":153.81}},{"date":"2020-08-07T00:00+08:00","min":{"speed":1.74,"direction":153.17},"avg":{"speed":6.34,"direction":189.09},"max":{"speed":11.52,"direction":258.32}},{"date":"2020-08-08T00:00+08:00","min":{"speed":2.17,"direction":342.05},"avg":{"speed":9.74,"direction":144.11},"max":{"speed":21.17,"direction":148.59}}]
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
                 * date : 2020-08-04T00:00+08:00
                 * min : 5.44
                 * avg : 9.85
                 * max : 24.13
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
                 * pm25 : [{"date":"2020-08-04T00:00+08:00","avg":3.87,"min":3,"max":5},{"date":"2020-08-05T00:00+08:00","avg":3.54,"min":3,"max":5},{"date":"2020-08-06T00:00+08:00","avg":5.62,"min":4,"max":9},{"date":"2020-08-07T00:00+08:00","avg":7.46,"min":5,"max":10},{"date":"2020-08-08T00:00+08:00","avg":7.42,"min":6,"max":9}]
                 * aqi : [{"date":"2020-08-04T00:00+08:00","avg":{"usa":7.53,"chn":7.53},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-05T00:00+08:00","avg":{"usa":7.46,"chn":7.46},"min":{"usa":7,"chn":7},"max":{"usa":8,"chn":8}},{"date":"2020-08-06T00:00+08:00","avg":{"usa":7.96,"chn":7.96},"min":{"usa":7,"chn":7},"max":{"usa":12,"chn":12}},{"date":"2020-08-07T00:00+08:00","avg":{"usa":10.29,"chn":10.29},"min":{"usa":7,"chn":7},"max":{"usa":12,"chn":12}},{"date":"2020-08-08T00:00+08:00","avg":{"usa":10.17,"chn":10.17},"min":{"usa":8,"chn":8},"max":{"usa":13,"chn":13}}]
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
                     * date : 2020-08-04T00:00+08:00
                     * avg : 3.87
                     * min : 3
                     * max : 5
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
                     * date : 2020-08-04T00:00+08:00
                     * avg : {"usa":7.53,"chn":7.53}
                     * min : {"usa":7,"chn":7}
                     * max : {"usa":8,"chn":8}
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
                         * usa : 7.53
                         * chn : 7.53
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
                 * date : 2020-08-04T00:00+08:00
                 * min : 98633.88
                 * avg : 99060.87
                 * max : 99323.48
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
                 * date : 2020-08-04T00:00+08:00
                 * min : 0.0
                 * avg : 298.7
                 * max : 683.7
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
                 * date : 2020-08-04T00:00+08:00
                 * min : 0.0
                 * avg : 2.3384
                 * max : 13.2652
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
                 * date : 2020-08-04T00:00+08:00
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

            public class CloudrateEntity {
                /**
                 * date : 2020-08-04T00:00+08:00
                 * min : 0.9
                 * avg : 0.99
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
                 * date : 2020-08-04T00:00+08:00
                 * sunrise : {"time":"05:22"}
                 * sunset : {"time":"18:36"}
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
                     * time : 05:22
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
                     * time : 18:36
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
                 * date : 2020-08-04T00:00+08:00
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

            public class TemperatureEntity {
                /**
                 * date : 2020-08-04T00:00+08:00
                 * min : 26.0
                 * avg : 27.86
                 * max : 30.97
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
                 * date : 2020-08-04T00:00+08:00
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

            public class HumidityEntity {
                /**
                 * date : 2020-08-04T00:00+08:00
                 * min : 0.68
                 * avg : 0.8
                 * max : 0.9
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
                 * dressing : [{"date":"2020-08-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-07T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-08-08T00:00+08:00","index":"2","desc":"很热"}]
                 * ultraviolet : [{"date":"2020-08-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-05T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"中等"},{"date":"2020-08-07T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"中等"}]
                 * coldRisk : [{"date":"2020-08-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"易发"}]
                 * carWashing : [{"date":"2020-08-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-07T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-08-08T00:00+08:00","index":"3","desc":"较不适宜"}]
                 * comfort : [{"date":"2020-08-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-05T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-06T00:00+08:00","index":"3","desc":"热"},{"date":"2020-08-07T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-08-08T00:00+08:00","index":"0","desc":"闷热"}]
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
                     * date : 2020-08-04T00:00+08:00
                     * index : 2
                     * desc : 很热
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
                     * date : 2020-08-04T00:00+08:00
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
                     * date : 2020-08-04T00:00+08:00
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
                     * date : 2020-08-04T00:00+08:00
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
                     * date : 2020-08-04T00:00+08:00
                     * index : 0
                     * desc : 闷热
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
                 * date : 2020-08-04T00:00+08:00
                 * min : {"speed":2.15,"direction":171.35}
                 * avg : {"speed":6.02,"direction":221.83}
                 * max : {"speed":10.76,"direction":253.63}
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
                     * speed : 2.15
                     * direction : 171.35
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
                     * speed : 6.02
                     * direction : 221.83
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
                     * speed : 10.76
                     * direction : 253.63
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
             * precipitation : [{"datetime":"2020-08-04T09:00+08:00","value":0},{"datetime":"2020-08-04T10:00+08:00","value":0},{"datetime":"2020-08-04T11:00+08:00","value":0.1252},{"datetime":"2020-08-04T12:00+08:00","value":0.0713},{"datetime":"2020-08-04T13:00+08:00","value":0},{"datetime":"2020-08-04T14:00+08:00","value":0},{"datetime":"2020-08-04T15:00+08:00","value":0},{"datetime":"2020-08-04T16:00+08:00","value":0.5953},{"datetime":"2020-08-04T17:00+08:00","value":6.796},{"datetime":"2020-08-04T18:00+08:00","value":2.5179},{"datetime":"2020-08-04T19:00+08:00","value":13.2652},{"datetime":"2020-08-04T20:00+08:00","value":10.9738},{"datetime":"2020-08-04T21:00+08:00","value":0.4283},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0.3037},{"datetime":"2020-08-05T00:00+08:00","value":0.0517},{"datetime":"2020-08-05T01:00+08:00","value":0.0778},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0.0411},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":0},{"datetime":"2020-08-05T08:00+08:00","value":0},{"datetime":"2020-08-05T09:00+08:00","value":0},{"datetime":"2020-08-05T10:00+08:00","value":0},{"datetime":"2020-08-05T11:00+08:00","value":0},{"datetime":"2020-08-05T12:00+08:00","value":0},{"datetime":"2020-08-05T13:00+08:00","value":0},{"datetime":"2020-08-05T14:00+08:00","value":0},{"datetime":"2020-08-05T15:00+08:00","value":0},{"datetime":"2020-08-05T16:00+08:00","value":0},{"datetime":"2020-08-05T17:00+08:00","value":0},{"datetime":"2020-08-05T18:00+08:00","value":0},{"datetime":"2020-08-05T19:00+08:00","value":0},{"datetime":"2020-08-05T20:00+08:00","value":0},{"datetime":"2020-08-05T21:00+08:00","value":0},{"datetime":"2020-08-05T22:00+08:00","value":0},{"datetime":"2020-08-05T23:00+08:00","value":0},{"datetime":"2020-08-06T00:00+08:00","value":0},{"datetime":"2020-08-06T01:00+08:00","value":0},{"datetime":"2020-08-06T02:00+08:00","value":0},{"datetime":"2020-08-06T03:00+08:00","value":0},{"datetime":"2020-08-06T04:00+08:00","value":0},{"datetime":"2020-08-06T05:00+08:00","value":0.1464},{"datetime":"2020-08-06T06:00+08:00","value":0.0975},{"datetime":"2020-08-06T07:00+08:00","value":0},{"datetime":"2020-08-06T08:00+08:00","value":0}]
             * cloudrate : [{"datetime":"2020-08-04T09:00+08:00","value":0.9},{"datetime":"2020-08-04T10:00+08:00","value":0.9},{"datetime":"2020-08-04T11:00+08:00","value":1},{"datetime":"2020-08-04T12:00+08:00","value":1},{"datetime":"2020-08-04T13:00+08:00","value":1},{"datetime":"2020-08-04T14:00+08:00","value":1},{"datetime":"2020-08-04T15:00+08:00","value":1},{"datetime":"2020-08-04T16:00+08:00","value":1},{"datetime":"2020-08-04T17:00+08:00","value":1},{"datetime":"2020-08-04T18:00+08:00","value":1},{"datetime":"2020-08-04T19:00+08:00","value":1},{"datetime":"2020-08-04T20:00+08:00","value":1},{"datetime":"2020-08-04T21:00+08:00","value":1},{"datetime":"2020-08-04T22:00+08:00","value":1},{"datetime":"2020-08-04T23:00+08:00","value":1},{"datetime":"2020-08-05T00:00+08:00","value":1},{"datetime":"2020-08-05T01:00+08:00","value":1},{"datetime":"2020-08-05T02:00+08:00","value":1},{"datetime":"2020-08-05T03:00+08:00","value":1},{"datetime":"2020-08-05T04:00+08:00","value":1},{"datetime":"2020-08-05T05:00+08:00","value":1},{"datetime":"2020-08-05T06:00+08:00","value":1},{"datetime":"2020-08-05T07:00+08:00","value":1},{"datetime":"2020-08-05T08:00+08:00","value":1},{"datetime":"2020-08-05T09:00+08:00","value":1},{"datetime":"2020-08-05T10:00+08:00","value":1},{"datetime":"2020-08-05T11:00+08:00","value":1},{"datetime":"2020-08-05T12:00+08:00","value":1},{"datetime":"2020-08-05T13:00+08:00","value":1},{"datetime":"2020-08-05T14:00+08:00","value":0.96},{"datetime":"2020-08-05T15:00+08:00","value":0.45},{"datetime":"2020-08-05T16:00+08:00","value":0.69},{"datetime":"2020-08-05T17:00+08:00","value":0.73},{"datetime":"2020-08-05T18:00+08:00","value":0.75},{"datetime":"2020-08-05T19:00+08:00","value":0.78},{"datetime":"2020-08-05T20:00+08:00","value":0.82},{"datetime":"2020-08-05T21:00+08:00","value":1},{"datetime":"2020-08-05T22:00+08:00","value":1},{"datetime":"2020-08-05T23:00+08:00","value":1},{"datetime":"2020-08-06T00:00+08:00","value":0.96},{"datetime":"2020-08-06T01:00+08:00","value":0.89},{"datetime":"2020-08-06T02:00+08:00","value":0.9},{"datetime":"2020-08-06T03:00+08:00","value":0.91},{"datetime":"2020-08-06T04:00+08:00","value":0.81},{"datetime":"2020-08-06T05:00+08:00","value":0.81},{"datetime":"2020-08-06T06:00+08:00","value":0.83},{"datetime":"2020-08-06T07:00+08:00","value":0.79},{"datetime":"2020-08-06T08:00+08:00","value":0.68}]
             * visibility : [{"datetime":"2020-08-04T09:00+08:00","value":16},{"datetime":"2020-08-04T10:00+08:00","value":16.27},{"datetime":"2020-08-04T11:00+08:00","value":16.27},{"datetime":"2020-08-04T12:00+08:00","value":16.27},{"datetime":"2020-08-04T13:00+08:00","value":13.49},{"datetime":"2020-08-04T14:00+08:00","value":10.28},{"datetime":"2020-08-04T15:00+08:00","value":9.72},{"datetime":"2020-08-04T16:00+08:00","value":7.65},{"datetime":"2020-08-04T17:00+08:00","value":6.75},{"datetime":"2020-08-04T18:00+08:00","value":6.01},{"datetime":"2020-08-04T19:00+08:00","value":5.46},{"datetime":"2020-08-04T20:00+08:00","value":5.44},{"datetime":"2020-08-04T21:00+08:00","value":5.52},{"datetime":"2020-08-04T22:00+08:00","value":5.97},{"datetime":"2020-08-04T23:00+08:00","value":6.58},{"datetime":"2020-08-05T00:00+08:00","value":7.29},{"datetime":"2020-08-05T01:00+08:00","value":7.19},{"datetime":"2020-08-05T02:00+08:00","value":6.89},{"datetime":"2020-08-05T03:00+08:00","value":6.93},{"datetime":"2020-08-05T04:00+08:00","value":7.05},{"datetime":"2020-08-05T05:00+08:00","value":7.37},{"datetime":"2020-08-05T06:00+08:00","value":7.58},{"datetime":"2020-08-05T07:00+08:00","value":8.35},{"datetime":"2020-08-05T08:00+08:00","value":10.07},{"datetime":"2020-08-05T09:00+08:00","value":13.02},{"datetime":"2020-08-05T10:00+08:00","value":16.27},{"datetime":"2020-08-05T11:00+08:00","value":16.27},{"datetime":"2020-08-05T12:00+08:00","value":16.27},{"datetime":"2020-08-05T13:00+08:00","value":16.27},{"datetime":"2020-08-05T14:00+08:00","value":16.27},{"datetime":"2020-08-05T15:00+08:00","value":14.75},{"datetime":"2020-08-05T16:00+08:00","value":12.13},{"datetime":"2020-08-05T17:00+08:00","value":10.54},{"datetime":"2020-08-05T18:00+08:00","value":9.11},{"datetime":"2020-08-05T19:00+08:00","value":8.28},{"datetime":"2020-08-05T20:00+08:00","value":8.32},{"datetime":"2020-08-05T21:00+08:00","value":7.99},{"datetime":"2020-08-05T22:00+08:00","value":7.63},{"datetime":"2020-08-05T23:00+08:00","value":7.37},{"datetime":"2020-08-06T00:00+08:00","value":7.48},{"datetime":"2020-08-06T01:00+08:00","value":7.37},{"datetime":"2020-08-06T02:00+08:00","value":7.37},{"datetime":"2020-08-06T03:00+08:00","value":7.24},{"datetime":"2020-08-06T04:00+08:00","value":7.37},{"datetime":"2020-08-06T05:00+08:00","value":7.82},{"datetime":"2020-08-06T06:00+08:00","value":8.25},{"datetime":"2020-08-06T07:00+08:00","value":10.16},{"datetime":"2020-08-06T08:00+08:00","value":16.27}]
             * temperature : [{"datetime":"2020-08-04T09:00+08:00","value":30.16},{"datetime":"2020-08-04T10:00+08:00","value":30.97},{"datetime":"2020-08-04T11:00+08:00","value":30.77},{"datetime":"2020-08-04T12:00+08:00","value":30.58},{"datetime":"2020-08-04T13:00+08:00","value":29.39},{"datetime":"2020-08-04T14:00+08:00","value":28.19},{"datetime":"2020-08-04T15:00+08:00","value":27.8},{"datetime":"2020-08-04T16:00+08:00","value":26.8},{"datetime":"2020-08-04T17:00+08:00","value":26.7},{"datetime":"2020-08-04T18:00+08:00","value":26.6},{"datetime":"2020-08-04T19:00+08:00","value":26},{"datetime":"2020-08-04T20:00+08:00","value":26},{"datetime":"2020-08-04T21:00+08:00","value":26},{"datetime":"2020-08-04T22:00+08:00","value":26},{"datetime":"2020-08-04T23:00+08:00","value":26},{"datetime":"2020-08-05T00:00+08:00","value":26},{"datetime":"2020-08-05T01:00+08:00","value":26},{"datetime":"2020-08-05T02:00+08:00","value":26},{"datetime":"2020-08-05T03:00+08:00","value":26},{"datetime":"2020-08-05T04:00+08:00","value":26},{"datetime":"2020-08-05T05:00+08:00","value":26.5},{"datetime":"2020-08-05T06:00+08:00","value":27.4},{"datetime":"2020-08-05T07:00+08:00","value":28.3},{"datetime":"2020-08-05T08:00+08:00","value":28.8},{"datetime":"2020-08-05T09:00+08:00","value":29.68},{"datetime":"2020-08-05T10:00+08:00","value":30.54},{"datetime":"2020-08-05T11:00+08:00","value":30.86},{"datetime":"2020-08-05T12:00+08:00","value":30.88},{"datetime":"2020-08-05T13:00+08:00","value":30.95},{"datetime":"2020-08-05T14:00+08:00","value":31},{"datetime":"2020-08-05T15:00+08:00","value":30.93},{"datetime":"2020-08-05T16:00+08:00","value":30.78},{"datetime":"2020-08-05T17:00+08:00","value":30.54},{"datetime":"2020-08-05T18:00+08:00","value":30.15},{"datetime":"2020-08-05T19:00+08:00","value":29.64},{"datetime":"2020-08-05T20:00+08:00","value":28.88},{"datetime":"2020-08-05T21:00+08:00","value":28.3},{"datetime":"2020-08-05T22:00+08:00","value":27.69},{"datetime":"2020-08-05T23:00+08:00","value":27.2},{"datetime":"2020-08-06T00:00+08:00","value":26.79},{"datetime":"2020-08-06T01:00+08:00","value":26.53},{"datetime":"2020-08-06T02:00+08:00","value":26.74},{"datetime":"2020-08-06T03:00+08:00","value":27},{"datetime":"2020-08-06T04:00+08:00","value":27.31},{"datetime":"2020-08-06T05:00+08:00","value":26},{"datetime":"2020-08-06T06:00+08:00","value":28.06},{"datetime":"2020-08-06T07:00+08:00","value":28.23},{"datetime":"2020-08-06T08:00+08:00","value":28.33}]
             * skycon : [{"datetime":"2020-08-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T11:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T13:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T16:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T17:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-04T18:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-08-04T19:00+08:00","value":"STORM_RAIN"},{"datetime":"2020-08-04T20:00+08:00","value":"HEAVY_RAIN"},{"datetime":"2020-08-04T21:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-04T23:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T01:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T12:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T13:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T15:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T16:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T17:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-05T18:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-08-05T19:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-08-05T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-05T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-08-06T05:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-06T06:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-08-06T07:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-08-06T08:00+08:00","value":"PARTLY_CLOUDY_DAY"}]
             * description : 阴，今天中午11点钟后转小雨，其后阴
             * humidity : [{"datetime":"2020-08-04T09:00+08:00","value":0.74},{"datetime":"2020-08-04T10:00+08:00","value":0.68},{"datetime":"2020-08-04T11:00+08:00","value":0.68},{"datetime":"2020-08-04T12:00+08:00","value":0.7},{"datetime":"2020-08-04T13:00+08:00","value":0.72},{"datetime":"2020-08-04T14:00+08:00","value":0.76},{"datetime":"2020-08-04T15:00+08:00","value":0.77},{"datetime":"2020-08-04T16:00+08:00","value":0.81},{"datetime":"2020-08-04T17:00+08:00","value":0.84},{"datetime":"2020-08-04T18:00+08:00","value":0.87},{"datetime":"2020-08-04T19:00+08:00","value":0.9},{"datetime":"2020-08-04T20:00+08:00","value":0.9},{"datetime":"2020-08-04T21:00+08:00","value":0.89},{"datetime":"2020-08-04T22:00+08:00","value":0.87},{"datetime":"2020-08-04T23:00+08:00","value":0.85},{"datetime":"2020-08-05T00:00+08:00","value":0.82},{"datetime":"2020-08-05T01:00+08:00","value":0.83},{"datetime":"2020-08-05T02:00+08:00","value":0.84},{"datetime":"2020-08-05T03:00+08:00","value":0.83},{"datetime":"2020-08-05T04:00+08:00","value":0.83},{"datetime":"2020-08-05T05:00+08:00","value":0.82},{"datetime":"2020-08-05T06:00+08:00","value":0.81},{"datetime":"2020-08-05T07:00+08:00","value":0.79},{"datetime":"2020-08-05T08:00+08:00","value":0.76},{"datetime":"2020-08-05T09:00+08:00","value":0.72},{"datetime":"2020-08-05T10:00+08:00","value":0.7},{"datetime":"2020-08-05T11:00+08:00","value":0.68},{"datetime":"2020-08-05T12:00+08:00","value":0.68},{"datetime":"2020-08-05T13:00+08:00","value":0.69},{"datetime":"2020-08-05T14:00+08:00","value":0.69},{"datetime":"2020-08-05T15:00+08:00","value":0.71},{"datetime":"2020-08-05T16:00+08:00","value":0.73},{"datetime":"2020-08-05T17:00+08:00","value":0.75},{"datetime":"2020-08-05T18:00+08:00","value":0.78},{"datetime":"2020-08-05T19:00+08:00","value":0.8},{"datetime":"2020-08-05T20:00+08:00","value":0.8},{"datetime":"2020-08-05T21:00+08:00","value":0.8},{"datetime":"2020-08-05T22:00+08:00","value":0.81},{"datetime":"2020-08-05T23:00+08:00","value":0.82},{"datetime":"2020-08-06T00:00+08:00","value":0.82},{"datetime":"2020-08-06T01:00+08:00","value":0.82},{"datetime":"2020-08-06T02:00+08:00","value":0.82},{"datetime":"2020-08-06T03:00+08:00","value":0.82},{"datetime":"2020-08-06T04:00+08:00","value":0.82},{"datetime":"2020-08-06T05:00+08:00","value":0.81},{"datetime":"2020-08-06T06:00+08:00","value":0.8},{"datetime":"2020-08-06T07:00+08:00","value":0.76},{"datetime":"2020-08-06T08:00+08:00","value":0.7}]
             * air_quality : {"pm25":[{"datetime":"2020-08-04T09:00+08:00","value":4},{"datetime":"2020-08-04T10:00+08:00","value":3},{"datetime":"2020-08-04T11:00+08:00","value":3},{"datetime":"2020-08-04T12:00+08:00","value":4},{"datetime":"2020-08-04T13:00+08:00","value":4},{"datetime":"2020-08-04T14:00+08:00","value":4},{"datetime":"2020-08-04T15:00+08:00","value":3},{"datetime":"2020-08-04T16:00+08:00","value":3},{"datetime":"2020-08-04T17:00+08:00","value":3},{"datetime":"2020-08-04T18:00+08:00","value":4},{"datetime":"2020-08-04T19:00+08:00","value":4},{"datetime":"2020-08-04T20:00+08:00","value":4},{"datetime":"2020-08-04T21:00+08:00","value":5},{"datetime":"2020-08-04T22:00+08:00","value":5},{"datetime":"2020-08-04T23:00+08:00","value":5},{"datetime":"2020-08-05T00:00+08:00","value":5},{"datetime":"2020-08-05T01:00+08:00","value":4},{"datetime":"2020-08-05T02:00+08:00","value":4},{"datetime":"2020-08-05T03:00+08:00","value":4},{"datetime":"2020-08-05T04:00+08:00","value":3},{"datetime":"2020-08-05T05:00+08:00","value":3},{"datetime":"2020-08-05T06:00+08:00","value":3},{"datetime":"2020-08-05T07:00+08:00","value":4},{"datetime":"2020-08-05T08:00+08:00","value":4},{"datetime":"2020-08-05T09:00+08:00","value":3},{"datetime":"2020-08-05T10:00+08:00","value":3},{"datetime":"2020-08-05T11:00+08:00","value":3},{"datetime":"2020-08-05T12:00+08:00","value":3},{"datetime":"2020-08-05T13:00+08:00","value":3},{"datetime":"2020-08-05T14:00+08:00","value":3},{"datetime":"2020-08-05T15:00+08:00","value":4},{"datetime":"2020-08-05T16:00+08:00","value":4},{"datetime":"2020-08-05T17:00+08:00","value":4},{"datetime":"2020-08-05T18:00+08:00","value":3},{"datetime":"2020-08-05T19:00+08:00","value":3},{"datetime":"2020-08-05T20:00+08:00","value":3},{"datetime":"2020-08-05T21:00+08:00","value":3},{"datetime":"2020-08-05T22:00+08:00","value":4},{"datetime":"2020-08-05T23:00+08:00","value":5},{"datetime":"2020-08-06T00:00+08:00","value":6},{"datetime":"2020-08-06T01:00+08:00","value":5},{"datetime":"2020-08-06T02:00+08:00","value":5},{"datetime":"2020-08-06T03:00+08:00","value":5},{"datetime":"2020-08-06T04:00+08:00","value":4},{"datetime":"2020-08-06T05:00+08:00","value":4},{"datetime":"2020-08-06T06:00+08:00","value":5},{"datetime":"2020-08-06T07:00+08:00","value":5},{"datetime":"2020-08-06T08:00+08:00","value":5}],"aqi":[{"datetime":"2020-08-04T09:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T12:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T13:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T15:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T18:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T00:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T03:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T06:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T08:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T09:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T12:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T13:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T15:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T18:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T21:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T00:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T03:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T06:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T08:00+08:00","value":{"usa":8,"chn":8}}]}
             * pressure : [{"datetime":"2020-08-04T09:00+08:00","value":98953.87648},{"datetime":"2020-08-04T10:00+08:00","value":99003.47648},{"datetime":"2020-08-04T11:00+08:00","value":99003.47648},{"datetime":"2020-08-04T12:00+08:00","value":99003.47648},{"datetime":"2020-08-04T13:00+08:00","value":98923.47648},{"datetime":"2020-08-04T14:00+08:00","value":98954.10944},{"datetime":"2020-08-04T15:00+08:00","value":98954.10944},{"datetime":"2020-08-04T16:00+08:00","value":98972.88448},{"datetime":"2020-08-04T17:00+08:00","value":98972.88448},{"datetime":"2020-08-04T18:00+08:00","value":99022.25152},{"datetime":"2020-08-04T19:00+08:00","value":99114.10944},{"datetime":"2020-08-04T20:00+08:00","value":99163.47648},{"datetime":"2020-08-04T21:00+08:00","value":99243.47648},{"datetime":"2020-08-04T22:00+08:00","value":99304.50944},{"datetime":"2020-08-04T23:00+08:00","value":99323.47648},{"datetime":"2020-08-05T00:00+08:00","value":99323.47648},{"datetime":"2020-08-05T01:00+08:00","value":99304.50944},{"datetime":"2020-08-05T02:00+08:00","value":99243.47648},{"datetime":"2020-08-05T03:00+08:00","value":99243.47648},{"datetime":"2020-08-05T04:00+08:00","value":99243.47648},{"datetime":"2020-08-05T05:00+08:00","value":99255.10144},{"datetime":"2020-08-05T06:00+08:00","value":99323.47648},{"datetime":"2020-08-05T07:00+08:00","value":99365.7344},{"datetime":"2020-08-05T08:00+08:00","value":99403.47648},{"datetime":"2020-08-05T09:00+08:00","value":99403.47648},{"datetime":"2020-08-05T10:00+08:00","value":99483.47648},{"datetime":"2020-08-05T11:00+08:00","value":99471.85152},{"datetime":"2020-08-05T12:00+08:00","value":99403.47648},{"datetime":"2020-08-05T13:00+08:00","value":99323.47648},{"datetime":"2020-08-05T14:00+08:00","value":99262.25152},{"datetime":"2020-08-05T15:00+08:00","value":99243.47648},{"datetime":"2020-08-05T16:00+08:00","value":99243.47648},{"datetime":"2020-08-05T17:00+08:00","value":99262.25152},{"datetime":"2020-08-05T18:00+08:00","value":99273.87648},{"datetime":"2020-08-05T19:00+08:00","value":99353.87648},{"datetime":"2020-08-05T20:00+08:00","value":99403.28448},{"datetime":"2020-08-05T21:00+08:00","value":99464.50944},{"datetime":"2020-08-05T22:00+08:00","value":99483.47648},{"datetime":"2020-08-05T23:00+08:00","value":99483.47648},{"datetime":"2020-08-06T00:00+08:00","value":99464.50944},{"datetime":"2020-08-06T01:00+08:00","value":99403.47648},{"datetime":"2020-08-06T02:00+08:00","value":99335.10144},{"datetime":"2020-08-06T03:00+08:00","value":99335.10144},{"datetime":"2020-08-06T04:00+08:00","value":99335.10144},{"datetime":"2020-08-06T05:00+08:00","value":99403.47648},{"datetime":"2020-08-06T06:00+08:00","value":99433.87648},{"datetime":"2020-08-06T07:00+08:00","value":99483.47648},{"datetime":"2020-08-06T08:00+08:00","value":99525.7344}]
             * dswrf : [{"datetime":"2020-08-04T09:00+08:00","value":513.77088},{"datetime":"2020-08-04T10:00+08:00","value":606.14176},{"datetime":"2020-08-04T11:00+08:00","value":653.327232},{"datetime":"2020-08-04T12:00+08:00","value":683.690592},{"datetime":"2020-08-04T13:00+08:00","value":673.515808},{"datetime":"2020-08-04T14:00+08:00","value":615.383744},{"datetime":"2020-08-04T15:00+08:00","value":212.07712},{"datetime":"2020-08-04T16:00+08:00","value":157.75744},{"datetime":"2020-08-04T17:00+08:00","value":124.26464},{"datetime":"2020-08-04T18:00+08:00","value":97.83648},{"datetime":"2020-08-04T19:00+08:00","value":77.735136},{"datetime":"2020-08-04T20:00+08:00","value":64.691072},{"datetime":"2020-08-04T21:00+08:00","value":0},{"datetime":"2020-08-04T22:00+08:00","value":0},{"datetime":"2020-08-04T23:00+08:00","value":0},{"datetime":"2020-08-05T00:00+08:00","value":0},{"datetime":"2020-08-05T01:00+08:00","value":0},{"datetime":"2020-08-05T02:00+08:00","value":0},{"datetime":"2020-08-05T03:00+08:00","value":0},{"datetime":"2020-08-05T04:00+08:00","value":0},{"datetime":"2020-08-05T05:00+08:00","value":0},{"datetime":"2020-08-05T06:00+08:00","value":0},{"datetime":"2020-08-05T07:00+08:00","value":24.619488},{"datetime":"2020-08-05T08:00+08:00","value":70.536256},{"datetime":"2020-08-05T09:00+08:00","value":529.06848},{"datetime":"2020-08-05T10:00+08:00","value":630.57472},{"datetime":"2020-08-05T11:00+08:00","value":701.98224},{"datetime":"2020-08-05T12:00+08:00","value":745.306176},{"datetime":"2020-08-05T13:00+08:00","value":761.400288},{"datetime":"2020-08-05T14:00+08:00","value":769.255008},{"datetime":"2020-08-05T15:00+08:00","value":726.58336},{"datetime":"2020-08-05T16:00+08:00","value":638.59584},{"datetime":"2020-08-05T17:00+08:00","value":542.9312},{"datetime":"2020-08-05T18:00+08:00","value":444.91968},{"datetime":"2020-08-05T19:00+08:00","value":357.134592},{"datetime":"2020-08-05T20:00+08:00","value":297.84336},{"datetime":"2020-08-05T21:00+08:00","value":0},{"datetime":"2020-08-05T22:00+08:00","value":0},{"datetime":"2020-08-05T23:00+08:00","value":0},{"datetime":"2020-08-06T00:00+08:00","value":0},{"datetime":"2020-08-06T01:00+08:00","value":0},{"datetime":"2020-08-06T02:00+08:00","value":0},{"datetime":"2020-08-06T03:00+08:00","value":0},{"datetime":"2020-08-06T04:00+08:00","value":0},{"datetime":"2020-08-06T05:00+08:00","value":0},{"datetime":"2020-08-06T06:00+08:00","value":0},{"datetime":"2020-08-06T07:00+08:00","value":34.766848},{"datetime":"2020-08-06T08:00+08:00","value":94.473312}]
             * status : ok
             * wind : [{"datetime":"2020-08-04T09:00+08:00","speed":6.84,"direction":220},{"datetime":"2020-08-04T10:00+08:00","speed":7.42,"direction":22.43},{"datetime":"2020-08-04T11:00+08:00","speed":9.23,"direction":30.6},{"datetime":"2020-08-04T12:00+08:00","speed":10.48,"direction":33.47},{"datetime":"2020-08-04T13:00+08:00","speed":4.38,"direction":40.45},{"datetime":"2020-08-04T14:00+08:00","speed":4.16,"direction":230.4},{"datetime":"2020-08-04T15:00+08:00","speed":6.07,"direction":228.75},{"datetime":"2020-08-04T16:00+08:00","speed":3.25,"direction":158.12},{"datetime":"2020-08-04T17:00+08:00","speed":2.94,"direction":183.44},{"datetime":"2020-08-04T18:00+08:00","speed":10.76,"direction":253.63},{"datetime":"2020-08-04T19:00+08:00","speed":8.26,"direction":241.14},{"datetime":"2020-08-04T20:00+08:00","speed":5,"direction":244.32},{"datetime":"2020-08-04T21:00+08:00","speed":9.12,"direction":259.44},{"datetime":"2020-08-04T22:00+08:00","speed":9.12,"direction":245.58},{"datetime":"2020-08-04T23:00+08:00","speed":4.01,"direction":234.4},{"datetime":"2020-08-05T00:00+08:00","speed":0.37,"direction":162.66},{"datetime":"2020-08-05T01:00+08:00","speed":4.54,"direction":86.92},{"datetime":"2020-08-05T02:00+08:00","speed":4.05,"direction":97.21},{"datetime":"2020-08-05T03:00+08:00","speed":1.58,"direction":118.23},{"datetime":"2020-08-05T04:00+08:00","speed":2.06,"direction":138.96},{"datetime":"2020-08-05T05:00+08:00","speed":2.19,"direction":140.66},{"datetime":"2020-08-05T06:00+08:00","speed":2.92,"direction":113.35},{"datetime":"2020-08-05T07:00+08:00","speed":4.82,"direction":87.03},{"datetime":"2020-08-05T08:00+08:00","speed":7.1,"direction":76.29},{"datetime":"2020-08-05T09:00+08:00","speed":8.33,"direction":81.9},{"datetime":"2020-08-05T10:00+08:00","speed":9.64,"direction":86.66},{"datetime":"2020-08-05T11:00+08:00","speed":12.11,"direction":97.6},{"datetime":"2020-08-05T12:00+08:00","speed":14.89,"direction":107.99},{"datetime":"2020-08-05T13:00+08:00","speed":17.35,"direction":116.54},{"datetime":"2020-08-05T14:00+08:00","speed":16.86,"direction":123.62},{"datetime":"2020-08-05T15:00+08:00","speed":17.47,"direction":125.23},{"datetime":"2020-08-05T16:00+08:00","speed":17.27,"direction":129.74},{"datetime":"2020-08-05T17:00+08:00","speed":14.6,"direction":137.89},{"datetime":"2020-08-05T18:00+08:00","speed":14.49,"direction":139.98},{"datetime":"2020-08-05T19:00+08:00","speed":15.63,"direction":150.25},{"datetime":"2020-08-05T20:00+08:00","speed":15.02,"direction":155.03},{"datetime":"2020-08-05T21:00+08:00","speed":15.92,"direction":150.87},{"datetime":"2020-08-05T22:00+08:00","speed":15.37,"direction":151.2},{"datetime":"2020-08-05T23:00+08:00","speed":14.78,"direction":153.27},{"datetime":"2020-08-06T00:00+08:00","speed":16.48,"direction":153.81},{"datetime":"2020-08-06T01:00+08:00","speed":11.3,"direction":165.9},{"datetime":"2020-08-06T02:00+08:00","speed":9.84,"direction":169.74},{"datetime":"2020-08-06T03:00+08:00","speed":8.75,"direction":187.54},{"datetime":"2020-08-06T04:00+08:00","speed":7.3,"direction":204.98},{"datetime":"2020-08-06T05:00+08:00","speed":4.99,"direction":206.04},{"datetime":"2020-08-06T06:00+08:00","speed":4.07,"direction":198.15},{"datetime":"2020-08-06T07:00+08:00","speed":4.49,"direction":212.93},{"datetime":"2020-08-06T08:00+08:00","speed":1.99,"direction":255.8}]
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
                 * datetime : 2020-08-04T09:00+08:00
                 * value : 0.0
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
                 * datetime : 2020-08-04T09:00+08:00
                 * value : 0.9
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
                 * datetime : 2020-08-04T09:00+08:00
                 * value : 16.0
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
                 * datetime : 2020-08-04T09:00+08:00
                 * value : 30.16
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
                 * datetime : 2020-08-04T09:00+08:00
                 * value : CLOUDY
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
                 * datetime : 2020-08-04T09:00+08:00
                 * value : 0.74
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
                 * pm25 : [{"datetime":"2020-08-04T09:00+08:00","value":4},{"datetime":"2020-08-04T10:00+08:00","value":3},{"datetime":"2020-08-04T11:00+08:00","value":3},{"datetime":"2020-08-04T12:00+08:00","value":4},{"datetime":"2020-08-04T13:00+08:00","value":4},{"datetime":"2020-08-04T14:00+08:00","value":4},{"datetime":"2020-08-04T15:00+08:00","value":3},{"datetime":"2020-08-04T16:00+08:00","value":3},{"datetime":"2020-08-04T17:00+08:00","value":3},{"datetime":"2020-08-04T18:00+08:00","value":4},{"datetime":"2020-08-04T19:00+08:00","value":4},{"datetime":"2020-08-04T20:00+08:00","value":4},{"datetime":"2020-08-04T21:00+08:00","value":5},{"datetime":"2020-08-04T22:00+08:00","value":5},{"datetime":"2020-08-04T23:00+08:00","value":5},{"datetime":"2020-08-05T00:00+08:00","value":5},{"datetime":"2020-08-05T01:00+08:00","value":4},{"datetime":"2020-08-05T02:00+08:00","value":4},{"datetime":"2020-08-05T03:00+08:00","value":4},{"datetime":"2020-08-05T04:00+08:00","value":3},{"datetime":"2020-08-05T05:00+08:00","value":3},{"datetime":"2020-08-05T06:00+08:00","value":3},{"datetime":"2020-08-05T07:00+08:00","value":4},{"datetime":"2020-08-05T08:00+08:00","value":4},{"datetime":"2020-08-05T09:00+08:00","value":3},{"datetime":"2020-08-05T10:00+08:00","value":3},{"datetime":"2020-08-05T11:00+08:00","value":3},{"datetime":"2020-08-05T12:00+08:00","value":3},{"datetime":"2020-08-05T13:00+08:00","value":3},{"datetime":"2020-08-05T14:00+08:00","value":3},{"datetime":"2020-08-05T15:00+08:00","value":4},{"datetime":"2020-08-05T16:00+08:00","value":4},{"datetime":"2020-08-05T17:00+08:00","value":4},{"datetime":"2020-08-05T18:00+08:00","value":3},{"datetime":"2020-08-05T19:00+08:00","value":3},{"datetime":"2020-08-05T20:00+08:00","value":3},{"datetime":"2020-08-05T21:00+08:00","value":3},{"datetime":"2020-08-05T22:00+08:00","value":4},{"datetime":"2020-08-05T23:00+08:00","value":5},{"datetime":"2020-08-06T00:00+08:00","value":6},{"datetime":"2020-08-06T01:00+08:00","value":5},{"datetime":"2020-08-06T02:00+08:00","value":5},{"datetime":"2020-08-06T03:00+08:00","value":5},{"datetime":"2020-08-06T04:00+08:00","value":4},{"datetime":"2020-08-06T05:00+08:00","value":4},{"datetime":"2020-08-06T06:00+08:00","value":5},{"datetime":"2020-08-06T07:00+08:00","value":5},{"datetime":"2020-08-06T08:00+08:00","value":5}]
                 * aqi : [{"datetime":"2020-08-04T09:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T12:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T13:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T15:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T18:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T21:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-04T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-04T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T00:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T03:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T06:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T08:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T09:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T10:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T11:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T12:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T13:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T14:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T15:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T16:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T17:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T18:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T19:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T20:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-05T21:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T22:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-05T23:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T00:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T01:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T02:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T03:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T04:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T05:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T06:00+08:00","value":{"usa":7,"chn":7}},{"datetime":"2020-08-06T07:00+08:00","value":{"usa":8,"chn":8}},{"datetime":"2020-08-06T08:00+08:00","value":{"usa":8,"chn":8}}]
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
                     * datetime : 2020-08-04T09:00+08:00
                     * value : 4
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
                     * datetime : 2020-08-04T09:00+08:00
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
                 * datetime : 2020-08-04T09:00+08:00
                 * value : 98953.87648
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
                 * datetime : 2020-08-04T09:00+08:00
                 * value : 513.77088
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
                 * datetime : 2020-08-04T09:00+08:00
                 * speed : 6.84
                 * direction : 220.0
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
             * precipitation : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             * precipitation_2h : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             * datasource : radar
             * probability : [0,0,0,0]
             * description : 您北边13公里正下着暴雨呢
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
