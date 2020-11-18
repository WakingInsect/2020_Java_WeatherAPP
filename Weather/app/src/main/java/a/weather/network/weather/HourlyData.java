package a.weather.network.weather;

import java.util.List;

public class HourlyData {

    /**
     * status : ok
     * api_version : v2.5
     * api_status : active
     * lang : zh_CN
     * unit : metric
     * tzshift : 28800
     * timezone : Asia/Taipei
     * server_time : 1605528587
     * location : [25.1552,121.6544]
     * result : {"hourly":{"status":"ok","description":"晴，明天午夜1点钟后转小雨，其后阴","precipitation":[{"datetime":"2020-11-16T20:00+08:00","value":0},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0},{"datetime":"2020-11-16T23:00+08:00","value":0},{"datetime":"2020-11-17T00:00+08:00","value":0},{"datetime":"2020-11-17T01:00+08:00","value":1.4649},{"datetime":"2020-11-17T02:00+08:00","value":0.7589},{"datetime":"2020-11-17T03:00+08:00","value":0.1485},{"datetime":"2020-11-17T04:00+08:00","value":0.173},{"datetime":"2020-11-17T05:00+08:00","value":0},{"datetime":"2020-11-17T06:00+08:00","value":0.123},{"datetime":"2020-11-17T07:00+08:00","value":0.0911},{"datetime":"2020-11-17T08:00+08:00","value":0},{"datetime":"2020-11-17T09:00+08:00","value":0.1413},{"datetime":"2020-11-17T10:00+08:00","value":0.1634},{"datetime":"2020-11-17T11:00+08:00","value":1.1238},{"datetime":"2020-11-17T12:00+08:00","value":1.7633},{"datetime":"2020-11-17T13:00+08:00","value":0.0616},{"datetime":"2020-11-17T14:00+08:00","value":0},{"datetime":"2020-11-17T15:00+08:00","value":0},{"datetime":"2020-11-17T16:00+08:00","value":0},{"datetime":"2020-11-17T17:00+08:00","value":0},{"datetime":"2020-11-17T18:00+08:00","value":0},{"datetime":"2020-11-17T19:00+08:00","value":0},{"datetime":"2020-11-17T20:00+08:00","value":0},{"datetime":"2020-11-17T21:00+08:00","value":0},{"datetime":"2020-11-17T22:00+08:00","value":0},{"datetime":"2020-11-17T23:00+08:00","value":0},{"datetime":"2020-11-18T00:00+08:00","value":0},{"datetime":"2020-11-18T01:00+08:00","value":0},{"datetime":"2020-11-18T02:00+08:00","value":0},{"datetime":"2020-11-18T03:00+08:00","value":0},{"datetime":"2020-11-18T04:00+08:00","value":0},{"datetime":"2020-11-18T05:00+08:00","value":0},{"datetime":"2020-11-18T06:00+08:00","value":0},{"datetime":"2020-11-18T07:00+08:00","value":0},{"datetime":"2020-11-18T08:00+08:00","value":0},{"datetime":"2020-11-18T09:00+08:00","value":0},{"datetime":"2020-11-18T10:00+08:00","value":0},{"datetime":"2020-11-18T11:00+08:00","value":0},{"datetime":"2020-11-18T12:00+08:00","value":0},{"datetime":"2020-11-18T13:00+08:00","value":0},{"datetime":"2020-11-18T14:00+08:00","value":0},{"datetime":"2020-11-18T15:00+08:00","value":0},{"datetime":"2020-11-18T16:00+08:00","value":0},{"datetime":"2020-11-18T17:00+08:00","value":0},{"datetime":"2020-11-18T18:00+08:00","value":0},{"datetime":"2020-11-18T19:00+08:00","value":0}],"temperature":[{"datetime":"2020-11-16T20:00+08:00","value":20.16},{"datetime":"2020-11-16T21:00+08:00","value":22},{"datetime":"2020-11-16T22:00+08:00","value":22},{"datetime":"2020-11-16T23:00+08:00","value":22},{"datetime":"2020-11-17T00:00+08:00","value":22},{"datetime":"2020-11-17T01:00+08:00","value":22},{"datetime":"2020-11-17T02:00+08:00","value":22},{"datetime":"2020-11-17T03:00+08:00","value":22.3},{"datetime":"2020-11-17T04:00+08:00","value":22.6},{"datetime":"2020-11-17T05:00+08:00","value":22.9},{"datetime":"2020-11-17T06:00+08:00","value":23.2},{"datetime":"2020-11-17T07:00+08:00","value":23.7},{"datetime":"2020-11-17T08:00+08:00","value":24},{"datetime":"2020-11-17T09:00+08:00","value":24.3},{"datetime":"2020-11-17T10:00+08:00","value":24.6},{"datetime":"2020-11-17T11:00+08:00","value":24.8},{"datetime":"2020-11-17T12:00+08:00","value":25},{"datetime":"2020-11-17T13:00+08:00","value":24.9},{"datetime":"2020-11-17T14:00+08:00","value":24.8},{"datetime":"2020-11-17T15:00+08:00","value":24.7},{"datetime":"2020-11-17T16:00+08:00","value":24.6},{"datetime":"2020-11-17T17:00+08:00","value":24},{"datetime":"2020-11-17T18:00+08:00","value":23.8},{"datetime":"2020-11-17T19:00+08:00","value":23.35},{"datetime":"2020-11-17T20:00+08:00","value":23.06},{"datetime":"2020-11-17T21:00+08:00","value":22.69},{"datetime":"2020-11-17T22:00+08:00","value":22.28},{"datetime":"2020-11-17T23:00+08:00","value":22.1},{"datetime":"2020-11-18T00:00+08:00","value":21.88},{"datetime":"2020-11-18T01:00+08:00","value":21.72},{"datetime":"2020-11-18T02:00+08:00","value":21.55},{"datetime":"2020-11-18T03:00+08:00","value":21.37},{"datetime":"2020-11-18T04:00+08:00","value":21.61},{"datetime":"2020-11-18T05:00+08:00","value":21.89},{"datetime":"2020-11-18T06:00+08:00","value":21},{"datetime":"2020-11-18T07:00+08:00","value":22.63},{"datetime":"2020-11-18T08:00+08:00","value":22.85},{"datetime":"2020-11-18T09:00+08:00","value":23.05},{"datetime":"2020-11-18T10:00+08:00","value":23.28},{"datetime":"2020-11-18T11:00+08:00","value":23.59},{"datetime":"2020-11-18T12:00+08:00","value":24.03},{"datetime":"2020-11-18T13:00+08:00","value":26},{"datetime":"2020-11-18T14:00+08:00","value":25.03},{"datetime":"2020-11-18T15:00+08:00","value":25.44},{"datetime":"2020-11-18T16:00+08:00","value":25.67},{"datetime":"2020-11-18T17:00+08:00","value":25.23},{"datetime":"2020-11-18T18:00+08:00","value":24.77},{"datetime":"2020-11-18T19:00+08:00","value":24.35}],"wind":[{"datetime":"2020-11-16T20:00+08:00","speed":24.12,"direction":45},{"datetime":"2020-11-16T21:00+08:00","speed":22.62,"direction":97.2},{"datetime":"2020-11-16T22:00+08:00","speed":23.79,"direction":99.52},{"datetime":"2020-11-16T23:00+08:00","speed":23.45,"direction":100.04},{"datetime":"2020-11-17T00:00+08:00","speed":24.39,"direction":100.36},{"datetime":"2020-11-17T01:00+08:00","speed":24.75,"direction":101.97},{"datetime":"2020-11-17T02:00+08:00","speed":23.45,"direction":103.33},{"datetime":"2020-11-17T03:00+08:00","speed":23.24,"direction":104.16},{"datetime":"2020-11-17T04:00+08:00","speed":24.02,"direction":107.42},{"datetime":"2020-11-17T05:00+08:00","speed":24.08,"direction":106.19},{"datetime":"2020-11-17T06:00+08:00","speed":24.82,"direction":105.25},{"datetime":"2020-11-17T07:00+08:00","speed":24.99,"direction":104.27},{"datetime":"2020-11-17T08:00+08:00","speed":26.43,"direction":106.09},{"datetime":"2020-11-17T09:00+08:00","speed":27.04,"direction":108.53},{"datetime":"2020-11-17T10:00+08:00","speed":26.96,"direction":109.16},{"datetime":"2020-11-17T11:00+08:00","speed":26.91,"direction":109.75},{"datetime":"2020-11-17T12:00+08:00","speed":26.83,"direction":108.09},{"datetime":"2020-11-17T13:00+08:00","speed":25.78,"direction":108.03},{"datetime":"2020-11-17T14:00+08:00","speed":25.52,"direction":110.38},{"datetime":"2020-11-17T15:00+08:00","speed":24.96,"direction":111.33},{"datetime":"2020-11-17T16:00+08:00","speed":24.49,"direction":114.34},{"datetime":"2020-11-17T17:00+08:00","speed":23.92,"direction":113.25},{"datetime":"2020-11-17T18:00+08:00","speed":23.47,"direction":115.22},{"datetime":"2020-11-17T19:00+08:00","speed":23.73,"direction":117.92},{"datetime":"2020-11-17T20:00+08:00","speed":23.68,"direction":118.75},{"datetime":"2020-11-17T21:00+08:00","speed":24.15,"direction":122.51},{"datetime":"2020-11-17T22:00+08:00","speed":24.1,"direction":122.69},{"datetime":"2020-11-17T23:00+08:00","speed":23.45,"direction":126.97},{"datetime":"2020-11-18T00:00+08:00","speed":21.07,"direction":129.33},{"datetime":"2020-11-18T01:00+08:00","speed":20.86,"direction":131.21},{"datetime":"2020-11-18T02:00+08:00","speed":21.95,"direction":132.73},{"datetime":"2020-11-18T03:00+08:00","speed":21.97,"direction":135.42},{"datetime":"2020-11-18T04:00+08:00","speed":20.08,"direction":140.32},{"datetime":"2020-11-18T05:00+08:00","speed":18.59,"direction":141.84},{"datetime":"2020-11-18T06:00+08:00","speed":16.47,"direction":147.36},{"datetime":"2020-11-18T07:00+08:00","speed":14.22,"direction":155.44},{"datetime":"2020-11-18T08:00+08:00","speed":11.72,"direction":154.86},{"datetime":"2020-11-18T09:00+08:00","speed":10.75,"direction":145.76},{"datetime":"2020-11-18T10:00+08:00","speed":10.31,"direction":138.69},{"datetime":"2020-11-18T11:00+08:00","speed":10.39,"direction":124.1},{"datetime":"2020-11-18T12:00+08:00","speed":11.7,"direction":120.43},{"datetime":"2020-11-18T13:00+08:00","speed":12.01,"direction":123.75},{"datetime":"2020-11-18T14:00+08:00","speed":12.69,"direction":123.2},{"datetime":"2020-11-18T15:00+08:00","speed":13.75,"direction":124.87},{"datetime":"2020-11-18T16:00+08:00","speed":13.36,"direction":128.35},{"datetime":"2020-11-18T17:00+08:00","speed":11.89,"direction":136.95},{"datetime":"2020-11-18T18:00+08:00","speed":11.09,"direction":150.14},{"datetime":"2020-11-18T19:00+08:00","speed":10.24,"direction":162.75}],"humidity":[{"datetime":"2020-11-16T20:00+08:00","value":0.88},{"datetime":"2020-11-16T21:00+08:00","value":0.87},{"datetime":"2020-11-16T22:00+08:00","value":0.87},{"datetime":"2020-11-16T23:00+08:00","value":0.87},{"datetime":"2020-11-17T00:00+08:00","value":0.88},{"datetime":"2020-11-17T01:00+08:00","value":0.87},{"datetime":"2020-11-17T02:00+08:00","value":0.88},{"datetime":"2020-11-17T03:00+08:00","value":0.88},{"datetime":"2020-11-17T04:00+08:00","value":0.88},{"datetime":"2020-11-17T05:00+08:00","value":0.87},{"datetime":"2020-11-17T06:00+08:00","value":0.88},{"datetime":"2020-11-17T07:00+08:00","value":0.86},{"datetime":"2020-11-17T08:00+08:00","value":0.85},{"datetime":"2020-11-17T09:00+08:00","value":0.83},{"datetime":"2020-11-17T10:00+08:00","value":0.81},{"datetime":"2020-11-17T11:00+08:00","value":0.8},{"datetime":"2020-11-17T12:00+08:00","value":0.8},{"datetime":"2020-11-17T13:00+08:00","value":0.8},{"datetime":"2020-11-17T14:00+08:00","value":0.81},{"datetime":"2020-11-17T15:00+08:00","value":0.82},{"datetime":"2020-11-17T16:00+08:00","value":0.83},{"datetime":"2020-11-17T17:00+08:00","value":0.85},{"datetime":"2020-11-17T18:00+08:00","value":0.86},{"datetime":"2020-11-17T19:00+08:00","value":0.87},{"datetime":"2020-11-17T20:00+08:00","value":0.87},{"datetime":"2020-11-17T21:00+08:00","value":0.87},{"datetime":"2020-11-17T22:00+08:00","value":0.87},{"datetime":"2020-11-17T23:00+08:00","value":0.87},{"datetime":"2020-11-18T00:00+08:00","value":0.87},{"datetime":"2020-11-18T01:00+08:00","value":0.87},{"datetime":"2020-11-18T02:00+08:00","value":0.87},{"datetime":"2020-11-18T03:00+08:00","value":0.88},{"datetime":"2020-11-18T04:00+08:00","value":0.88},{"datetime":"2020-11-18T05:00+08:00","value":0.88},{"datetime":"2020-11-18T06:00+08:00","value":0.88},{"datetime":"2020-11-18T07:00+08:00","value":0.87},{"datetime":"2020-11-18T08:00+08:00","value":0.83},{"datetime":"2020-11-18T09:00+08:00","value":0.78},{"datetime":"2020-11-18T10:00+08:00","value":0.74},{"datetime":"2020-11-18T11:00+08:00","value":0.71},{"datetime":"2020-11-18T12:00+08:00","value":0.7},{"datetime":"2020-11-18T13:00+08:00","value":0.7},{"datetime":"2020-11-18T14:00+08:00","value":0.72},{"datetime":"2020-11-18T15:00+08:00","value":0.74},{"datetime":"2020-11-18T16:00+08:00","value":0.78},{"datetime":"2020-11-18T17:00+08:00","value":0.82},{"datetime":"2020-11-18T18:00+08:00","value":0.84},{"datetime":"2020-11-18T19:00+08:00","value":0.84}],"cloudrate":[{"datetime":"2020-11-16T20:00+08:00","value":0},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0.72},{"datetime":"2020-11-16T23:00+08:00","value":0.64},{"datetime":"2020-11-17T00:00+08:00","value":0.62},{"datetime":"2020-11-17T01:00+08:00","value":0.62},{"datetime":"2020-11-17T02:00+08:00","value":0.67},{"datetime":"2020-11-17T03:00+08:00","value":0.99},{"datetime":"2020-11-17T04:00+08:00","value":0.96},{"datetime":"2020-11-17T05:00+08:00","value":0.98},{"datetime":"2020-11-17T06:00+08:00","value":0.98},{"datetime":"2020-11-17T07:00+08:00","value":0.99},{"datetime":"2020-11-17T08:00+08:00","value":0.99},{"datetime":"2020-11-17T09:00+08:00","value":1},{"datetime":"2020-11-17T10:00+08:00","value":0.82},{"datetime":"2020-11-17T11:00+08:00","value":0.75},{"datetime":"2020-11-17T12:00+08:00","value":0.7},{"datetime":"2020-11-17T13:00+08:00","value":0.67},{"datetime":"2020-11-17T14:00+08:00","value":0.66},{"datetime":"2020-11-17T15:00+08:00","value":0.9},{"datetime":"2020-11-17T16:00+08:00","value":0.94},{"datetime":"2020-11-17T17:00+08:00","value":0.96},{"datetime":"2020-11-17T18:00+08:00","value":0.97},{"datetime":"2020-11-17T19:00+08:00","value":0.94},{"datetime":"2020-11-17T20:00+08:00","value":0.94},{"datetime":"2020-11-17T21:00+08:00","value":0.9},{"datetime":"2020-11-17T22:00+08:00","value":0.88},{"datetime":"2020-11-17T23:00+08:00","value":0.83},{"datetime":"2020-11-18T00:00+08:00","value":0.72},{"datetime":"2020-11-18T01:00+08:00","value":0.64},{"datetime":"2020-11-18T02:00+08:00","value":0.56},{"datetime":"2020-11-18T03:00+08:00","value":0.08},{"datetime":"2020-11-18T04:00+08:00","value":0.07},{"datetime":"2020-11-18T05:00+08:00","value":0.05},{"datetime":"2020-11-18T06:00+08:00","value":0.05},{"datetime":"2020-11-18T07:00+08:00","value":0.04},{"datetime":"2020-11-18T08:00+08:00","value":0.04},{"datetime":"2020-11-18T09:00+08:00","value":0},{"datetime":"2020-11-18T10:00+08:00","value":0},{"datetime":"2020-11-18T11:00+08:00","value":0},{"datetime":"2020-11-18T12:00+08:00","value":0.01},{"datetime":"2020-11-18T13:00+08:00","value":0.02},{"datetime":"2020-11-18T14:00+08:00","value":0.04},{"datetime":"2020-11-18T15:00+08:00","value":0.2},{"datetime":"2020-11-18T16:00+08:00","value":0.19},{"datetime":"2020-11-18T17:00+08:00","value":0.16},{"datetime":"2020-11-18T18:00+08:00","value":0.16},{"datetime":"2020-11-18T19:00+08:00","value":0.16}],"skycon":[{"datetime":"2020-11-16T20:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-16T21:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-16T22:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-16T23:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-17T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-17T01:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T02:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T03:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T04:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T06:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T07:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T09:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T10:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T11:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T12:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T13:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T14:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-11-17T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T16:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T17:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T18:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T19:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-18T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T01:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T02:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T03:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T04:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T05:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T06:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T07:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T08:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T09:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T10:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T11:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T12:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T13:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T14:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T15:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T16:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T17:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T18:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T19:00+08:00","value":"CLEAR_NIGHT"}],"pressure":[{"datetime":"2020-11-16T20:00+08:00","value":100156.2269696001},{"datetime":"2020-11-16T21:00+08:00","value":100186.8994560001},{"datetime":"2020-11-16T22:00+08:00","value":100224.6264832001},{"datetime":"2020-11-16T23:00+08:00","value":100186.8994560001},{"datetime":"2020-11-17T00:00+08:00","value":100106.899456},{"datetime":"2020-11-17T01:00+08:00","value":99996.2269696001},{"datetime":"2020-11-17T02:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T03:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T04:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T05:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T06:00+08:00","value":99984.6264832001},{"datetime":"2020-11-17T07:00+08:00","value":100026.8994560001},{"datetime":"2020-11-17T08:00+08:00","value":100064.6264832001},{"datetime":"2020-11-17T09:00+08:00","value":100076.2269696001},{"datetime":"2020-11-17T10:00+08:00","value":100106.8994560001},{"datetime":"2020-11-17T11:00+08:00","value":100064.6264832001},{"datetime":"2020-11-17T12:00+08:00","value":99984.6264832001},{"datetime":"2020-11-17T13:00+08:00","value":99904.6264832001},{"datetime":"2020-11-17T14:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T15:00+08:00","value":99786.8994560001},{"datetime":"2020-11-17T16:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T17:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T18:00+08:00","value":99866.8994560001},{"datetime":"2020-11-17T19:00+08:00","value":99897.2354560001},{"datetime":"2020-11-17T20:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T21:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T22:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T23:00+08:00","value":99866.8994560001},{"datetime":"2020-11-18T00:00+08:00","value":99836.2269696},{"datetime":"2020-11-18T01:00+08:00","value":99798.4999424001},{"datetime":"2020-11-18T02:00+08:00","value":99737.2354560001},{"datetime":"2020-11-18T03:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T04:00+08:00","value":99657.2354560001},{"datetime":"2020-11-18T05:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T06:00+08:00","value":99725.5544832001},{"datetime":"2020-11-18T07:00+08:00","value":99767.8274560001},{"datetime":"2020-11-18T08:00+08:00","value":99847.8274560001},{"datetime":"2020-11-18T09:00+08:00","value":99847.8274560001},{"datetime":"2020-11-18T10:00+08:00","value":99836.2269696001},{"datetime":"2020-11-18T11:00+08:00","value":99756.2269696001},{"datetime":"2020-11-18T12:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T13:00+08:00","value":99596.2269696001},{"datetime":"2020-11-18T14:00+08:00","value":99534.9624832001},{"datetime":"2020-11-18T15:00+08:00","value":99485.5544832},{"datetime":"2020-11-18T16:00+08:00","value":99485.5544832001},{"datetime":"2020-11-18T17:00+08:00","value":99546.5629696001},{"datetime":"2020-11-18T18:00+08:00","value":99565.5544832001},{"datetime":"2020-11-18T19:00+08:00","value":99645.5544832001}],"visibility":[{"datetime":"2020-11-16T20:00+08:00","value":8.9},{"datetime":"2020-11-16T21:00+08:00","value":9.04},{"datetime":"2020-11-16T22:00+08:00","value":9.17},{"datetime":"2020-11-16T23:00+08:00","value":9.19},{"datetime":"2020-11-17T00:00+08:00","value":8.89},{"datetime":"2020-11-17T01:00+08:00","value":4.98},{"datetime":"2020-11-17T02:00+08:00","value":4.89},{"datetime":"2020-11-17T03:00+08:00","value":4.48},{"datetime":"2020-11-17T04:00+08:00","value":4.9},{"datetime":"2020-11-17T05:00+08:00","value":5.14},{"datetime":"2020-11-17T06:00+08:00","value":4.01},{"datetime":"2020-11-17T07:00+08:00","value":5.21},{"datetime":"2020-11-17T08:00+08:00","value":4.68},{"datetime":"2020-11-17T09:00+08:00","value":4.22},{"datetime":"2020-11-17T10:00+08:00","value":5.12},{"datetime":"2020-11-17T11:00+08:00","value":4.39},{"datetime":"2020-11-17T12:00+08:00","value":4.2},{"datetime":"2020-11-17T13:00+08:00","value":4.09},{"datetime":"2020-11-17T14:00+08:00","value":8.93},{"datetime":"2020-11-17T15:00+08:00","value":8.97},{"datetime":"2020-11-17T16:00+08:00","value":9.32},{"datetime":"2020-11-17T17:00+08:00","value":5.38},{"datetime":"2020-11-17T18:00+08:00","value":4.79},{"datetime":"2020-11-17T19:00+08:00","value":5},{"datetime":"2020-11-17T20:00+08:00","value":5.24},{"datetime":"2020-11-17T21:00+08:00","value":4.67},{"datetime":"2020-11-17T22:00+08:00","value":5.06},{"datetime":"2020-11-17T23:00+08:00","value":9.43},{"datetime":"2020-11-18T00:00+08:00","value":9.58},{"datetime":"2020-11-18T01:00+08:00","value":9.72},{"datetime":"2020-11-18T02:00+08:00","value":10.01},{"datetime":"2020-11-18T03:00+08:00","value":9.66},{"datetime":"2020-11-18T04:00+08:00","value":9.65},{"datetime":"2020-11-18T05:00+08:00","value":10},{"datetime":"2020-11-18T06:00+08:00","value":10},{"datetime":"2020-11-18T07:00+08:00","value":10},{"datetime":"2020-11-18T08:00+08:00","value":8.92},{"datetime":"2020-11-18T09:00+08:00","value":9.64},{"datetime":"2020-11-18T10:00+08:00","value":11.37},{"datetime":"2020-11-18T11:00+08:00","value":12.41},{"datetime":"2020-11-18T12:00+08:00","value":12.82},{"datetime":"2020-11-18T13:00+08:00","value":12.57},{"datetime":"2020-11-18T14:00+08:00","value":11.75},{"datetime":"2020-11-18T15:00+08:00","value":11.55},{"datetime":"2020-11-18T16:00+08:00","value":10.79},{"datetime":"2020-11-18T17:00+08:00","value":9.62},{"datetime":"2020-11-18T18:00+08:00","value":10},{"datetime":"2020-11-18T19:00+08:00","value":9.99}],"dswrf":[{"datetime":"2020-11-16T20:00+08:00","value":88.7744256},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0},{"datetime":"2020-11-16T23:00+08:00","value":0},{"datetime":"2020-11-17T00:00+08:00","value":0},{"datetime":"2020-11-17T01:00+08:00","value":0},{"datetime":"2020-11-17T02:00+08:00","value":0},{"datetime":"2020-11-17T03:00+08:00","value":0},{"datetime":"2020-11-17T04:00+08:00","value":0},{"datetime":"2020-11-17T05:00+08:00","value":0},{"datetime":"2020-11-17T06:00+08:00","value":0},{"datetime":"2020-11-17T07:00+08:00","value":1.4500608},{"datetime":"2020-11-17T08:00+08:00","value":17.90523648},{"datetime":"2020-11-17T09:00+08:00","value":227.3929728},{"datetime":"2020-11-17T10:00+08:00","value":345.9328512},{"datetime":"2020-11-17T11:00+08:00","value":427.3609728},{"datetime":"2020-11-17T12:00+08:00","value":473.2453376},{"datetime":"2020-11-17T13:00+08:00","value":481.4295808},{"datetime":"2020-11-17T14:00+08:00","value":474.3717632},{"datetime":"2020-11-17T15:00+08:00","value":335.0313984},{"datetime":"2020-11-17T16:00+08:00","value":273.9150336},{"datetime":"2020-11-17T17:00+08:00","value":195.6567296},{"datetime":"2020-11-17T18:00+08:00","value":148.8905472},{"datetime":"2020-11-17T19:00+08:00","value":117.3984256},{"datetime":"2020-11-17T20:00+08:00","value":99.7403648},{"datetime":"2020-11-17T21:00+08:00","value":0},{"datetime":"2020-11-17T22:00+08:00","value":0},{"datetime":"2020-11-17T23:00+08:00","value":0},{"datetime":"2020-11-18T00:00+08:00","value":0},{"datetime":"2020-11-18T01:00+08:00","value":0},{"datetime":"2020-11-18T02:00+08:00","value":0},{"datetime":"2020-11-18T03:00+08:00","value":0},{"datetime":"2020-11-18T04:00+08:00","value":0},{"datetime":"2020-11-18T05:00+08:00","value":0},{"datetime":"2020-11-18T06:00+08:00","value":0},{"datetime":"2020-11-18T07:00+08:00","value":10},{"datetime":"2020-11-18T08:00+08:00","value":39.85179392},{"datetime":"2020-11-18T09:00+08:00","value":402.3419392},{"datetime":"2020-11-18T10:00+08:00","value":486.176},{"datetime":"2020-11-18T11:00+08:00","value":549.968},{"datetime":"2020-11-18T12:00+08:00","value":589.968},{"datetime":"2020-11-18T13:00+08:00","value":610},{"datetime":"2020-11-18T14:00+08:00","value":607.6260608},{"datetime":"2020-11-18T15:00+08:00","value":426.580608},{"datetime":"2020-11-18T16:00+08:00","value":343.6064256},{"datetime":"2020-11-18T17:00+08:00","value":248.290304},{"datetime":"2020-11-18T18:00+08:00","value":188.258304},{"datetime":"2020-11-18T19:00+08:00","value":152.9741824}],"air_quality":{"aqi":[{"datetime":"2020-11-16T20:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-16T21:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-16T22:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-16T23:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T00:00+08:00","value":{"chn":14,"usa":14}},{"datetime":"2020-11-17T01:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T02:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T03:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T04:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T05:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T06:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T07:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T08:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T09:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T10:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-17T12:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T14:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T15:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T16:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-11-17T17:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-11-17T18:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T19:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T20:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-17T21:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T22:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T23:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T00:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-18T01:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T02:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T03:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T04:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T05:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T06:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T07:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T08:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T09:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T10:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T12:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-18T14:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-18T15:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T16:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T17:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T18:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-18T19:00+08:00","value":{"chn":13,"usa":13}}],"pm25":[{"datetime":"2020-11-16T20:00+08:00","value":9},{"datetime":"2020-11-16T21:00+08:00","value":10},{"datetime":"2020-11-16T22:00+08:00","value":10},{"datetime":"2020-11-16T23:00+08:00","value":10},{"datetime":"2020-11-17T00:00+08:00","value":10},{"datetime":"2020-11-17T01:00+08:00","value":10},{"datetime":"2020-11-17T02:00+08:00","value":10},{"datetime":"2020-11-17T03:00+08:00","value":10},{"datetime":"2020-11-17T04:00+08:00","value":9},{"datetime":"2020-11-17T05:00+08:00","value":9},{"datetime":"2020-11-17T06:00+08:00","value":9},{"datetime":"2020-11-17T07:00+08:00","value":8},{"datetime":"2020-11-17T08:00+08:00","value":9},{"datetime":"2020-11-17T09:00+08:00","value":9},{"datetime":"2020-11-17T10:00+08:00","value":8},{"datetime":"2020-11-17T11:00+08:00","value":8},{"datetime":"2020-11-17T12:00+08:00","value":7},{"datetime":"2020-11-17T13:00+08:00","value":7},{"datetime":"2020-11-17T14:00+08:00","value":7},{"datetime":"2020-11-17T15:00+08:00","value":7},{"datetime":"2020-11-17T16:00+08:00","value":6},{"datetime":"2020-11-17T17:00+08:00","value":6},{"datetime":"2020-11-17T18:00+08:00","value":7},{"datetime":"2020-11-17T19:00+08:00","value":7},{"datetime":"2020-11-17T20:00+08:00","value":7},{"datetime":"2020-11-17T21:00+08:00","value":8},{"datetime":"2020-11-17T22:00+08:00","value":8},{"datetime":"2020-11-17T23:00+08:00","value":8},{"datetime":"2020-11-18T00:00+08:00","value":8},{"datetime":"2020-11-18T01:00+08:00","value":8},{"datetime":"2020-11-18T02:00+08:00","value":8},{"datetime":"2020-11-18T03:00+08:00","value":8},{"datetime":"2020-11-18T04:00+08:00","value":7},{"datetime":"2020-11-18T05:00+08:00","value":7},{"datetime":"2020-11-18T06:00+08:00","value":7},{"datetime":"2020-11-18T07:00+08:00","value":8},{"datetime":"2020-11-18T08:00+08:00","value":8},{"datetime":"2020-11-18T09:00+08:00","value":7},{"datetime":"2020-11-18T10:00+08:00","value":7},{"datetime":"2020-11-18T11:00+08:00","value":8},{"datetime":"2020-11-18T12:00+08:00","value":7},{"datetime":"2020-11-18T13:00+08:00","value":7},{"datetime":"2020-11-18T14:00+08:00","value":7},{"datetime":"2020-11-18T15:00+08:00","value":8},{"datetime":"2020-11-18T16:00+08:00","value":8},{"datetime":"2020-11-18T17:00+08:00","value":8},{"datetime":"2020-11-18T18:00+08:00","value":8},{"datetime":"2020-11-18T19:00+08:00","value":9}]}},"primary":0,"forecast_keypoint":"晴，明天午夜1点钟后转小雨，其后阴"}
     */

    private String status;
    private String api_version;
    private String api_status;
    private String lang;
    private String unit;
    private int tzshift;
    private String timezone;
    private int server_time;
    private ResultDTO result;
    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public String getApi_status() {
        return api_status;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getTzshift() {
        return tzshift;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getServer_time() {
        return server_time;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public static class ResultDTO {
        /**
         * hourly : {"status":"ok","description":"晴，明天午夜1点钟后转小雨，其后阴","precipitation":[{"datetime":"2020-11-16T20:00+08:00","value":0},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0},{"datetime":"2020-11-16T23:00+08:00","value":0},{"datetime":"2020-11-17T00:00+08:00","value":0},{"datetime":"2020-11-17T01:00+08:00","value":1.4649},{"datetime":"2020-11-17T02:00+08:00","value":0.7589},{"datetime":"2020-11-17T03:00+08:00","value":0.1485},{"datetime":"2020-11-17T04:00+08:00","value":0.173},{"datetime":"2020-11-17T05:00+08:00","value":0},{"datetime":"2020-11-17T06:00+08:00","value":0.123},{"datetime":"2020-11-17T07:00+08:00","value":0.0911},{"datetime":"2020-11-17T08:00+08:00","value":0},{"datetime":"2020-11-17T09:00+08:00","value":0.1413},{"datetime":"2020-11-17T10:00+08:00","value":0.1634},{"datetime":"2020-11-17T11:00+08:00","value":1.1238},{"datetime":"2020-11-17T12:00+08:00","value":1.7633},{"datetime":"2020-11-17T13:00+08:00","value":0.0616},{"datetime":"2020-11-17T14:00+08:00","value":0},{"datetime":"2020-11-17T15:00+08:00","value":0},{"datetime":"2020-11-17T16:00+08:00","value":0},{"datetime":"2020-11-17T17:00+08:00","value":0},{"datetime":"2020-11-17T18:00+08:00","value":0},{"datetime":"2020-11-17T19:00+08:00","value":0},{"datetime":"2020-11-17T20:00+08:00","value":0},{"datetime":"2020-11-17T21:00+08:00","value":0},{"datetime":"2020-11-17T22:00+08:00","value":0},{"datetime":"2020-11-17T23:00+08:00","value":0},{"datetime":"2020-11-18T00:00+08:00","value":0},{"datetime":"2020-11-18T01:00+08:00","value":0},{"datetime":"2020-11-18T02:00+08:00","value":0},{"datetime":"2020-11-18T03:00+08:00","value":0},{"datetime":"2020-11-18T04:00+08:00","value":0},{"datetime":"2020-11-18T05:00+08:00","value":0},{"datetime":"2020-11-18T06:00+08:00","value":0},{"datetime":"2020-11-18T07:00+08:00","value":0},{"datetime":"2020-11-18T08:00+08:00","value":0},{"datetime":"2020-11-18T09:00+08:00","value":0},{"datetime":"2020-11-18T10:00+08:00","value":0},{"datetime":"2020-11-18T11:00+08:00","value":0},{"datetime":"2020-11-18T12:00+08:00","value":0},{"datetime":"2020-11-18T13:00+08:00","value":0},{"datetime":"2020-11-18T14:00+08:00","value":0},{"datetime":"2020-11-18T15:00+08:00","value":0},{"datetime":"2020-11-18T16:00+08:00","value":0},{"datetime":"2020-11-18T17:00+08:00","value":0},{"datetime":"2020-11-18T18:00+08:00","value":0},{"datetime":"2020-11-18T19:00+08:00","value":0}],"temperature":[{"datetime":"2020-11-16T20:00+08:00","value":20.16},{"datetime":"2020-11-16T21:00+08:00","value":22},{"datetime":"2020-11-16T22:00+08:00","value":22},{"datetime":"2020-11-16T23:00+08:00","value":22},{"datetime":"2020-11-17T00:00+08:00","value":22},{"datetime":"2020-11-17T01:00+08:00","value":22},{"datetime":"2020-11-17T02:00+08:00","value":22},{"datetime":"2020-11-17T03:00+08:00","value":22.3},{"datetime":"2020-11-17T04:00+08:00","value":22.6},{"datetime":"2020-11-17T05:00+08:00","value":22.9},{"datetime":"2020-11-17T06:00+08:00","value":23.2},{"datetime":"2020-11-17T07:00+08:00","value":23.7},{"datetime":"2020-11-17T08:00+08:00","value":24},{"datetime":"2020-11-17T09:00+08:00","value":24.3},{"datetime":"2020-11-17T10:00+08:00","value":24.6},{"datetime":"2020-11-17T11:00+08:00","value":24.8},{"datetime":"2020-11-17T12:00+08:00","value":25},{"datetime":"2020-11-17T13:00+08:00","value":24.9},{"datetime":"2020-11-17T14:00+08:00","value":24.8},{"datetime":"2020-11-17T15:00+08:00","value":24.7},{"datetime":"2020-11-17T16:00+08:00","value":24.6},{"datetime":"2020-11-17T17:00+08:00","value":24},{"datetime":"2020-11-17T18:00+08:00","value":23.8},{"datetime":"2020-11-17T19:00+08:00","value":23.35},{"datetime":"2020-11-17T20:00+08:00","value":23.06},{"datetime":"2020-11-17T21:00+08:00","value":22.69},{"datetime":"2020-11-17T22:00+08:00","value":22.28},{"datetime":"2020-11-17T23:00+08:00","value":22.1},{"datetime":"2020-11-18T00:00+08:00","value":21.88},{"datetime":"2020-11-18T01:00+08:00","value":21.72},{"datetime":"2020-11-18T02:00+08:00","value":21.55},{"datetime":"2020-11-18T03:00+08:00","value":21.37},{"datetime":"2020-11-18T04:00+08:00","value":21.61},{"datetime":"2020-11-18T05:00+08:00","value":21.89},{"datetime":"2020-11-18T06:00+08:00","value":21},{"datetime":"2020-11-18T07:00+08:00","value":22.63},{"datetime":"2020-11-18T08:00+08:00","value":22.85},{"datetime":"2020-11-18T09:00+08:00","value":23.05},{"datetime":"2020-11-18T10:00+08:00","value":23.28},{"datetime":"2020-11-18T11:00+08:00","value":23.59},{"datetime":"2020-11-18T12:00+08:00","value":24.03},{"datetime":"2020-11-18T13:00+08:00","value":26},{"datetime":"2020-11-18T14:00+08:00","value":25.03},{"datetime":"2020-11-18T15:00+08:00","value":25.44},{"datetime":"2020-11-18T16:00+08:00","value":25.67},{"datetime":"2020-11-18T17:00+08:00","value":25.23},{"datetime":"2020-11-18T18:00+08:00","value":24.77},{"datetime":"2020-11-18T19:00+08:00","value":24.35}],"wind":[{"datetime":"2020-11-16T20:00+08:00","speed":24.12,"direction":45},{"datetime":"2020-11-16T21:00+08:00","speed":22.62,"direction":97.2},{"datetime":"2020-11-16T22:00+08:00","speed":23.79,"direction":99.52},{"datetime":"2020-11-16T23:00+08:00","speed":23.45,"direction":100.04},{"datetime":"2020-11-17T00:00+08:00","speed":24.39,"direction":100.36},{"datetime":"2020-11-17T01:00+08:00","speed":24.75,"direction":101.97},{"datetime":"2020-11-17T02:00+08:00","speed":23.45,"direction":103.33},{"datetime":"2020-11-17T03:00+08:00","speed":23.24,"direction":104.16},{"datetime":"2020-11-17T04:00+08:00","speed":24.02,"direction":107.42},{"datetime":"2020-11-17T05:00+08:00","speed":24.08,"direction":106.19},{"datetime":"2020-11-17T06:00+08:00","speed":24.82,"direction":105.25},{"datetime":"2020-11-17T07:00+08:00","speed":24.99,"direction":104.27},{"datetime":"2020-11-17T08:00+08:00","speed":26.43,"direction":106.09},{"datetime":"2020-11-17T09:00+08:00","speed":27.04,"direction":108.53},{"datetime":"2020-11-17T10:00+08:00","speed":26.96,"direction":109.16},{"datetime":"2020-11-17T11:00+08:00","speed":26.91,"direction":109.75},{"datetime":"2020-11-17T12:00+08:00","speed":26.83,"direction":108.09},{"datetime":"2020-11-17T13:00+08:00","speed":25.78,"direction":108.03},{"datetime":"2020-11-17T14:00+08:00","speed":25.52,"direction":110.38},{"datetime":"2020-11-17T15:00+08:00","speed":24.96,"direction":111.33},{"datetime":"2020-11-17T16:00+08:00","speed":24.49,"direction":114.34},{"datetime":"2020-11-17T17:00+08:00","speed":23.92,"direction":113.25},{"datetime":"2020-11-17T18:00+08:00","speed":23.47,"direction":115.22},{"datetime":"2020-11-17T19:00+08:00","speed":23.73,"direction":117.92},{"datetime":"2020-11-17T20:00+08:00","speed":23.68,"direction":118.75},{"datetime":"2020-11-17T21:00+08:00","speed":24.15,"direction":122.51},{"datetime":"2020-11-17T22:00+08:00","speed":24.1,"direction":122.69},{"datetime":"2020-11-17T23:00+08:00","speed":23.45,"direction":126.97},{"datetime":"2020-11-18T00:00+08:00","speed":21.07,"direction":129.33},{"datetime":"2020-11-18T01:00+08:00","speed":20.86,"direction":131.21},{"datetime":"2020-11-18T02:00+08:00","speed":21.95,"direction":132.73},{"datetime":"2020-11-18T03:00+08:00","speed":21.97,"direction":135.42},{"datetime":"2020-11-18T04:00+08:00","speed":20.08,"direction":140.32},{"datetime":"2020-11-18T05:00+08:00","speed":18.59,"direction":141.84},{"datetime":"2020-11-18T06:00+08:00","speed":16.47,"direction":147.36},{"datetime":"2020-11-18T07:00+08:00","speed":14.22,"direction":155.44},{"datetime":"2020-11-18T08:00+08:00","speed":11.72,"direction":154.86},{"datetime":"2020-11-18T09:00+08:00","speed":10.75,"direction":145.76},{"datetime":"2020-11-18T10:00+08:00","speed":10.31,"direction":138.69},{"datetime":"2020-11-18T11:00+08:00","speed":10.39,"direction":124.1},{"datetime":"2020-11-18T12:00+08:00","speed":11.7,"direction":120.43},{"datetime":"2020-11-18T13:00+08:00","speed":12.01,"direction":123.75},{"datetime":"2020-11-18T14:00+08:00","speed":12.69,"direction":123.2},{"datetime":"2020-11-18T15:00+08:00","speed":13.75,"direction":124.87},{"datetime":"2020-11-18T16:00+08:00","speed":13.36,"direction":128.35},{"datetime":"2020-11-18T17:00+08:00","speed":11.89,"direction":136.95},{"datetime":"2020-11-18T18:00+08:00","speed":11.09,"direction":150.14},{"datetime":"2020-11-18T19:00+08:00","speed":10.24,"direction":162.75}],"humidity":[{"datetime":"2020-11-16T20:00+08:00","value":0.88},{"datetime":"2020-11-16T21:00+08:00","value":0.87},{"datetime":"2020-11-16T22:00+08:00","value":0.87},{"datetime":"2020-11-16T23:00+08:00","value":0.87},{"datetime":"2020-11-17T00:00+08:00","value":0.88},{"datetime":"2020-11-17T01:00+08:00","value":0.87},{"datetime":"2020-11-17T02:00+08:00","value":0.88},{"datetime":"2020-11-17T03:00+08:00","value":0.88},{"datetime":"2020-11-17T04:00+08:00","value":0.88},{"datetime":"2020-11-17T05:00+08:00","value":0.87},{"datetime":"2020-11-17T06:00+08:00","value":0.88},{"datetime":"2020-11-17T07:00+08:00","value":0.86},{"datetime":"2020-11-17T08:00+08:00","value":0.85},{"datetime":"2020-11-17T09:00+08:00","value":0.83},{"datetime":"2020-11-17T10:00+08:00","value":0.81},{"datetime":"2020-11-17T11:00+08:00","value":0.8},{"datetime":"2020-11-17T12:00+08:00","value":0.8},{"datetime":"2020-11-17T13:00+08:00","value":0.8},{"datetime":"2020-11-17T14:00+08:00","value":0.81},{"datetime":"2020-11-17T15:00+08:00","value":0.82},{"datetime":"2020-11-17T16:00+08:00","value":0.83},{"datetime":"2020-11-17T17:00+08:00","value":0.85},{"datetime":"2020-11-17T18:00+08:00","value":0.86},{"datetime":"2020-11-17T19:00+08:00","value":0.87},{"datetime":"2020-11-17T20:00+08:00","value":0.87},{"datetime":"2020-11-17T21:00+08:00","value":0.87},{"datetime":"2020-11-17T22:00+08:00","value":0.87},{"datetime":"2020-11-17T23:00+08:00","value":0.87},{"datetime":"2020-11-18T00:00+08:00","value":0.87},{"datetime":"2020-11-18T01:00+08:00","value":0.87},{"datetime":"2020-11-18T02:00+08:00","value":0.87},{"datetime":"2020-11-18T03:00+08:00","value":0.88},{"datetime":"2020-11-18T04:00+08:00","value":0.88},{"datetime":"2020-11-18T05:00+08:00","value":0.88},{"datetime":"2020-11-18T06:00+08:00","value":0.88},{"datetime":"2020-11-18T07:00+08:00","value":0.87},{"datetime":"2020-11-18T08:00+08:00","value":0.83},{"datetime":"2020-11-18T09:00+08:00","value":0.78},{"datetime":"2020-11-18T10:00+08:00","value":0.74},{"datetime":"2020-11-18T11:00+08:00","value":0.71},{"datetime":"2020-11-18T12:00+08:00","value":0.7},{"datetime":"2020-11-18T13:00+08:00","value":0.7},{"datetime":"2020-11-18T14:00+08:00","value":0.72},{"datetime":"2020-11-18T15:00+08:00","value":0.74},{"datetime":"2020-11-18T16:00+08:00","value":0.78},{"datetime":"2020-11-18T17:00+08:00","value":0.82},{"datetime":"2020-11-18T18:00+08:00","value":0.84},{"datetime":"2020-11-18T19:00+08:00","value":0.84}],"cloudrate":[{"datetime":"2020-11-16T20:00+08:00","value":0},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0.72},{"datetime":"2020-11-16T23:00+08:00","value":0.64},{"datetime":"2020-11-17T00:00+08:00","value":0.62},{"datetime":"2020-11-17T01:00+08:00","value":0.62},{"datetime":"2020-11-17T02:00+08:00","value":0.67},{"datetime":"2020-11-17T03:00+08:00","value":0.99},{"datetime":"2020-11-17T04:00+08:00","value":0.96},{"datetime":"2020-11-17T05:00+08:00","value":0.98},{"datetime":"2020-11-17T06:00+08:00","value":0.98},{"datetime":"2020-11-17T07:00+08:00","value":0.99},{"datetime":"2020-11-17T08:00+08:00","value":0.99},{"datetime":"2020-11-17T09:00+08:00","value":1},{"datetime":"2020-11-17T10:00+08:00","value":0.82},{"datetime":"2020-11-17T11:00+08:00","value":0.75},{"datetime":"2020-11-17T12:00+08:00","value":0.7},{"datetime":"2020-11-17T13:00+08:00","value":0.67},{"datetime":"2020-11-17T14:00+08:00","value":0.66},{"datetime":"2020-11-17T15:00+08:00","value":0.9},{"datetime":"2020-11-17T16:00+08:00","value":0.94},{"datetime":"2020-11-17T17:00+08:00","value":0.96},{"datetime":"2020-11-17T18:00+08:00","value":0.97},{"datetime":"2020-11-17T19:00+08:00","value":0.94},{"datetime":"2020-11-17T20:00+08:00","value":0.94},{"datetime":"2020-11-17T21:00+08:00","value":0.9},{"datetime":"2020-11-17T22:00+08:00","value":0.88},{"datetime":"2020-11-17T23:00+08:00","value":0.83},{"datetime":"2020-11-18T00:00+08:00","value":0.72},{"datetime":"2020-11-18T01:00+08:00","value":0.64},{"datetime":"2020-11-18T02:00+08:00","value":0.56},{"datetime":"2020-11-18T03:00+08:00","value":0.08},{"datetime":"2020-11-18T04:00+08:00","value":0.07},{"datetime":"2020-11-18T05:00+08:00","value":0.05},{"datetime":"2020-11-18T06:00+08:00","value":0.05},{"datetime":"2020-11-18T07:00+08:00","value":0.04},{"datetime":"2020-11-18T08:00+08:00","value":0.04},{"datetime":"2020-11-18T09:00+08:00","value":0},{"datetime":"2020-11-18T10:00+08:00","value":0},{"datetime":"2020-11-18T11:00+08:00","value":0},{"datetime":"2020-11-18T12:00+08:00","value":0.01},{"datetime":"2020-11-18T13:00+08:00","value":0.02},{"datetime":"2020-11-18T14:00+08:00","value":0.04},{"datetime":"2020-11-18T15:00+08:00","value":0.2},{"datetime":"2020-11-18T16:00+08:00","value":0.19},{"datetime":"2020-11-18T17:00+08:00","value":0.16},{"datetime":"2020-11-18T18:00+08:00","value":0.16},{"datetime":"2020-11-18T19:00+08:00","value":0.16}],"skycon":[{"datetime":"2020-11-16T20:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-16T21:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-16T22:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-16T23:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-17T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-17T01:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T02:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T03:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T04:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T06:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T07:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T09:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T10:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T11:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T12:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T13:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T14:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-11-17T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T16:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T17:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T18:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T19:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-18T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T01:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T02:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T03:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T04:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T05:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T06:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T07:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T08:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T09:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T10:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T11:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T12:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T13:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T14:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T15:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T16:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T17:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T18:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T19:00+08:00","value":"CLEAR_NIGHT"}],"pressure":[{"datetime":"2020-11-16T20:00+08:00","value":100156.2269696001},{"datetime":"2020-11-16T21:00+08:00","value":100186.8994560001},{"datetime":"2020-11-16T22:00+08:00","value":100224.6264832001},{"datetime":"2020-11-16T23:00+08:00","value":100186.8994560001},{"datetime":"2020-11-17T00:00+08:00","value":100106.899456},{"datetime":"2020-11-17T01:00+08:00","value":99996.2269696001},{"datetime":"2020-11-17T02:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T03:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T04:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T05:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T06:00+08:00","value":99984.6264832001},{"datetime":"2020-11-17T07:00+08:00","value":100026.8994560001},{"datetime":"2020-11-17T08:00+08:00","value":100064.6264832001},{"datetime":"2020-11-17T09:00+08:00","value":100076.2269696001},{"datetime":"2020-11-17T10:00+08:00","value":100106.8994560001},{"datetime":"2020-11-17T11:00+08:00","value":100064.6264832001},{"datetime":"2020-11-17T12:00+08:00","value":99984.6264832001},{"datetime":"2020-11-17T13:00+08:00","value":99904.6264832001},{"datetime":"2020-11-17T14:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T15:00+08:00","value":99786.8994560001},{"datetime":"2020-11-17T16:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T17:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T18:00+08:00","value":99866.8994560001},{"datetime":"2020-11-17T19:00+08:00","value":99897.2354560001},{"datetime":"2020-11-17T20:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T21:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T22:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T23:00+08:00","value":99866.8994560001},{"datetime":"2020-11-18T00:00+08:00","value":99836.2269696},{"datetime":"2020-11-18T01:00+08:00","value":99798.4999424001},{"datetime":"2020-11-18T02:00+08:00","value":99737.2354560001},{"datetime":"2020-11-18T03:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T04:00+08:00","value":99657.2354560001},{"datetime":"2020-11-18T05:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T06:00+08:00","value":99725.5544832001},{"datetime":"2020-11-18T07:00+08:00","value":99767.8274560001},{"datetime":"2020-11-18T08:00+08:00","value":99847.8274560001},{"datetime":"2020-11-18T09:00+08:00","value":99847.8274560001},{"datetime":"2020-11-18T10:00+08:00","value":99836.2269696001},{"datetime":"2020-11-18T11:00+08:00","value":99756.2269696001},{"datetime":"2020-11-18T12:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T13:00+08:00","value":99596.2269696001},{"datetime":"2020-11-18T14:00+08:00","value":99534.9624832001},{"datetime":"2020-11-18T15:00+08:00","value":99485.5544832},{"datetime":"2020-11-18T16:00+08:00","value":99485.5544832001},{"datetime":"2020-11-18T17:00+08:00","value":99546.5629696001},{"datetime":"2020-11-18T18:00+08:00","value":99565.5544832001},{"datetime":"2020-11-18T19:00+08:00","value":99645.5544832001}],"visibility":[{"datetime":"2020-11-16T20:00+08:00","value":8.9},{"datetime":"2020-11-16T21:00+08:00","value":9.04},{"datetime":"2020-11-16T22:00+08:00","value":9.17},{"datetime":"2020-11-16T23:00+08:00","value":9.19},{"datetime":"2020-11-17T00:00+08:00","value":8.89},{"datetime":"2020-11-17T01:00+08:00","value":4.98},{"datetime":"2020-11-17T02:00+08:00","value":4.89},{"datetime":"2020-11-17T03:00+08:00","value":4.48},{"datetime":"2020-11-17T04:00+08:00","value":4.9},{"datetime":"2020-11-17T05:00+08:00","value":5.14},{"datetime":"2020-11-17T06:00+08:00","value":4.01},{"datetime":"2020-11-17T07:00+08:00","value":5.21},{"datetime":"2020-11-17T08:00+08:00","value":4.68},{"datetime":"2020-11-17T09:00+08:00","value":4.22},{"datetime":"2020-11-17T10:00+08:00","value":5.12},{"datetime":"2020-11-17T11:00+08:00","value":4.39},{"datetime":"2020-11-17T12:00+08:00","value":4.2},{"datetime":"2020-11-17T13:00+08:00","value":4.09},{"datetime":"2020-11-17T14:00+08:00","value":8.93},{"datetime":"2020-11-17T15:00+08:00","value":8.97},{"datetime":"2020-11-17T16:00+08:00","value":9.32},{"datetime":"2020-11-17T17:00+08:00","value":5.38},{"datetime":"2020-11-17T18:00+08:00","value":4.79},{"datetime":"2020-11-17T19:00+08:00","value":5},{"datetime":"2020-11-17T20:00+08:00","value":5.24},{"datetime":"2020-11-17T21:00+08:00","value":4.67},{"datetime":"2020-11-17T22:00+08:00","value":5.06},{"datetime":"2020-11-17T23:00+08:00","value":9.43},{"datetime":"2020-11-18T00:00+08:00","value":9.58},{"datetime":"2020-11-18T01:00+08:00","value":9.72},{"datetime":"2020-11-18T02:00+08:00","value":10.01},{"datetime":"2020-11-18T03:00+08:00","value":9.66},{"datetime":"2020-11-18T04:00+08:00","value":9.65},{"datetime":"2020-11-18T05:00+08:00","value":10},{"datetime":"2020-11-18T06:00+08:00","value":10},{"datetime":"2020-11-18T07:00+08:00","value":10},{"datetime":"2020-11-18T08:00+08:00","value":8.92},{"datetime":"2020-11-18T09:00+08:00","value":9.64},{"datetime":"2020-11-18T10:00+08:00","value":11.37},{"datetime":"2020-11-18T11:00+08:00","value":12.41},{"datetime":"2020-11-18T12:00+08:00","value":12.82},{"datetime":"2020-11-18T13:00+08:00","value":12.57},{"datetime":"2020-11-18T14:00+08:00","value":11.75},{"datetime":"2020-11-18T15:00+08:00","value":11.55},{"datetime":"2020-11-18T16:00+08:00","value":10.79},{"datetime":"2020-11-18T17:00+08:00","value":9.62},{"datetime":"2020-11-18T18:00+08:00","value":10},{"datetime":"2020-11-18T19:00+08:00","value":9.99}],"dswrf":[{"datetime":"2020-11-16T20:00+08:00","value":88.7744256},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0},{"datetime":"2020-11-16T23:00+08:00","value":0},{"datetime":"2020-11-17T00:00+08:00","value":0},{"datetime":"2020-11-17T01:00+08:00","value":0},{"datetime":"2020-11-17T02:00+08:00","value":0},{"datetime":"2020-11-17T03:00+08:00","value":0},{"datetime":"2020-11-17T04:00+08:00","value":0},{"datetime":"2020-11-17T05:00+08:00","value":0},{"datetime":"2020-11-17T06:00+08:00","value":0},{"datetime":"2020-11-17T07:00+08:00","value":1.4500608},{"datetime":"2020-11-17T08:00+08:00","value":17.90523648},{"datetime":"2020-11-17T09:00+08:00","value":227.3929728},{"datetime":"2020-11-17T10:00+08:00","value":345.9328512},{"datetime":"2020-11-17T11:00+08:00","value":427.3609728},{"datetime":"2020-11-17T12:00+08:00","value":473.2453376},{"datetime":"2020-11-17T13:00+08:00","value":481.4295808},{"datetime":"2020-11-17T14:00+08:00","value":474.3717632},{"datetime":"2020-11-17T15:00+08:00","value":335.0313984},{"datetime":"2020-11-17T16:00+08:00","value":273.9150336},{"datetime":"2020-11-17T17:00+08:00","value":195.6567296},{"datetime":"2020-11-17T18:00+08:00","value":148.8905472},{"datetime":"2020-11-17T19:00+08:00","value":117.3984256},{"datetime":"2020-11-17T20:00+08:00","value":99.7403648},{"datetime":"2020-11-17T21:00+08:00","value":0},{"datetime":"2020-11-17T22:00+08:00","value":0},{"datetime":"2020-11-17T23:00+08:00","value":0},{"datetime":"2020-11-18T00:00+08:00","value":0},{"datetime":"2020-11-18T01:00+08:00","value":0},{"datetime":"2020-11-18T02:00+08:00","value":0},{"datetime":"2020-11-18T03:00+08:00","value":0},{"datetime":"2020-11-18T04:00+08:00","value":0},{"datetime":"2020-11-18T05:00+08:00","value":0},{"datetime":"2020-11-18T06:00+08:00","value":0},{"datetime":"2020-11-18T07:00+08:00","value":10},{"datetime":"2020-11-18T08:00+08:00","value":39.85179392},{"datetime":"2020-11-18T09:00+08:00","value":402.3419392},{"datetime":"2020-11-18T10:00+08:00","value":486.176},{"datetime":"2020-11-18T11:00+08:00","value":549.968},{"datetime":"2020-11-18T12:00+08:00","value":589.968},{"datetime":"2020-11-18T13:00+08:00","value":610},{"datetime":"2020-11-18T14:00+08:00","value":607.6260608},{"datetime":"2020-11-18T15:00+08:00","value":426.580608},{"datetime":"2020-11-18T16:00+08:00","value":343.6064256},{"datetime":"2020-11-18T17:00+08:00","value":248.290304},{"datetime":"2020-11-18T18:00+08:00","value":188.258304},{"datetime":"2020-11-18T19:00+08:00","value":152.9741824}],"air_quality":{"aqi":[{"datetime":"2020-11-16T20:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-16T21:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-16T22:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-16T23:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T00:00+08:00","value":{"chn":14,"usa":14}},{"datetime":"2020-11-17T01:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T02:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T03:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T04:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T05:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T06:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T07:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T08:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T09:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T10:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-17T12:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T14:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T15:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T16:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-11-17T17:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-11-17T18:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T19:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T20:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-17T21:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T22:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T23:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T00:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-18T01:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T02:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T03:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T04:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T05:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T06:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T07:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T08:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T09:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T10:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T12:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-18T14:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-18T15:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T16:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T17:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T18:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-18T19:00+08:00","value":{"chn":13,"usa":13}}],"pm25":[{"datetime":"2020-11-16T20:00+08:00","value":9},{"datetime":"2020-11-16T21:00+08:00","value":10},{"datetime":"2020-11-16T22:00+08:00","value":10},{"datetime":"2020-11-16T23:00+08:00","value":10},{"datetime":"2020-11-17T00:00+08:00","value":10},{"datetime":"2020-11-17T01:00+08:00","value":10},{"datetime":"2020-11-17T02:00+08:00","value":10},{"datetime":"2020-11-17T03:00+08:00","value":10},{"datetime":"2020-11-17T04:00+08:00","value":9},{"datetime":"2020-11-17T05:00+08:00","value":9},{"datetime":"2020-11-17T06:00+08:00","value":9},{"datetime":"2020-11-17T07:00+08:00","value":8},{"datetime":"2020-11-17T08:00+08:00","value":9},{"datetime":"2020-11-17T09:00+08:00","value":9},{"datetime":"2020-11-17T10:00+08:00","value":8},{"datetime":"2020-11-17T11:00+08:00","value":8},{"datetime":"2020-11-17T12:00+08:00","value":7},{"datetime":"2020-11-17T13:00+08:00","value":7},{"datetime":"2020-11-17T14:00+08:00","value":7},{"datetime":"2020-11-17T15:00+08:00","value":7},{"datetime":"2020-11-17T16:00+08:00","value":6},{"datetime":"2020-11-17T17:00+08:00","value":6},{"datetime":"2020-11-17T18:00+08:00","value":7},{"datetime":"2020-11-17T19:00+08:00","value":7},{"datetime":"2020-11-17T20:00+08:00","value":7},{"datetime":"2020-11-17T21:00+08:00","value":8},{"datetime":"2020-11-17T22:00+08:00","value":8},{"datetime":"2020-11-17T23:00+08:00","value":8},{"datetime":"2020-11-18T00:00+08:00","value":8},{"datetime":"2020-11-18T01:00+08:00","value":8},{"datetime":"2020-11-18T02:00+08:00","value":8},{"datetime":"2020-11-18T03:00+08:00","value":8},{"datetime":"2020-11-18T04:00+08:00","value":7},{"datetime":"2020-11-18T05:00+08:00","value":7},{"datetime":"2020-11-18T06:00+08:00","value":7},{"datetime":"2020-11-18T07:00+08:00","value":8},{"datetime":"2020-11-18T08:00+08:00","value":8},{"datetime":"2020-11-18T09:00+08:00","value":7},{"datetime":"2020-11-18T10:00+08:00","value":7},{"datetime":"2020-11-18T11:00+08:00","value":8},{"datetime":"2020-11-18T12:00+08:00","value":7},{"datetime":"2020-11-18T13:00+08:00","value":7},{"datetime":"2020-11-18T14:00+08:00","value":7},{"datetime":"2020-11-18T15:00+08:00","value":8},{"datetime":"2020-11-18T16:00+08:00","value":8},{"datetime":"2020-11-18T17:00+08:00","value":8},{"datetime":"2020-11-18T18:00+08:00","value":8},{"datetime":"2020-11-18T19:00+08:00","value":9}]}}
         * primary : 0
         * forecast_keypoint : 晴，明天午夜1点钟后转小雨，其后阴
         */

        private HourlyDTO hourly;
        private int primary;
        private String forecast_keypoint;

        public HourlyDTO getHourly() {
            return hourly;
        }

        public void setHourly(HourlyDTO hourly) {
            this.hourly = hourly;
        }

        public int getPrimary() {
            return primary;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public String getForecast_keypoint() {
            return forecast_keypoint;
        }

        public void setForecast_keypoint(String forecast_keypoint) {
            this.forecast_keypoint = forecast_keypoint;
        }

        public static class HourlyDTO {
            /**
             * status : ok
             * description : 晴，明天午夜1点钟后转小雨，其后阴
             * precipitation : [{"datetime":"2020-11-16T20:00+08:00","value":0},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0},{"datetime":"2020-11-16T23:00+08:00","value":0},{"datetime":"2020-11-17T00:00+08:00","value":0},{"datetime":"2020-11-17T01:00+08:00","value":1.4649},{"datetime":"2020-11-17T02:00+08:00","value":0.7589},{"datetime":"2020-11-17T03:00+08:00","value":0.1485},{"datetime":"2020-11-17T04:00+08:00","value":0.173},{"datetime":"2020-11-17T05:00+08:00","value":0},{"datetime":"2020-11-17T06:00+08:00","value":0.123},{"datetime":"2020-11-17T07:00+08:00","value":0.0911},{"datetime":"2020-11-17T08:00+08:00","value":0},{"datetime":"2020-11-17T09:00+08:00","value":0.1413},{"datetime":"2020-11-17T10:00+08:00","value":0.1634},{"datetime":"2020-11-17T11:00+08:00","value":1.1238},{"datetime":"2020-11-17T12:00+08:00","value":1.7633},{"datetime":"2020-11-17T13:00+08:00","value":0.0616},{"datetime":"2020-11-17T14:00+08:00","value":0},{"datetime":"2020-11-17T15:00+08:00","value":0},{"datetime":"2020-11-17T16:00+08:00","value":0},{"datetime":"2020-11-17T17:00+08:00","value":0},{"datetime":"2020-11-17T18:00+08:00","value":0},{"datetime":"2020-11-17T19:00+08:00","value":0},{"datetime":"2020-11-17T20:00+08:00","value":0},{"datetime":"2020-11-17T21:00+08:00","value":0},{"datetime":"2020-11-17T22:00+08:00","value":0},{"datetime":"2020-11-17T23:00+08:00","value":0},{"datetime":"2020-11-18T00:00+08:00","value":0},{"datetime":"2020-11-18T01:00+08:00","value":0},{"datetime":"2020-11-18T02:00+08:00","value":0},{"datetime":"2020-11-18T03:00+08:00","value":0},{"datetime":"2020-11-18T04:00+08:00","value":0},{"datetime":"2020-11-18T05:00+08:00","value":0},{"datetime":"2020-11-18T06:00+08:00","value":0},{"datetime":"2020-11-18T07:00+08:00","value":0},{"datetime":"2020-11-18T08:00+08:00","value":0},{"datetime":"2020-11-18T09:00+08:00","value":0},{"datetime":"2020-11-18T10:00+08:00","value":0},{"datetime":"2020-11-18T11:00+08:00","value":0},{"datetime":"2020-11-18T12:00+08:00","value":0},{"datetime":"2020-11-18T13:00+08:00","value":0},{"datetime":"2020-11-18T14:00+08:00","value":0},{"datetime":"2020-11-18T15:00+08:00","value":0},{"datetime":"2020-11-18T16:00+08:00","value":0},{"datetime":"2020-11-18T17:00+08:00","value":0},{"datetime":"2020-11-18T18:00+08:00","value":0},{"datetime":"2020-11-18T19:00+08:00","value":0}]
             * temperature : [{"datetime":"2020-11-16T20:00+08:00","value":20.16},{"datetime":"2020-11-16T21:00+08:00","value":22},{"datetime":"2020-11-16T22:00+08:00","value":22},{"datetime":"2020-11-16T23:00+08:00","value":22},{"datetime":"2020-11-17T00:00+08:00","value":22},{"datetime":"2020-11-17T01:00+08:00","value":22},{"datetime":"2020-11-17T02:00+08:00","value":22},{"datetime":"2020-11-17T03:00+08:00","value":22.3},{"datetime":"2020-11-17T04:00+08:00","value":22.6},{"datetime":"2020-11-17T05:00+08:00","value":22.9},{"datetime":"2020-11-17T06:00+08:00","value":23.2},{"datetime":"2020-11-17T07:00+08:00","value":23.7},{"datetime":"2020-11-17T08:00+08:00","value":24},{"datetime":"2020-11-17T09:00+08:00","value":24.3},{"datetime":"2020-11-17T10:00+08:00","value":24.6},{"datetime":"2020-11-17T11:00+08:00","value":24.8},{"datetime":"2020-11-17T12:00+08:00","value":25},{"datetime":"2020-11-17T13:00+08:00","value":24.9},{"datetime":"2020-11-17T14:00+08:00","value":24.8},{"datetime":"2020-11-17T15:00+08:00","value":24.7},{"datetime":"2020-11-17T16:00+08:00","value":24.6},{"datetime":"2020-11-17T17:00+08:00","value":24},{"datetime":"2020-11-17T18:00+08:00","value":23.8},{"datetime":"2020-11-17T19:00+08:00","value":23.35},{"datetime":"2020-11-17T20:00+08:00","value":23.06},{"datetime":"2020-11-17T21:00+08:00","value":22.69},{"datetime":"2020-11-17T22:00+08:00","value":22.28},{"datetime":"2020-11-17T23:00+08:00","value":22.1},{"datetime":"2020-11-18T00:00+08:00","value":21.88},{"datetime":"2020-11-18T01:00+08:00","value":21.72},{"datetime":"2020-11-18T02:00+08:00","value":21.55},{"datetime":"2020-11-18T03:00+08:00","value":21.37},{"datetime":"2020-11-18T04:00+08:00","value":21.61},{"datetime":"2020-11-18T05:00+08:00","value":21.89},{"datetime":"2020-11-18T06:00+08:00","value":21},{"datetime":"2020-11-18T07:00+08:00","value":22.63},{"datetime":"2020-11-18T08:00+08:00","value":22.85},{"datetime":"2020-11-18T09:00+08:00","value":23.05},{"datetime":"2020-11-18T10:00+08:00","value":23.28},{"datetime":"2020-11-18T11:00+08:00","value":23.59},{"datetime":"2020-11-18T12:00+08:00","value":24.03},{"datetime":"2020-11-18T13:00+08:00","value":26},{"datetime":"2020-11-18T14:00+08:00","value":25.03},{"datetime":"2020-11-18T15:00+08:00","value":25.44},{"datetime":"2020-11-18T16:00+08:00","value":25.67},{"datetime":"2020-11-18T17:00+08:00","value":25.23},{"datetime":"2020-11-18T18:00+08:00","value":24.77},{"datetime":"2020-11-18T19:00+08:00","value":24.35}]
             * wind : [{"datetime":"2020-11-16T20:00+08:00","speed":24.12,"direction":45},{"datetime":"2020-11-16T21:00+08:00","speed":22.62,"direction":97.2},{"datetime":"2020-11-16T22:00+08:00","speed":23.79,"direction":99.52},{"datetime":"2020-11-16T23:00+08:00","speed":23.45,"direction":100.04},{"datetime":"2020-11-17T00:00+08:00","speed":24.39,"direction":100.36},{"datetime":"2020-11-17T01:00+08:00","speed":24.75,"direction":101.97},{"datetime":"2020-11-17T02:00+08:00","speed":23.45,"direction":103.33},{"datetime":"2020-11-17T03:00+08:00","speed":23.24,"direction":104.16},{"datetime":"2020-11-17T04:00+08:00","speed":24.02,"direction":107.42},{"datetime":"2020-11-17T05:00+08:00","speed":24.08,"direction":106.19},{"datetime":"2020-11-17T06:00+08:00","speed":24.82,"direction":105.25},{"datetime":"2020-11-17T07:00+08:00","speed":24.99,"direction":104.27},{"datetime":"2020-11-17T08:00+08:00","speed":26.43,"direction":106.09},{"datetime":"2020-11-17T09:00+08:00","speed":27.04,"direction":108.53},{"datetime":"2020-11-17T10:00+08:00","speed":26.96,"direction":109.16},{"datetime":"2020-11-17T11:00+08:00","speed":26.91,"direction":109.75},{"datetime":"2020-11-17T12:00+08:00","speed":26.83,"direction":108.09},{"datetime":"2020-11-17T13:00+08:00","speed":25.78,"direction":108.03},{"datetime":"2020-11-17T14:00+08:00","speed":25.52,"direction":110.38},{"datetime":"2020-11-17T15:00+08:00","speed":24.96,"direction":111.33},{"datetime":"2020-11-17T16:00+08:00","speed":24.49,"direction":114.34},{"datetime":"2020-11-17T17:00+08:00","speed":23.92,"direction":113.25},{"datetime":"2020-11-17T18:00+08:00","speed":23.47,"direction":115.22},{"datetime":"2020-11-17T19:00+08:00","speed":23.73,"direction":117.92},{"datetime":"2020-11-17T20:00+08:00","speed":23.68,"direction":118.75},{"datetime":"2020-11-17T21:00+08:00","speed":24.15,"direction":122.51},{"datetime":"2020-11-17T22:00+08:00","speed":24.1,"direction":122.69},{"datetime":"2020-11-17T23:00+08:00","speed":23.45,"direction":126.97},{"datetime":"2020-11-18T00:00+08:00","speed":21.07,"direction":129.33},{"datetime":"2020-11-18T01:00+08:00","speed":20.86,"direction":131.21},{"datetime":"2020-11-18T02:00+08:00","speed":21.95,"direction":132.73},{"datetime":"2020-11-18T03:00+08:00","speed":21.97,"direction":135.42},{"datetime":"2020-11-18T04:00+08:00","speed":20.08,"direction":140.32},{"datetime":"2020-11-18T05:00+08:00","speed":18.59,"direction":141.84},{"datetime":"2020-11-18T06:00+08:00","speed":16.47,"direction":147.36},{"datetime":"2020-11-18T07:00+08:00","speed":14.22,"direction":155.44},{"datetime":"2020-11-18T08:00+08:00","speed":11.72,"direction":154.86},{"datetime":"2020-11-18T09:00+08:00","speed":10.75,"direction":145.76},{"datetime":"2020-11-18T10:00+08:00","speed":10.31,"direction":138.69},{"datetime":"2020-11-18T11:00+08:00","speed":10.39,"direction":124.1},{"datetime":"2020-11-18T12:00+08:00","speed":11.7,"direction":120.43},{"datetime":"2020-11-18T13:00+08:00","speed":12.01,"direction":123.75},{"datetime":"2020-11-18T14:00+08:00","speed":12.69,"direction":123.2},{"datetime":"2020-11-18T15:00+08:00","speed":13.75,"direction":124.87},{"datetime":"2020-11-18T16:00+08:00","speed":13.36,"direction":128.35},{"datetime":"2020-11-18T17:00+08:00","speed":11.89,"direction":136.95},{"datetime":"2020-11-18T18:00+08:00","speed":11.09,"direction":150.14},{"datetime":"2020-11-18T19:00+08:00","speed":10.24,"direction":162.75}]
             * humidity : [{"datetime":"2020-11-16T20:00+08:00","value":0.88},{"datetime":"2020-11-16T21:00+08:00","value":0.87},{"datetime":"2020-11-16T22:00+08:00","value":0.87},{"datetime":"2020-11-16T23:00+08:00","value":0.87},{"datetime":"2020-11-17T00:00+08:00","value":0.88},{"datetime":"2020-11-17T01:00+08:00","value":0.87},{"datetime":"2020-11-17T02:00+08:00","value":0.88},{"datetime":"2020-11-17T03:00+08:00","value":0.88},{"datetime":"2020-11-17T04:00+08:00","value":0.88},{"datetime":"2020-11-17T05:00+08:00","value":0.87},{"datetime":"2020-11-17T06:00+08:00","value":0.88},{"datetime":"2020-11-17T07:00+08:00","value":0.86},{"datetime":"2020-11-17T08:00+08:00","value":0.85},{"datetime":"2020-11-17T09:00+08:00","value":0.83},{"datetime":"2020-11-17T10:00+08:00","value":0.81},{"datetime":"2020-11-17T11:00+08:00","value":0.8},{"datetime":"2020-11-17T12:00+08:00","value":0.8},{"datetime":"2020-11-17T13:00+08:00","value":0.8},{"datetime":"2020-11-17T14:00+08:00","value":0.81},{"datetime":"2020-11-17T15:00+08:00","value":0.82},{"datetime":"2020-11-17T16:00+08:00","value":0.83},{"datetime":"2020-11-17T17:00+08:00","value":0.85},{"datetime":"2020-11-17T18:00+08:00","value":0.86},{"datetime":"2020-11-17T19:00+08:00","value":0.87},{"datetime":"2020-11-17T20:00+08:00","value":0.87},{"datetime":"2020-11-17T21:00+08:00","value":0.87},{"datetime":"2020-11-17T22:00+08:00","value":0.87},{"datetime":"2020-11-17T23:00+08:00","value":0.87},{"datetime":"2020-11-18T00:00+08:00","value":0.87},{"datetime":"2020-11-18T01:00+08:00","value":0.87},{"datetime":"2020-11-18T02:00+08:00","value":0.87},{"datetime":"2020-11-18T03:00+08:00","value":0.88},{"datetime":"2020-11-18T04:00+08:00","value":0.88},{"datetime":"2020-11-18T05:00+08:00","value":0.88},{"datetime":"2020-11-18T06:00+08:00","value":0.88},{"datetime":"2020-11-18T07:00+08:00","value":0.87},{"datetime":"2020-11-18T08:00+08:00","value":0.83},{"datetime":"2020-11-18T09:00+08:00","value":0.78},{"datetime":"2020-11-18T10:00+08:00","value":0.74},{"datetime":"2020-11-18T11:00+08:00","value":0.71},{"datetime":"2020-11-18T12:00+08:00","value":0.7},{"datetime":"2020-11-18T13:00+08:00","value":0.7},{"datetime":"2020-11-18T14:00+08:00","value":0.72},{"datetime":"2020-11-18T15:00+08:00","value":0.74},{"datetime":"2020-11-18T16:00+08:00","value":0.78},{"datetime":"2020-11-18T17:00+08:00","value":0.82},{"datetime":"2020-11-18T18:00+08:00","value":0.84},{"datetime":"2020-11-18T19:00+08:00","value":0.84}]
             * cloudrate : [{"datetime":"2020-11-16T20:00+08:00","value":0},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0.72},{"datetime":"2020-11-16T23:00+08:00","value":0.64},{"datetime":"2020-11-17T00:00+08:00","value":0.62},{"datetime":"2020-11-17T01:00+08:00","value":0.62},{"datetime":"2020-11-17T02:00+08:00","value":0.67},{"datetime":"2020-11-17T03:00+08:00","value":0.99},{"datetime":"2020-11-17T04:00+08:00","value":0.96},{"datetime":"2020-11-17T05:00+08:00","value":0.98},{"datetime":"2020-11-17T06:00+08:00","value":0.98},{"datetime":"2020-11-17T07:00+08:00","value":0.99},{"datetime":"2020-11-17T08:00+08:00","value":0.99},{"datetime":"2020-11-17T09:00+08:00","value":1},{"datetime":"2020-11-17T10:00+08:00","value":0.82},{"datetime":"2020-11-17T11:00+08:00","value":0.75},{"datetime":"2020-11-17T12:00+08:00","value":0.7},{"datetime":"2020-11-17T13:00+08:00","value":0.67},{"datetime":"2020-11-17T14:00+08:00","value":0.66},{"datetime":"2020-11-17T15:00+08:00","value":0.9},{"datetime":"2020-11-17T16:00+08:00","value":0.94},{"datetime":"2020-11-17T17:00+08:00","value":0.96},{"datetime":"2020-11-17T18:00+08:00","value":0.97},{"datetime":"2020-11-17T19:00+08:00","value":0.94},{"datetime":"2020-11-17T20:00+08:00","value":0.94},{"datetime":"2020-11-17T21:00+08:00","value":0.9},{"datetime":"2020-11-17T22:00+08:00","value":0.88},{"datetime":"2020-11-17T23:00+08:00","value":0.83},{"datetime":"2020-11-18T00:00+08:00","value":0.72},{"datetime":"2020-11-18T01:00+08:00","value":0.64},{"datetime":"2020-11-18T02:00+08:00","value":0.56},{"datetime":"2020-11-18T03:00+08:00","value":0.08},{"datetime":"2020-11-18T04:00+08:00","value":0.07},{"datetime":"2020-11-18T05:00+08:00","value":0.05},{"datetime":"2020-11-18T06:00+08:00","value":0.05},{"datetime":"2020-11-18T07:00+08:00","value":0.04},{"datetime":"2020-11-18T08:00+08:00","value":0.04},{"datetime":"2020-11-18T09:00+08:00","value":0},{"datetime":"2020-11-18T10:00+08:00","value":0},{"datetime":"2020-11-18T11:00+08:00","value":0},{"datetime":"2020-11-18T12:00+08:00","value":0.01},{"datetime":"2020-11-18T13:00+08:00","value":0.02},{"datetime":"2020-11-18T14:00+08:00","value":0.04},{"datetime":"2020-11-18T15:00+08:00","value":0.2},{"datetime":"2020-11-18T16:00+08:00","value":0.19},{"datetime":"2020-11-18T17:00+08:00","value":0.16},{"datetime":"2020-11-18T18:00+08:00","value":0.16},{"datetime":"2020-11-18T19:00+08:00","value":0.16}]
             * skycon : [{"datetime":"2020-11-16T20:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-16T21:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-16T22:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-16T23:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-17T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-17T01:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T02:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T03:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T04:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T06:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T07:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T09:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T10:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T11:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T12:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-11-17T13:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-11-17T14:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-11-17T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T16:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T17:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T18:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T19:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-17T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-11-18T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T01:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T02:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-11-18T03:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T04:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T05:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T06:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T07:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T08:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T09:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T10:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T11:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T12:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T13:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T14:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T15:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T16:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-11-18T17:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T18:00+08:00","value":"CLEAR_NIGHT"},{"datetime":"2020-11-18T19:00+08:00","value":"CLEAR_NIGHT"}]
             * pressure : [{"datetime":"2020-11-16T20:00+08:00","value":100156.2269696001},{"datetime":"2020-11-16T21:00+08:00","value":100186.8994560001},{"datetime":"2020-11-16T22:00+08:00","value":100224.6264832001},{"datetime":"2020-11-16T23:00+08:00","value":100186.8994560001},{"datetime":"2020-11-17T00:00+08:00","value":100106.899456},{"datetime":"2020-11-17T01:00+08:00","value":99996.2269696001},{"datetime":"2020-11-17T02:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T03:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T04:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T05:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T06:00+08:00","value":99984.6264832001},{"datetime":"2020-11-17T07:00+08:00","value":100026.8994560001},{"datetime":"2020-11-17T08:00+08:00","value":100064.6264832001},{"datetime":"2020-11-17T09:00+08:00","value":100076.2269696001},{"datetime":"2020-11-17T10:00+08:00","value":100106.8994560001},{"datetime":"2020-11-17T11:00+08:00","value":100064.6264832001},{"datetime":"2020-11-17T12:00+08:00","value":99984.6264832001},{"datetime":"2020-11-17T13:00+08:00","value":99904.6264832001},{"datetime":"2020-11-17T14:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T15:00+08:00","value":99786.8994560001},{"datetime":"2020-11-17T16:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T17:00+08:00","value":99805.6349696001},{"datetime":"2020-11-17T18:00+08:00","value":99866.8994560001},{"datetime":"2020-11-17T19:00+08:00","value":99897.2354560001},{"datetime":"2020-11-17T20:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T21:00+08:00","value":99946.8994560001},{"datetime":"2020-11-17T22:00+08:00","value":99916.2269696001},{"datetime":"2020-11-17T23:00+08:00","value":99866.8994560001},{"datetime":"2020-11-18T00:00+08:00","value":99836.2269696},{"datetime":"2020-11-18T01:00+08:00","value":99798.4999424001},{"datetime":"2020-11-18T02:00+08:00","value":99737.2354560001},{"datetime":"2020-11-18T03:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T04:00+08:00","value":99657.2354560001},{"datetime":"2020-11-18T05:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T06:00+08:00","value":99725.5544832001},{"datetime":"2020-11-18T07:00+08:00","value":99767.8274560001},{"datetime":"2020-11-18T08:00+08:00","value":99847.8274560001},{"datetime":"2020-11-18T09:00+08:00","value":99847.8274560001},{"datetime":"2020-11-18T10:00+08:00","value":99836.2269696001},{"datetime":"2020-11-18T11:00+08:00","value":99756.2269696001},{"datetime":"2020-11-18T12:00+08:00","value":99676.2269696001},{"datetime":"2020-11-18T13:00+08:00","value":99596.2269696001},{"datetime":"2020-11-18T14:00+08:00","value":99534.9624832001},{"datetime":"2020-11-18T15:00+08:00","value":99485.5544832},{"datetime":"2020-11-18T16:00+08:00","value":99485.5544832001},{"datetime":"2020-11-18T17:00+08:00","value":99546.5629696001},{"datetime":"2020-11-18T18:00+08:00","value":99565.5544832001},{"datetime":"2020-11-18T19:00+08:00","value":99645.5544832001}]
             * visibility : [{"datetime":"2020-11-16T20:00+08:00","value":8.9},{"datetime":"2020-11-16T21:00+08:00","value":9.04},{"datetime":"2020-11-16T22:00+08:00","value":9.17},{"datetime":"2020-11-16T23:00+08:00","value":9.19},{"datetime":"2020-11-17T00:00+08:00","value":8.89},{"datetime":"2020-11-17T01:00+08:00","value":4.98},{"datetime":"2020-11-17T02:00+08:00","value":4.89},{"datetime":"2020-11-17T03:00+08:00","value":4.48},{"datetime":"2020-11-17T04:00+08:00","value":4.9},{"datetime":"2020-11-17T05:00+08:00","value":5.14},{"datetime":"2020-11-17T06:00+08:00","value":4.01},{"datetime":"2020-11-17T07:00+08:00","value":5.21},{"datetime":"2020-11-17T08:00+08:00","value":4.68},{"datetime":"2020-11-17T09:00+08:00","value":4.22},{"datetime":"2020-11-17T10:00+08:00","value":5.12},{"datetime":"2020-11-17T11:00+08:00","value":4.39},{"datetime":"2020-11-17T12:00+08:00","value":4.2},{"datetime":"2020-11-17T13:00+08:00","value":4.09},{"datetime":"2020-11-17T14:00+08:00","value":8.93},{"datetime":"2020-11-17T15:00+08:00","value":8.97},{"datetime":"2020-11-17T16:00+08:00","value":9.32},{"datetime":"2020-11-17T17:00+08:00","value":5.38},{"datetime":"2020-11-17T18:00+08:00","value":4.79},{"datetime":"2020-11-17T19:00+08:00","value":5},{"datetime":"2020-11-17T20:00+08:00","value":5.24},{"datetime":"2020-11-17T21:00+08:00","value":4.67},{"datetime":"2020-11-17T22:00+08:00","value":5.06},{"datetime":"2020-11-17T23:00+08:00","value":9.43},{"datetime":"2020-11-18T00:00+08:00","value":9.58},{"datetime":"2020-11-18T01:00+08:00","value":9.72},{"datetime":"2020-11-18T02:00+08:00","value":10.01},{"datetime":"2020-11-18T03:00+08:00","value":9.66},{"datetime":"2020-11-18T04:00+08:00","value":9.65},{"datetime":"2020-11-18T05:00+08:00","value":10},{"datetime":"2020-11-18T06:00+08:00","value":10},{"datetime":"2020-11-18T07:00+08:00","value":10},{"datetime":"2020-11-18T08:00+08:00","value":8.92},{"datetime":"2020-11-18T09:00+08:00","value":9.64},{"datetime":"2020-11-18T10:00+08:00","value":11.37},{"datetime":"2020-11-18T11:00+08:00","value":12.41},{"datetime":"2020-11-18T12:00+08:00","value":12.82},{"datetime":"2020-11-18T13:00+08:00","value":12.57},{"datetime":"2020-11-18T14:00+08:00","value":11.75},{"datetime":"2020-11-18T15:00+08:00","value":11.55},{"datetime":"2020-11-18T16:00+08:00","value":10.79},{"datetime":"2020-11-18T17:00+08:00","value":9.62},{"datetime":"2020-11-18T18:00+08:00","value":10},{"datetime":"2020-11-18T19:00+08:00","value":9.99}]
             * dswrf : [{"datetime":"2020-11-16T20:00+08:00","value":88.7744256},{"datetime":"2020-11-16T21:00+08:00","value":0},{"datetime":"2020-11-16T22:00+08:00","value":0},{"datetime":"2020-11-16T23:00+08:00","value":0},{"datetime":"2020-11-17T00:00+08:00","value":0},{"datetime":"2020-11-17T01:00+08:00","value":0},{"datetime":"2020-11-17T02:00+08:00","value":0},{"datetime":"2020-11-17T03:00+08:00","value":0},{"datetime":"2020-11-17T04:00+08:00","value":0},{"datetime":"2020-11-17T05:00+08:00","value":0},{"datetime":"2020-11-17T06:00+08:00","value":0},{"datetime":"2020-11-17T07:00+08:00","value":1.4500608},{"datetime":"2020-11-17T08:00+08:00","value":17.90523648},{"datetime":"2020-11-17T09:00+08:00","value":227.3929728},{"datetime":"2020-11-17T10:00+08:00","value":345.9328512},{"datetime":"2020-11-17T11:00+08:00","value":427.3609728},{"datetime":"2020-11-17T12:00+08:00","value":473.2453376},{"datetime":"2020-11-17T13:00+08:00","value":481.4295808},{"datetime":"2020-11-17T14:00+08:00","value":474.3717632},{"datetime":"2020-11-17T15:00+08:00","value":335.0313984},{"datetime":"2020-11-17T16:00+08:00","value":273.9150336},{"datetime":"2020-11-17T17:00+08:00","value":195.6567296},{"datetime":"2020-11-17T18:00+08:00","value":148.8905472},{"datetime":"2020-11-17T19:00+08:00","value":117.3984256},{"datetime":"2020-11-17T20:00+08:00","value":99.7403648},{"datetime":"2020-11-17T21:00+08:00","value":0},{"datetime":"2020-11-17T22:00+08:00","value":0},{"datetime":"2020-11-17T23:00+08:00","value":0},{"datetime":"2020-11-18T00:00+08:00","value":0},{"datetime":"2020-11-18T01:00+08:00","value":0},{"datetime":"2020-11-18T02:00+08:00","value":0},{"datetime":"2020-11-18T03:00+08:00","value":0},{"datetime":"2020-11-18T04:00+08:00","value":0},{"datetime":"2020-11-18T05:00+08:00","value":0},{"datetime":"2020-11-18T06:00+08:00","value":0},{"datetime":"2020-11-18T07:00+08:00","value":10},{"datetime":"2020-11-18T08:00+08:00","value":39.85179392},{"datetime":"2020-11-18T09:00+08:00","value":402.3419392},{"datetime":"2020-11-18T10:00+08:00","value":486.176},{"datetime":"2020-11-18T11:00+08:00","value":549.968},{"datetime":"2020-11-18T12:00+08:00","value":589.968},{"datetime":"2020-11-18T13:00+08:00","value":610},{"datetime":"2020-11-18T14:00+08:00","value":607.6260608},{"datetime":"2020-11-18T15:00+08:00","value":426.580608},{"datetime":"2020-11-18T16:00+08:00","value":343.6064256},{"datetime":"2020-11-18T17:00+08:00","value":248.290304},{"datetime":"2020-11-18T18:00+08:00","value":188.258304},{"datetime":"2020-11-18T19:00+08:00","value":152.9741824}]
             * air_quality : {"aqi":[{"datetime":"2020-11-16T20:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-16T21:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-16T22:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-16T23:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T00:00+08:00","value":{"chn":14,"usa":14}},{"datetime":"2020-11-17T01:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T02:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T03:00+08:00","value":{"chn":13,"usa":13}},{"datetime":"2020-11-17T04:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T05:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T06:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T07:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T08:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T09:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-17T10:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-17T12:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T14:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T15:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T16:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-11-17T17:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-11-17T18:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T19:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-17T20:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-17T21:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T22:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-17T23:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T00:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-18T01:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T02:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T03:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T04:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T05:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T06:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T07:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T08:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T09:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T10:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T12:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-18T14:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-11-18T15:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T16:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-11-18T17:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-11-18T18:00+08:00","value":{"chn":12,"usa":12}},{"datetime":"2020-11-18T19:00+08:00","value":{"chn":13,"usa":13}}],"pm25":[{"datetime":"2020-11-16T20:00+08:00","value":9},{"datetime":"2020-11-16T21:00+08:00","value":10},{"datetime":"2020-11-16T22:00+08:00","value":10},{"datetime":"2020-11-16T23:00+08:00","value":10},{"datetime":"2020-11-17T00:00+08:00","value":10},{"datetime":"2020-11-17T01:00+08:00","value":10},{"datetime":"2020-11-17T02:00+08:00","value":10},{"datetime":"2020-11-17T03:00+08:00","value":10},{"datetime":"2020-11-17T04:00+08:00","value":9},{"datetime":"2020-11-17T05:00+08:00","value":9},{"datetime":"2020-11-17T06:00+08:00","value":9},{"datetime":"2020-11-17T07:00+08:00","value":8},{"datetime":"2020-11-17T08:00+08:00","value":9},{"datetime":"2020-11-17T09:00+08:00","value":9},{"datetime":"2020-11-17T10:00+08:00","value":8},{"datetime":"2020-11-17T11:00+08:00","value":8},{"datetime":"2020-11-17T12:00+08:00","value":7},{"datetime":"2020-11-17T13:00+08:00","value":7},{"datetime":"2020-11-17T14:00+08:00","value":7},{"datetime":"2020-11-17T15:00+08:00","value":7},{"datetime":"2020-11-17T16:00+08:00","value":6},{"datetime":"2020-11-17T17:00+08:00","value":6},{"datetime":"2020-11-17T18:00+08:00","value":7},{"datetime":"2020-11-17T19:00+08:00","value":7},{"datetime":"2020-11-17T20:00+08:00","value":7},{"datetime":"2020-11-17T21:00+08:00","value":8},{"datetime":"2020-11-17T22:00+08:00","value":8},{"datetime":"2020-11-17T23:00+08:00","value":8},{"datetime":"2020-11-18T00:00+08:00","value":8},{"datetime":"2020-11-18T01:00+08:00","value":8},{"datetime":"2020-11-18T02:00+08:00","value":8},{"datetime":"2020-11-18T03:00+08:00","value":8},{"datetime":"2020-11-18T04:00+08:00","value":7},{"datetime":"2020-11-18T05:00+08:00","value":7},{"datetime":"2020-11-18T06:00+08:00","value":7},{"datetime":"2020-11-18T07:00+08:00","value":8},{"datetime":"2020-11-18T08:00+08:00","value":8},{"datetime":"2020-11-18T09:00+08:00","value":7},{"datetime":"2020-11-18T10:00+08:00","value":7},{"datetime":"2020-11-18T11:00+08:00","value":8},{"datetime":"2020-11-18T12:00+08:00","value":7},{"datetime":"2020-11-18T13:00+08:00","value":7},{"datetime":"2020-11-18T14:00+08:00","value":7},{"datetime":"2020-11-18T15:00+08:00","value":8},{"datetime":"2020-11-18T16:00+08:00","value":8},{"datetime":"2020-11-18T17:00+08:00","value":8},{"datetime":"2020-11-18T18:00+08:00","value":8},{"datetime":"2020-11-18T19:00+08:00","value":9}]}
             */

            private String status;
            private String description;
            private AirQualityDTO air_quality;
            private List<PrecipitationDTO> precipitation;
            private List<TemperatureDTO> temperature;
            private List<WindDTO> wind;
            private List<HumidityDTO> humidity;
            private List<CloudrateDTO> cloudrate;
            private List<SkyconDTO> skycon;
            private List<PressureDTO> pressure;
            private List<VisibilityDTO> visibility;
            private List<DswrfDTO> dswrf;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public AirQualityDTO getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityDTO air_quality) {
                this.air_quality = air_quality;
            }

            public List<PrecipitationDTO> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationDTO> precipitation) {
                this.precipitation = precipitation;
            }

            public List<TemperatureDTO> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureDTO> temperature) {
                this.temperature = temperature;
            }

            public List<WindDTO> getWind() {
                return wind;
            }

            public void setWind(List<WindDTO> wind) {
                this.wind = wind;
            }

            public List<HumidityDTO> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityDTO> humidity) {
                this.humidity = humidity;
            }

            public List<CloudrateDTO> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateDTO> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<SkyconDTO> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconDTO> skycon) {
                this.skycon = skycon;
            }

            public List<PressureDTO> getPressure() {
                return pressure;
            }

            public void setPressure(List<PressureDTO> pressure) {
                this.pressure = pressure;
            }

            public List<VisibilityDTO> getVisibility() {
                return visibility;
            }

            public void setVisibility(List<VisibilityDTO> visibility) {
                this.visibility = visibility;
            }

            public List<DswrfDTO> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfDTO> dswrf) {
                this.dswrf = dswrf;
            }

            public static class AirQualityDTO {
                private List<AqiDTO> aqi;
                private List<Pm25DTO> pm25;

                public List<AqiDTO> getAqi() {
                    return aqi;
                }

                public void setAqi(List<AqiDTO> aqi) {
                    this.aqi = aqi;
                }

                public List<Pm25DTO> getPm25() {
                    return pm25;
                }

                public void setPm25(List<Pm25DTO> pm25) {
                    this.pm25 = pm25;
                }

                public static class AqiDTO {
                    /**
                     * datetime : 2020-11-16T20:00+08:00
                     * value : {"chn":13,"usa":13}
                     */

                    private String datetime;
                    private ValueDTO value;

                    public String getDatetime() {
                        return datetime;
                    }

                    public void setDatetime(String datetime) {
                        this.datetime = datetime;
                    }

                    public ValueDTO getValue() {
                        return value;
                    }

                    public void setValue(ValueDTO value) {
                        this.value = value;
                    }

                    public static class ValueDTO {
                        /**
                         * chn : 13
                         * usa : 13
                         */

                        private int chn;
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }
                }

                public static class Pm25DTO {
                    /**
                     * datetime : 2020-11-16T20:00+08:00
                     * value : 9
                     */

                    private String datetime;
                    private int value;

                    public String getDatetime() {
                        return datetime;
                    }

                    public void setDatetime(String datetime) {
                        this.datetime = datetime;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }
            }

            public static class PrecipitationDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * value : 0
                 */

                private String datetime;
                private int value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class TemperatureDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * value : 20.16
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class WindDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * speed : 24.12
                 * direction : 45
                 */

                private String datetime;
                private double speed;
                private int direction;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public int getDirection() {
                    return direction;
                }

                public void setDirection(int direction) {
                    this.direction = direction;
                }
            }

            public static class HumidityDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * value : 0.88
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class CloudrateDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * value : 0
                 */

                private String datetime;
                private int value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class SkyconDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * value : CLEAR_NIGHT
                 */

                private String datetime;
                private String value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class PressureDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * value : 100156.2269696001
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class VisibilityDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * value : 8.9
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class DswrfDTO {
                /**
                 * datetime : 2020-11-16T20:00+08:00
                 * value : 88.7744256
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }
        }
    }
}
