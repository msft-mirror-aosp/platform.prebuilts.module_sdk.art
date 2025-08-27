#pragma once




#ifndef COM_ANDROID_LIBCORE
#define COM_ANDROID_LIBCORE(FLAG) COM_ANDROID_LIBCORE_##FLAG
#endif

#ifndef COM_ANDROID_LIBCORE_APPINFO
#define COM_ANDROID_LIBCORE_APPINFO true
#endif
#ifndef COM_ANDROID_LIBCORE_HPKE_PUBLIC_API
#define COM_ANDROID_LIBCORE_HPKE_PUBLIC_API false
#endif
#ifndef COM_ANDROID_LIBCORE_HPKE_V_APIS
#define COM_ANDROID_LIBCORE_HPKE_V_APIS true
#endif
#ifndef COM_ANDROID_LIBCORE_MADVISE_API
#define COM_ANDROID_LIBCORE_MADVISE_API false
#endif
#ifndef COM_ANDROID_LIBCORE_NATIVE_METRICS
#define COM_ANDROID_LIBCORE_NATIVE_METRICS true
#endif
#ifndef COM_ANDROID_LIBCORE_NETWORK_SECURITY_POLICY_REASON_CT_ENABLED_API
#define COM_ANDROID_LIBCORE_NETWORK_SECURITY_POLICY_REASON_CT_ENABLED_API false
#endif
#ifndef COM_ANDROID_LIBCORE_NICENESS_APIS
#define COM_ANDROID_LIBCORE_NICENESS_APIS true
#endif
#ifndef COM_ANDROID_LIBCORE_OPENJDK21_STRINGCONCAT
#define COM_ANDROID_LIBCORE_OPENJDK21_STRINGCONCAT true
#endif
#ifndef COM_ANDROID_LIBCORE_OPENJDK_21_V1_APIS
#define COM_ANDROID_LIBCORE_OPENJDK_21_V1_APIS true
#endif
#ifndef COM_ANDROID_LIBCORE_OPENJDK_21_V2_APIS
#define COM_ANDROID_LIBCORE_OPENJDK_21_V2_APIS true
#endif
#ifndef COM_ANDROID_LIBCORE_OPENJDK_25_V1_APIS
#define COM_ANDROID_LIBCORE_OPENJDK_25_V1_APIS false
#endif
#ifndef COM_ANDROID_LIBCORE_POST_CLEANUP_APIS
#define COM_ANDROID_LIBCORE_POST_CLEANUP_APIS true
#endif
#ifndef COM_ANDROID_LIBCORE_READ_ONLY_DYNAMIC_CODE_LOAD
#define COM_ANDROID_LIBCORE_READ_ONLY_DYNAMIC_CODE_LOAD true
#endif
#ifndef COM_ANDROID_LIBCORE_SCHEDULE_AT_FIXED_RATE_NEW_BEHAVIOR
#define COM_ANDROID_LIBCORE_SCHEDULE_AT_FIXED_RATE_NEW_BEHAVIOR true
#endif
#ifndef COM_ANDROID_LIBCORE_V_APIS
#define COM_ANDROID_LIBCORE_V_APIS true
#endif
#ifndef COM_ANDROID_LIBCORE_VIRTUAL_THREAD_API_V1
#define COM_ANDROID_LIBCORE_VIRTUAL_THREAD_API_V1 false
#endif

#ifdef __cplusplus

#include <memory>

namespace com::android::libcore {

class flag_provider_interface {
public:
    virtual ~flag_provider_interface() = default;
    virtual bool appinfo() = 0;
    virtual bool hpke_public_api() = 0;
    virtual bool hpke_v_apis() = 0;
    virtual bool madvise_api() = 0;
    virtual bool native_metrics() = 0;
    virtual bool network_security_policy_reason_ct_enabled_api() = 0;
    virtual bool niceness_apis() = 0;
    virtual bool openjdk21_stringconcat() = 0;
    virtual bool openjdk_21_v1_apis() = 0;
    virtual bool openjdk_21_v2_apis() = 0;
    virtual bool openjdk_25_v1_apis() = 0;
    virtual bool post_cleanup_apis() = 0;
    virtual bool read_only_dynamic_code_load() = 0;
    virtual bool schedule_at_fixed_rate_new_behavior() = 0;
    virtual bool v_apis() = 0;
    virtual bool virtual_thread_api_v1() = 0;
};

 extern std::unique_ptr<flag_provider_interface> provider_;


constexpr inline bool appinfo() {
    return COM_ANDROID_LIBCORE_APPINFO;
}
constexpr inline bool hpke_public_api() {
    return COM_ANDROID_LIBCORE_HPKE_PUBLIC_API;
}
constexpr inline bool hpke_v_apis() {
    return COM_ANDROID_LIBCORE_HPKE_V_APIS;
}
constexpr inline bool madvise_api() {
    return COM_ANDROID_LIBCORE_MADVISE_API;
}
constexpr inline bool native_metrics() {
    return COM_ANDROID_LIBCORE_NATIVE_METRICS;
}
constexpr inline bool network_security_policy_reason_ct_enabled_api() {
    return COM_ANDROID_LIBCORE_NETWORK_SECURITY_POLICY_REASON_CT_ENABLED_API;
}
constexpr inline bool niceness_apis() {
    return COM_ANDROID_LIBCORE_NICENESS_APIS;
}
constexpr inline bool openjdk21_stringconcat() {
    return COM_ANDROID_LIBCORE_OPENJDK21_STRINGCONCAT;
}
constexpr inline bool openjdk_21_v1_apis() {
    return COM_ANDROID_LIBCORE_OPENJDK_21_V1_APIS;
}
constexpr inline bool openjdk_21_v2_apis() {
    return COM_ANDROID_LIBCORE_OPENJDK_21_V2_APIS;
}
constexpr inline bool openjdk_25_v1_apis() {
    return COM_ANDROID_LIBCORE_OPENJDK_25_V1_APIS;
}
constexpr inline bool post_cleanup_apis() {
    return COM_ANDROID_LIBCORE_POST_CLEANUP_APIS;
}
constexpr inline bool read_only_dynamic_code_load() {
    return COM_ANDROID_LIBCORE_READ_ONLY_DYNAMIC_CODE_LOAD;
}
constexpr inline bool schedule_at_fixed_rate_new_behavior() {
    return COM_ANDROID_LIBCORE_SCHEDULE_AT_FIXED_RATE_NEW_BEHAVIOR;
}
constexpr inline bool v_apis() {
    return COM_ANDROID_LIBCORE_V_APIS;
}
constexpr inline bool virtual_thread_api_v1() {
    return COM_ANDROID_LIBCORE_VIRTUAL_THREAD_API_V1;
}

}

extern "C" {
#endif // __cplusplus


bool com_android_libcore_appinfo();
bool com_android_libcore_hpke_public_api();
bool com_android_libcore_hpke_v_apis();
bool com_android_libcore_madvise_api();
bool com_android_libcore_native_metrics();
bool com_android_libcore_network_security_policy_reason_ct_enabled_api();
bool com_android_libcore_niceness_apis();
bool com_android_libcore_openjdk21_stringconcat();
bool com_android_libcore_openjdk_21_v1_apis();
bool com_android_libcore_openjdk_21_v2_apis();
bool com_android_libcore_openjdk_25_v1_apis();
bool com_android_libcore_post_cleanup_apis();
bool com_android_libcore_read_only_dynamic_code_load();
bool com_android_libcore_schedule_at_fixed_rate_new_behavior();
bool com_android_libcore_v_apis();
bool com_android_libcore_virtual_thread_api_v1();

#ifdef __cplusplus
} // extern "C"
#endif

