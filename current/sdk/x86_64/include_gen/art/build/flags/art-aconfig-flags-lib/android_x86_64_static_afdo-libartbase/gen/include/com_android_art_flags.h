#pragma once

#ifndef COM_ANDROID_ART_FLAGS
#define COM_ANDROID_ART_FLAGS(FLAG) COM_ANDROID_ART_FLAGS_##FLAG
#endif

#ifndef COM_ANDROID_ART_FLAGS_ALWAYS_ENABLE_PROFILE_CODE
#define COM_ANDROID_ART_FLAGS_ALWAYS_ENABLE_PROFILE_CODE false
#endif
#ifndef COM_ANDROID_ART_FLAGS_ART_SERVICE_V3
#define COM_ANDROID_ART_FLAGS_ART_SERVICE_V3 true
#endif
#ifndef COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS
#define COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS true
#endif
#ifndef COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER
#define COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER false
#endif
#ifndef COM_ANDROID_ART_FLAGS_TEST
#define COM_ANDROID_ART_FLAGS_TEST true
#endif
#ifndef COM_ANDROID_ART_FLAGS_USE_GENERATIONAL_CMC
#define COM_ANDROID_ART_FLAGS_USE_GENERATIONAL_CMC false
#endif
#ifndef COM_ANDROID_ART_FLAGS_VIRTUAL_THREAD_IMPL_V1
#define COM_ANDROID_ART_FLAGS_VIRTUAL_THREAD_IMPL_V1 false
#endif

#ifdef __cplusplus

#include <memory>

namespace com::android::art::flags {

class flag_provider_interface {
public:
    virtual ~flag_provider_interface() = default;
    virtual bool always_enable_profile_code() = 0;
    virtual bool art_service_v3() = 0;
    virtual bool executable_method_file_offsets() = 0;
    virtual bool fast_baseline_compiler() = 0;
    virtual bool test() = 0;
    virtual bool use_generational_cmc() = 0;
    virtual bool virtual_thread_impl_v1() = 0;
};

extern std::unique_ptr<flag_provider_interface> provider_;


constexpr inline bool always_enable_profile_code() {
    return COM_ANDROID_ART_FLAGS_ALWAYS_ENABLE_PROFILE_CODE;
}
constexpr inline bool art_service_v3() {
    return COM_ANDROID_ART_FLAGS_ART_SERVICE_V3;
}
constexpr inline bool executable_method_file_offsets() {
    return COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS;
}
constexpr inline bool fast_baseline_compiler() {
    return COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER;
}
constexpr inline bool test() {
    return COM_ANDROID_ART_FLAGS_TEST;
}
constexpr inline bool use_generational_cmc() {
    return COM_ANDROID_ART_FLAGS_USE_GENERATIONAL_CMC;
}
constexpr inline bool virtual_thread_impl_v1() {
    return COM_ANDROID_ART_FLAGS_VIRTUAL_THREAD_IMPL_V1;
}

}

extern "C" {
#endif // __cplusplus


bool com_android_art_flags_always_enable_profile_code();
bool com_android_art_flags_art_service_v3();
bool com_android_art_flags_executable_method_file_offsets();
bool com_android_art_flags_fast_baseline_compiler();
bool com_android_art_flags_test();
bool com_android_art_flags_use_generational_cmc();
bool com_android_art_flags_virtual_thread_impl_v1();

#ifdef __cplusplus
} // extern "C"
#endif

