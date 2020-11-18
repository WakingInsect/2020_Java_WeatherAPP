package a.weather.network.weather;

import java.util.List;

public class DailyData {

    /**
     * status : ok
     * api_version : v2.5
     * api_status : active
     * lang : zh_CN
     * unit : metric
     * tzshift : 28800
     * timezone : Asia/Taipei
     * server_time : 1605528321
     * location : [25.1552,121.6544]
     * result : {"daily":{"status":"ok","astro":[{"date":"2020-11-16T00:00+08:00","sunrise":{"time":"06:11"},"sunset":{"time":"17:05"}},{"date":"2020-11-17T00:00+08:00","sunrise":{"time":"06:11"},"sunset":{"time":"17:05"}},{"date":"2020-11-18T00:00+08:00","sunrise":{"time":"06:12"},"sunset":{"time":"17:04"}},{"date":"2020-11-19T00:00+08:00","sunrise":{"time":"06:13"},"sunset":{"time":"17:04"}},{"date":"2020-11-20T00:00+08:00","sunrise":{"time":"06:13"},"sunset":{"time":"17:04"}}],"precipitation":[{"date":"2020-11-16T00:00+08:00","max":0.4459,"min":0,"avg":0},{"date":"2020-11-17T00:00+08:00","max":1.7633,"min":0,"avg":0.2505},{"date":"2020-11-18T00:00+08:00","max":0,"min":0,"avg":0},{"date":"2020-11-19T00:00+08:00","max":0,"min":0,"avg":0},{"date":"2020-11-20T00:00+08:00","max":0.3078,"min":0,"avg":0.0128}],"temperature":[{"date":"2020-11-16T00:00+08:00","max":26,"min":20.16,"avg":21.54},{"date":"2020-11-17T00:00+08:00","max":25,"min":22,"avg":23.49},{"date":"2020-11-18T00:00+08:00","max":26,"min":21,"avg":23.3},{"date":"2020-11-19T00:00+08:00","max":26,"min":22,"avg":23.95},{"date":"2020-11-20T00:00+08:00","max":25,"min":22,"avg":23.78}],"wind":[{"date":"2020-11-16T00:00+08:00","max":{"speed":24.12,"direction":45},"min":{"speed":13.2,"direction":101.36},"avg":{"speed":19.69,"direction":89.28}},{"date":"2020-11-17T00:00+08:00","max":{"speed":27.04,"direction":108.53},"min":{"speed":23.24,"direction":104.16},"avg":{"speed":24.8,"direction":110.55}},{"date":"2020-11-18T00:00+08:00","max":{"speed":21.97,"direction":135.42},"min":{"speed":7.36,"direction":170.17},"avg":{"speed":13.66,"direction":139.77}},{"date":"2020-11-19T00:00+08:00","max":{"speed":6.67,"direction":165.78},"min":{"speed":2.14,"direction":119.46},"avg":{"speed":3.94,"direction":148.34}},{"date":"2020-11-20T00:00+08:00","max":{"speed":19.99,"direction":73.04},"min":{"speed":3.51,"direction":240.73},"avg":{"speed":7.1,"direction":33.86}}],"humidity":[{"date":"2020-11-16T00:00+08:00","max":0.91,"min":0.81,"avg":0.87},{"date":"2020-11-17T00:00+08:00","max":0.88,"min":0.8,"avg":0.85},{"date":"2020-11-18T00:00+08:00","max":0.88,"min":0.7,"avg":0.82},{"date":"2020-11-19T00:00+08:00","max":0.87,"min":0.68,"avg":0.8},{"date":"2020-11-20T00:00+08:00","max":0.91,"min":0.73,"avg":0.81}],"cloudrate":[{"date":"2020-11-16T00:00+08:00","max":0.87,"min":0,"avg":0.34},{"date":"2020-11-17T00:00+08:00","max":1,"min":0.62,"avg":0.86},{"date":"2020-11-18T00:00+08:00","max":0.72,"min":0,"avg":0.16},{"date":"2020-11-19T00:00+08:00","max":0.11,"min":0,"avg":0.02},{"date":"2020-11-20T00:00+08:00","max":0.28,"min":0,"avg":0.07}],"pressure":[{"date":"2020-11-16T00:00+08:00","max":100285.89,"min":99996.23,"avg":100188.66},{"date":"2020-11-17T00:00+08:00","max":100106.9,"min":99786.9,"avg":99945.31},{"date":"2020-11-18T00:00+08:00","max":99847.83,"min":99485.55,"avg":99684.46},{"date":"2020-11-19T00:00+08:00","max":99756.23,"min":99436.23,"avg":99594.41},{"date":"2020-11-20T00:00+08:00","max":99897.49,"min":99565.55,"avg":99719.69}],"visibility":[{"date":"2020-11-16T00:00+08:00","max":24.13,"min":8.9,"avg":9.07},{"date":"2020-11-17T00:00+08:00","max":9.43,"min":4.01,"avg":5.67},{"date":"2020-11-18T00:00+08:00","max":13.29,"min":8.92,"avg":10.89},{"date":"2020-11-19T00:00+08:00","max":33.54,"min":12.25,"avg":18.95},{"date":"2020-11-20T00:00+08:00","max":25.57,"min":10.75,"avg":16.98}],"dswrf":[{"date":"2020-11-16T00:00+08:00","max":560.6,"min":0,"avg":22.2},{"date":"2020-11-17T00:00+08:00","max":481.4,"min":0,"avg":150.8},{"date":"2020-11-18T00:00+08:00","max":610,"min":0,"avg":199.2},{"date":"2020-11-19T00:00+08:00","max":610,"min":0,"avg":201.6},{"date":"2020-11-20T00:00+08:00","max":598,"min":0,"avg":190}],"air_quality":{"aqi":[{"date":"2020-11-16T00:00+08:00","max":{"chn":18,"usa":18},"avg":{"chn":12.75,"usa":12.75},"min":{"chn":12,"usa":12}},{"date":"2020-11-17T00:00+08:00","max":{"chn":14,"usa":14},"avg":{"chn":10.79,"usa":10.79},"min":{"chn":8,"usa":8}},{"date":"2020-11-18T00:00+08:00","max":{"chn":17,"usa":17},"avg":{"chn":11.33,"usa":11.33},"min":{"chn":9,"usa":9}},{"date":"2020-11-19T00:00+08:00","max":{"chn":20,"usa":20},"avg":{"chn":15.04,"usa":15.04},"min":{"chn":12,"usa":12}},{"date":"2020-11-20T00:00+08:00","max":{"chn":21,"usa":21},"avg":{"chn":16.54,"usa":16.54},"min":{"chn":13,"usa":13}}],"pm25":[{"date":"2020-11-16T00:00+08:00","max":10,"avg":9.75,"min":7},{"date":"2020-11-17T00:00+08:00","max":10,"avg":8.08,"min":6},{"date":"2020-11-18T00:00+08:00","max":12,"avg":8.33,"min":7},{"date":"2020-11-19T00:00+08:00","max":14,"avg":11.17,"min":9},{"date":"2020-11-20T00:00+08:00","max":15,"avg":12.38,"min":10}]},"skycon":[{"date":"2020-11-16T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-11-17T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-20T00:00+08:00","value":"CLEAR_DAY"}],"skycon_08h_20h":[{"date":"2020-11-16T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-17T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-20T00:00+08:00","value":"CLEAR_DAY"}],"skycon_20h_32h":[{"date":"2020-11-16T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-17T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_NIGHT"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_NIGHT"},{"date":"2020-11-20T00:00+08:00","value":"LIGHT_RAIN"}],"life_index":{"ultraviolet":[{"date":"2020-11-16T00:00+08:00","index":"2","desc":"弱"},{"date":"2020-11-17T00:00+08:00","index":"2","desc":"弱"},{"date":"2020-11-18T00:00+08:00","index":"5","desc":"很强"},{"date":"2020-11-19T00:00+08:00","index":"5","desc":"很强"},{"date":"2020-11-20T00:00+08:00","index":"5","desc":"很强"}],"carWashing":[{"date":"2020-11-16T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-18T00:00+08:00","index":"1","desc":"适宜"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"较不适宜"}],"dressing":[{"date":"2020-11-16T00:00+08:00","index":"5","desc":"凉爽"},{"date":"2020-11-17T00:00+08:00","index":"4","desc":"温暖"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"热"}],"comfort":[{"date":"2020-11-16T00:00+08:00","index":"4","desc":"温暖"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"热"}],"coldRisk":[{"date":"2020-11-16T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"易发"}]}},"primary":0}
     */

    private String status;
    private String api_version;
    private String api_status;
    private String lang;
    private String unit;
    private double tzshift;
    private String timezone;
    private double server_time;
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

    public double getTzshift() {
        return tzshift;
    }

    public void setTzshift(double tzshift) {
        this.tzshift = tzshift;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public double getServer_time() {
        return server_time;
    }

    public void setServer_time(double server_time) {
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
         * daily : {"status":"ok","astro":[{"date":"2020-11-16T00:00+08:00","sunrise":{"time":"06:11"},"sunset":{"time":"17:05"}},{"date":"2020-11-17T00:00+08:00","sunrise":{"time":"06:11"},"sunset":{"time":"17:05"}},{"date":"2020-11-18T00:00+08:00","sunrise":{"time":"06:12"},"sunset":{"time":"17:04"}},{"date":"2020-11-19T00:00+08:00","sunrise":{"time":"06:13"},"sunset":{"time":"17:04"}},{"date":"2020-11-20T00:00+08:00","sunrise":{"time":"06:13"},"sunset":{"time":"17:04"}}],"precipitation":[{"date":"2020-11-16T00:00+08:00","max":0.4459,"min":0,"avg":0},{"date":"2020-11-17T00:00+08:00","max":1.7633,"min":0,"avg":0.2505},{"date":"2020-11-18T00:00+08:00","max":0,"min":0,"avg":0},{"date":"2020-11-19T00:00+08:00","max":0,"min":0,"avg":0},{"date":"2020-11-20T00:00+08:00","max":0.3078,"min":0,"avg":0.0128}],"temperature":[{"date":"2020-11-16T00:00+08:00","max":26,"min":20.16,"avg":21.54},{"date":"2020-11-17T00:00+08:00","max":25,"min":22,"avg":23.49},{"date":"2020-11-18T00:00+08:00","max":26,"min":21,"avg":23.3},{"date":"2020-11-19T00:00+08:00","max":26,"min":22,"avg":23.95},{"date":"2020-11-20T00:00+08:00","max":25,"min":22,"avg":23.78}],"wind":[{"date":"2020-11-16T00:00+08:00","max":{"speed":24.12,"direction":45},"min":{"speed":13.2,"direction":101.36},"avg":{"speed":19.69,"direction":89.28}},{"date":"2020-11-17T00:00+08:00","max":{"speed":27.04,"direction":108.53},"min":{"speed":23.24,"direction":104.16},"avg":{"speed":24.8,"direction":110.55}},{"date":"2020-11-18T00:00+08:00","max":{"speed":21.97,"direction":135.42},"min":{"speed":7.36,"direction":170.17},"avg":{"speed":13.66,"direction":139.77}},{"date":"2020-11-19T00:00+08:00","max":{"speed":6.67,"direction":165.78},"min":{"speed":2.14,"direction":119.46},"avg":{"speed":3.94,"direction":148.34}},{"date":"2020-11-20T00:00+08:00","max":{"speed":19.99,"direction":73.04},"min":{"speed":3.51,"direction":240.73},"avg":{"speed":7.1,"direction":33.86}}],"humidity":[{"date":"2020-11-16T00:00+08:00","max":0.91,"min":0.81,"avg":0.87},{"date":"2020-11-17T00:00+08:00","max":0.88,"min":0.8,"avg":0.85},{"date":"2020-11-18T00:00+08:00","max":0.88,"min":0.7,"avg":0.82},{"date":"2020-11-19T00:00+08:00","max":0.87,"min":0.68,"avg":0.8},{"date":"2020-11-20T00:00+08:00","max":0.91,"min":0.73,"avg":0.81}],"cloudrate":[{"date":"2020-11-16T00:00+08:00","max":0.87,"min":0,"avg":0.34},{"date":"2020-11-17T00:00+08:00","max":1,"min":0.62,"avg":0.86},{"date":"2020-11-18T00:00+08:00","max":0.72,"min":0,"avg":0.16},{"date":"2020-11-19T00:00+08:00","max":0.11,"min":0,"avg":0.02},{"date":"2020-11-20T00:00+08:00","max":0.28,"min":0,"avg":0.07}],"pressure":[{"date":"2020-11-16T00:00+08:00","max":100285.89,"min":99996.23,"avg":100188.66},{"date":"2020-11-17T00:00+08:00","max":100106.9,"min":99786.9,"avg":99945.31},{"date":"2020-11-18T00:00+08:00","max":99847.83,"min":99485.55,"avg":99684.46},{"date":"2020-11-19T00:00+08:00","max":99756.23,"min":99436.23,"avg":99594.41},{"date":"2020-11-20T00:00+08:00","max":99897.49,"min":99565.55,"avg":99719.69}],"visibility":[{"date":"2020-11-16T00:00+08:00","max":24.13,"min":8.9,"avg":9.07},{"date":"2020-11-17T00:00+08:00","max":9.43,"min":4.01,"avg":5.67},{"date":"2020-11-18T00:00+08:00","max":13.29,"min":8.92,"avg":10.89},{"date":"2020-11-19T00:00+08:00","max":33.54,"min":12.25,"avg":18.95},{"date":"2020-11-20T00:00+08:00","max":25.57,"min":10.75,"avg":16.98}],"dswrf":[{"date":"2020-11-16T00:00+08:00","max":560.6,"min":0,"avg":22.2},{"date":"2020-11-17T00:00+08:00","max":481.4,"min":0,"avg":150.8},{"date":"2020-11-18T00:00+08:00","max":610,"min":0,"avg":199.2},{"date":"2020-11-19T00:00+08:00","max":610,"min":0,"avg":201.6},{"date":"2020-11-20T00:00+08:00","max":598,"min":0,"avg":190}],"air_quality":{"aqi":[{"date":"2020-11-16T00:00+08:00","max":{"chn":18,"usa":18},"avg":{"chn":12.75,"usa":12.75},"min":{"chn":12,"usa":12}},{"date":"2020-11-17T00:00+08:00","max":{"chn":14,"usa":14},"avg":{"chn":10.79,"usa":10.79},"min":{"chn":8,"usa":8}},{"date":"2020-11-18T00:00+08:00","max":{"chn":17,"usa":17},"avg":{"chn":11.33,"usa":11.33},"min":{"chn":9,"usa":9}},{"date":"2020-11-19T00:00+08:00","max":{"chn":20,"usa":20},"avg":{"chn":15.04,"usa":15.04},"min":{"chn":12,"usa":12}},{"date":"2020-11-20T00:00+08:00","max":{"chn":21,"usa":21},"avg":{"chn":16.54,"usa":16.54},"min":{"chn":13,"usa":13}}],"pm25":[{"date":"2020-11-16T00:00+08:00","max":10,"avg":9.75,"min":7},{"date":"2020-11-17T00:00+08:00","max":10,"avg":8.08,"min":6},{"date":"2020-11-18T00:00+08:00","max":12,"avg":8.33,"min":7},{"date":"2020-11-19T00:00+08:00","max":14,"avg":11.17,"min":9},{"date":"2020-11-20T00:00+08:00","max":15,"avg":12.38,"min":10}]},"skycon":[{"date":"2020-11-16T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-11-17T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-20T00:00+08:00","value":"CLEAR_DAY"}],"skycon_08h_20h":[{"date":"2020-11-16T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-17T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-20T00:00+08:00","value":"CLEAR_DAY"}],"skycon_20h_32h":[{"date":"2020-11-16T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-17T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_NIGHT"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_NIGHT"},{"date":"2020-11-20T00:00+08:00","value":"LIGHT_RAIN"}],"life_index":{"ultraviolet":[{"date":"2020-11-16T00:00+08:00","index":"2","desc":"弱"},{"date":"2020-11-17T00:00+08:00","index":"2","desc":"弱"},{"date":"2020-11-18T00:00+08:00","index":"5","desc":"很强"},{"date":"2020-11-19T00:00+08:00","index":"5","desc":"很强"},{"date":"2020-11-20T00:00+08:00","index":"5","desc":"很强"}],"carWashing":[{"date":"2020-11-16T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-18T00:00+08:00","index":"1","desc":"适宜"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"较不适宜"}],"dressing":[{"date":"2020-11-16T00:00+08:00","index":"5","desc":"凉爽"},{"date":"2020-11-17T00:00+08:00","index":"4","desc":"温暖"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"热"}],"comfort":[{"date":"2020-11-16T00:00+08:00","index":"4","desc":"温暖"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"热"}],"coldRisk":[{"date":"2020-11-16T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"易发"}]}}
         * primary : 0
         */

        private DailyDTO daily;
//        private double primary;

        public DailyDTO getDaily() {
            return daily;
        }

        public void setDaily(DailyDTO daily) {
            this.daily = daily;
        }

//        public double getPrimary() {
//            return primary;
//        }
//
//        public void setPrimary(double primary) {
//            this.primary = primary;
//        }

        public static class DailyDTO {
            /**
             * status : ok
             * astro : [{"date":"2020-11-16T00:00+08:00","sunrise":{"time":"06:11"},"sunset":{"time":"17:05"}},{"date":"2020-11-17T00:00+08:00","sunrise":{"time":"06:11"},"sunset":{"time":"17:05"}},{"date":"2020-11-18T00:00+08:00","sunrise":{"time":"06:12"},"sunset":{"time":"17:04"}},{"date":"2020-11-19T00:00+08:00","sunrise":{"time":"06:13"},"sunset":{"time":"17:04"}},{"date":"2020-11-20T00:00+08:00","sunrise":{"time":"06:13"},"sunset":{"time":"17:04"}}]
             * precipitation : [{"date":"2020-11-16T00:00+08:00","max":0.4459,"min":0,"avg":0},{"date":"2020-11-17T00:00+08:00","max":1.7633,"min":0,"avg":0.2505},{"date":"2020-11-18T00:00+08:00","max":0,"min":0,"avg":0},{"date":"2020-11-19T00:00+08:00","max":0,"min":0,"avg":0},{"date":"2020-11-20T00:00+08:00","max":0.3078,"min":0,"avg":0.0128}]
             * temperature : [{"date":"2020-11-16T00:00+08:00","max":26,"min":20.16,"avg":21.54},{"date":"2020-11-17T00:00+08:00","max":25,"min":22,"avg":23.49},{"date":"2020-11-18T00:00+08:00","max":26,"min":21,"avg":23.3},{"date":"2020-11-19T00:00+08:00","max":26,"min":22,"avg":23.95},{"date":"2020-11-20T00:00+08:00","max":25,"min":22,"avg":23.78}]
             * wind : [{"date":"2020-11-16T00:00+08:00","max":{"speed":24.12,"direction":45},"min":{"speed":13.2,"direction":101.36},"avg":{"speed":19.69,"direction":89.28}},{"date":"2020-11-17T00:00+08:00","max":{"speed":27.04,"direction":108.53},"min":{"speed":23.24,"direction":104.16},"avg":{"speed":24.8,"direction":110.55}},{"date":"2020-11-18T00:00+08:00","max":{"speed":21.97,"direction":135.42},"min":{"speed":7.36,"direction":170.17},"avg":{"speed":13.66,"direction":139.77}},{"date":"2020-11-19T00:00+08:00","max":{"speed":6.67,"direction":165.78},"min":{"speed":2.14,"direction":119.46},"avg":{"speed":3.94,"direction":148.34}},{"date":"2020-11-20T00:00+08:00","max":{"speed":19.99,"direction":73.04},"min":{"speed":3.51,"direction":240.73},"avg":{"speed":7.1,"direction":33.86}}]
             * humidity : [{"date":"2020-11-16T00:00+08:00","max":0.91,"min":0.81,"avg":0.87},{"date":"2020-11-17T00:00+08:00","max":0.88,"min":0.8,"avg":0.85},{"date":"2020-11-18T00:00+08:00","max":0.88,"min":0.7,"avg":0.82},{"date":"2020-11-19T00:00+08:00","max":0.87,"min":0.68,"avg":0.8},{"date":"2020-11-20T00:00+08:00","max":0.91,"min":0.73,"avg":0.81}]
             * cloudrate : [{"date":"2020-11-16T00:00+08:00","max":0.87,"min":0,"avg":0.34},{"date":"2020-11-17T00:00+08:00","max":1,"min":0.62,"avg":0.86},{"date":"2020-11-18T00:00+08:00","max":0.72,"min":0,"avg":0.16},{"date":"2020-11-19T00:00+08:00","max":0.11,"min":0,"avg":0.02},{"date":"2020-11-20T00:00+08:00","max":0.28,"min":0,"avg":0.07}]
             * pressure : [{"date":"2020-11-16T00:00+08:00","max":100285.89,"min":99996.23,"avg":100188.66},{"date":"2020-11-17T00:00+08:00","max":100106.9,"min":99786.9,"avg":99945.31},{"date":"2020-11-18T00:00+08:00","max":99847.83,"min":99485.55,"avg":99684.46},{"date":"2020-11-19T00:00+08:00","max":99756.23,"min":99436.23,"avg":99594.41},{"date":"2020-11-20T00:00+08:00","max":99897.49,"min":99565.55,"avg":99719.69}]
             * visibility : [{"date":"2020-11-16T00:00+08:00","max":24.13,"min":8.9,"avg":9.07},{"date":"2020-11-17T00:00+08:00","max":9.43,"min":4.01,"avg":5.67},{"date":"2020-11-18T00:00+08:00","max":13.29,"min":8.92,"avg":10.89},{"date":"2020-11-19T00:00+08:00","max":33.54,"min":12.25,"avg":18.95},{"date":"2020-11-20T00:00+08:00","max":25.57,"min":10.75,"avg":16.98}]
             * dswrf : [{"date":"2020-11-16T00:00+08:00","max":560.6,"min":0,"avg":22.2},{"date":"2020-11-17T00:00+08:00","max":481.4,"min":0,"avg":150.8},{"date":"2020-11-18T00:00+08:00","max":610,"min":0,"avg":199.2},{"date":"2020-11-19T00:00+08:00","max":610,"min":0,"avg":201.6},{"date":"2020-11-20T00:00+08:00","max":598,"min":0,"avg":190}]
             * air_quality : {"aqi":[{"date":"2020-11-16T00:00+08:00","max":{"chn":18,"usa":18},"avg":{"chn":12.75,"usa":12.75},"min":{"chn":12,"usa":12}},{"date":"2020-11-17T00:00+08:00","max":{"chn":14,"usa":14},"avg":{"chn":10.79,"usa":10.79},"min":{"chn":8,"usa":8}},{"date":"2020-11-18T00:00+08:00","max":{"chn":17,"usa":17},"avg":{"chn":11.33,"usa":11.33},"min":{"chn":9,"usa":9}},{"date":"2020-11-19T00:00+08:00","max":{"chn":20,"usa":20},"avg":{"chn":15.04,"usa":15.04},"min":{"chn":12,"usa":12}},{"date":"2020-11-20T00:00+08:00","max":{"chn":21,"usa":21},"avg":{"chn":16.54,"usa":16.54},"min":{"chn":13,"usa":13}}],"pm25":[{"date":"2020-11-16T00:00+08:00","max":10,"avg":9.75,"min":7},{"date":"2020-11-17T00:00+08:00","max":10,"avg":8.08,"min":6},{"date":"2020-11-18T00:00+08:00","max":12,"avg":8.33,"min":7},{"date":"2020-11-19T00:00+08:00","max":14,"avg":11.17,"min":9},{"date":"2020-11-20T00:00+08:00","max":15,"avg":12.38,"min":10}]}
             * skycon : [{"date":"2020-11-16T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-11-17T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-20T00:00+08:00","value":"CLEAR_DAY"}]
             * skycon_08h_20h : [{"date":"2020-11-16T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-17T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_DAY"},{"date":"2020-11-20T00:00+08:00","value":"CLEAR_DAY"}]
             * skycon_20h_32h : [{"date":"2020-11-16T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-11-17T00:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2020-11-18T00:00+08:00","value":"CLEAR_NIGHT"},{"date":"2020-11-19T00:00+08:00","value":"CLEAR_NIGHT"},{"date":"2020-11-20T00:00+08:00","value":"LIGHT_RAIN"}]
             * life_index : {"ultraviolet":[{"date":"2020-11-16T00:00+08:00","index":"2","desc":"弱"},{"date":"2020-11-17T00:00+08:00","index":"2","desc":"弱"},{"date":"2020-11-18T00:00+08:00","index":"5","desc":"很强"},{"date":"2020-11-19T00:00+08:00","index":"5","desc":"很强"},{"date":"2020-11-20T00:00+08:00","index":"5","desc":"很强"}],"carWashing":[{"date":"2020-11-16T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-18T00:00+08:00","index":"1","desc":"适宜"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"较不适宜"}],"dressing":[{"date":"2020-11-16T00:00+08:00","index":"5","desc":"凉爽"},{"date":"2020-11-17T00:00+08:00","index":"4","desc":"温暖"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"热"}],"comfort":[{"date":"2020-11-16T00:00+08:00","index":"4","desc":"温暖"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"热"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"热"}],"coldRisk":[{"date":"2020-11-16T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-17T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-18T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-19T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-11-20T00:00+08:00","index":"3","desc":"易发"}]}
             */

//            private String status;
            private AirQualityDTO air_quality;
            private LifeIndexDTO life_index;
            private List<AstroDTO> astro;
            private List<PrecipitationDTO> precipitation;
            private List<TemperatureDTO> temperature;
            private List<WindDTO> wind;
            private List<HumidityDTO> humidity;
            private List<CloudrateDTO> cloudrate;
            private List<PressureDTO> pressure;
//            private List<VisibilityDTO> visibility;
            private List<DswrfDTO> dswrf;
            private List<SkyconDTO> skycon;
            private List<Skycon08h20hDTO> skycon_08h_20h;
            private List<Skycon20h32hDTO> skycon_20h_32h;

//            public String getStatus() {
//                return status;
//            }
//
//            public void setStatus(String status) {
//                this.status = status;
//            }

            public AirQualityDTO getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityDTO air_quality) {
                this.air_quality = air_quality;
            }

            public LifeIndexDTO getLife_index() {
                return life_index;
            }

            public void setLife_index(LifeIndexDTO life_index) {
                this.life_index = life_index;
            }

            public List<AstroDTO> getAstro() {
                return astro;
            }

            public void setAstro(List<AstroDTO> astro) {
                this.astro = astro;
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

            public List<PressureDTO> getPressure() {
                return pressure;
            }

            public void setPressure(List<PressureDTO> pressure) {
                this.pressure = pressure;
            }

//            public List<VisibilityDTO> getVisibility() {
//                return visibility;
//            }
//
//            public void setVisibility(List<VisibilityDTO> visibility) {
//                this.visibility = visibility;
//            }

            public List<DswrfDTO> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfDTO> dswrf) {
                this.dswrf = dswrf;
            }

            public List<SkyconDTO> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconDTO> skycon) {
                this.skycon = skycon;
            }

            public List<Skycon08h20hDTO> getSkycon_08h_20h() {
                return skycon_08h_20h;
            }

            public void setSkycon_08h_20h(List<Skycon08h20hDTO> skycon_08h_20h) {
                this.skycon_08h_20h = skycon_08h_20h;
            }

            public List<Skycon20h32hDTO> getSkycon_20h_32h() {
                return skycon_20h_32h;
            }

            public void setSkycon_20h_32h(List<Skycon20h32hDTO> skycon_20h_32h) {
                this.skycon_20h_32h = skycon_20h_32h;
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
                     * date : 2020-11-16T00:00+08:00
                     * max : {"chn":18,"usa":18}
                     * avg : {"chn":12.75,"usa":12.75}
                     * min : {"chn":12,"usa":12}
                     */

                    private String date;
                    private MaxDTO max;
                    private AvgDTO avg;
                    private MinDTO min;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public MaxDTO getMax() {
                        return max;
                    }

                    public void setMax(MaxDTO max) {
                        this.max = max;
                    }

                    public AvgDTO getAvg() {
                        return avg;
                    }

                    public void setAvg(AvgDTO avg) {
                        this.avg = avg;
                    }

                    public MinDTO getMin() {
                        return min;
                    }

                    public void setMin(MinDTO min) {
                        this.min = min;
                    }

                    public static class MaxDTO {
                        /**
                         * chn : 18
                         * usa : 18
                         */

                        private double chn;
                        private double usa;

                        public double getChn() {
                            return chn;
                        }

                        public void setChn(double chn) {
                            this.chn = chn;
                        }

                        public double getUsa() {
                            return usa;
                        }

                        public void setUsa(double usa) {
                            this.usa = usa;
                        }
                    }

                    public static class AvgDTO {
                        /**
                         * chn : 12.75
                         * usa : 12.75
                         */

                        private double chn;
                        private double usa;

                        public double getChn() {
                            return chn;
                        }

                        public void setChn(double chn) {
                            this.chn = chn;
                        }

                        public double getUsa() {
                            return usa;
                        }

                        public void setUsa(double usa) {
                            this.usa = usa;
                        }
                    }

                    public static class MinDTO {
                        /**
                         * chn : 12
                         * usa : 12
                         */

                        private double chn;
                        private double usa;

                        public double getChn() {
                            return chn;
                        }

                        public void setChn(double chn) {
                            this.chn = chn;
                        }

                        public double getUsa() {
                            return usa;
                        }

                        public void setUsa(double usa) {
                            this.usa = usa;
                        }
                    }
                }

                public static class Pm25DTO {
                    /**
                     * date : 2020-11-16T00:00+08:00
                     * max : 10
                     * avg : 9.75
                     * min : 7
                     */

                    private String date;
                    private double max;
                    private double avg;
                    private double min;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public double getMax() {
                        return max;
                    }

                    public void setMax(double max) {
                        this.max = max;
                    }

                    public double getAvg() {
                        return avg;
                    }

                    public void setAvg(double avg) {
                        this.avg = avg;
                    }

                    public double getMin() {
                        return min;
                    }

                    public void setMin(double min) {
                        this.min = min;
                    }
                }
            }

            public static class LifeIndexDTO {
                private List<UltravioletDTO> ultraviolet;
                private List<CarWashingDTO> carWashing;
                private List<DressingDTO> dressing;
                private List<ComfortDTO> comfort;
                private List<ColdRiskDTO> coldRisk;

                public List<UltravioletDTO> getUltraviolet() {
                    return ultraviolet;
                }

                public void setUltraviolet(List<UltravioletDTO> ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public List<CarWashingDTO> getCarWashing() {
                    return carWashing;
                }

                public void setCarWashing(List<CarWashingDTO> carWashing) {
                    this.carWashing = carWashing;
                }

                public List<DressingDTO> getDressing() {
                    return dressing;
                }

                public void setDressing(List<DressingDTO> dressing) {
                    this.dressing = dressing;
                }

                public List<ComfortDTO> getComfort() {
                    return comfort;
                }

                public void setComfort(List<ComfortDTO> comfort) {
                    this.comfort = comfort;
                }

                public List<ColdRiskDTO> getColdRisk() {
                    return coldRisk;
                }

                public void setColdRisk(List<ColdRiskDTO> coldRisk) {
                    this.coldRisk = coldRisk;
                }

                public static class UltravioletDTO {
                    /**
                     * date : 2020-11-16T00:00+08:00
                     * index : 2
                     * desc : 弱
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class CarWashingDTO {
                    /**
                     * date : 2020-11-16T00:00+08:00
                     * index : 3
                     * desc : 较不适宜
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class DressingDTO {
                    /**
                     * date : 2020-11-16T00:00+08:00
                     * index : 5
                     * desc : 凉爽
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class ComfortDTO {
                    /**
                     * date : 2020-11-16T00:00+08:00
                     * index : 4
                     * desc : 温暖
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class ColdRiskDTO {
                    /**
                     * date : 2020-11-16T00:00+08:00
                     * index : 3
                     * desc : 易发
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }
            }

            public static class AstroDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * sunrise : {"time":"06:11"}
                 * sunset : {"time":"17:05"}
                 */

                private String date;
                private SunriseDTO sunrise;
                private SunsetDTO sunset;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public SunriseDTO getSunrise() {
                    return sunrise;
                }

                public void setSunrise(SunriseDTO sunrise) {
                    this.sunrise = sunrise;
                }

                public SunsetDTO getSunset() {
                    return sunset;
                }

                public void setSunset(SunsetDTO sunset) {
                    this.sunset = sunset;
                }

                public static class SunriseDTO {
                    /**
                     * time : 06:11
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                public static class SunsetDTO {
                    /**
                     * time : 17:05
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }

            public static class PrecipitationDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * max : 0.4459
                 * min : 0
                 * avg : 0
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class TemperatureDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * max : 26
                 * min : 20.16
                 * avg : 21.54
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class WindDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * max : {"speed":24.12,"direction":45}
                 * min : {"speed":13.2,"direction":101.36}
                 * avg : {"speed":19.69,"direction":89.28}
                 */

                private String date;
                private MaxDTO max;
                private MinDTO min;
                private AvgDTO avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public MaxDTO getMax() {
                    return max;
                }

                public void setMax(MaxDTO max) {
                    this.max = max;
                }

                public MinDTO getMin() {
                    return min;
                }

                public void setMin(MinDTO min) {
                    this.min = min;
                }

                public AvgDTO getAvg() {
                    return avg;
                }

                public void setAvg(AvgDTO avg) {
                    this.avg = avg;
                }

                public static class MaxDTO {
                    /**
                     * speed : 24.12
                     * direction : 45
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }

                public static class MinDTO {
                    /**
                     * speed : 13.2
                     * direction : 101.36
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }

                public static class AvgDTO {
                    /**
                     * speed : 19.69
                     * direction : 89.28
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }
            }

            public static class HumidityDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * max : 0.91
                 * min : 0.81
                 * avg : 0.87
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class CloudrateDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * max : 0.87
                 * min : 0
                 * avg : 0.34
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class PressureDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * max : 100285.89
                 * min : 99996.23
                 * avg : 100188.66
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class VisibilityDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * max : 24.13
                 * min : 8.9
                 * avg : 9.07
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class DswrfDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * max : 560.6
                 * min : 0
                 * avg : 22.2
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class SkyconDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * value : PARTLY_CLOUDY_NIGHT
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class Skycon08h20hDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * value : LIGHT_RAIN
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class Skycon20h32hDTO {
                /**
                 * date : 2020-11-16T00:00+08:00
                 * value : LIGHT_RAIN
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }
}
