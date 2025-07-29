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
#ifndef COM_ANDROID_ART_FLAGS_DEXOPT_SECONDARY_ISA_ONLY_WHEN_NEEDED
#define COM_ANDROID_ART_FLAGS_DEXOPT_SECONDARY_ISA_ONLY_WHEN_NEEDED false
#endif
#ifndef COM_ANDROID_ART_FLAGS_ENFORCE_PERMITTED_SUBCLASSES_CHECKS
#define COM_ANDROID_ART_FLAGS_ENFORCE_PERMITTED_SUBCLASSES_CHECKS false
#endif
#ifndef COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS
#define COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS true
#endif
#ifndef COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_DEPRECATION
#define COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_DEPRECATION false
#endif
#ifndef COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_V2
#define COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_V2 false
#endif
#ifndef COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER
#define COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER false
#endif
#ifndef COM_ANDROID_ART_FLAGS_IGNORE_BOOT_IMAGE_EXTENSION_CLASS_RESOLUTION
#define COM_ANDROID_ART_FLAGS_IGNORE_BOOT_IMAGE_EXTENSION_CLASS_RESOLUTION false
#endif
#ifndef COM_ANDROID_ART_FLAGS_REG_ALLOC_SPILL_SLOT_REUSE
#define COM_ANDROID_ART_FLAGS_REG_ALLOC_SPILL_SLOT_REUSE true
#endif
#ifndef COM_ANDROID_ART_FLAGS_TEST
#define COM_ANDROID_ART_FLAGS_TEST true
#endif
#ifndef COM_ANDROID_ART_FLAGS_UPDATABLE_FILTER_AND_REASON
#define COM_ANDROID_ART_FLAGS_UPDATABLE_FILTER_AND_REASON true
#endif
#ifndef COM_ANDROID_ART_FLAGS_USE_GENERATIONAL_CMC
#define COM_ANDROID_ART_FLAGS_USE_GENERATIONAL_CMC true
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
    virtual bool dexopt_secondary_isa_only_when_needed() = 0;
    virtual bool enforce_permitted_subclasses_checks() = 0;
    virtual bool executable_method_file_offsets() = 0;
    virtual bool executable_method_file_offsets_deprecation() = 0;
    virtual bool executable_method_file_offsets_v2() = 0;
    virtual bool fast_baseline_compiler() = 0;
    virtual bool ignore_boot_image_extension_class_resolution() = 0;
    virtual bool reg_alloc_spill_slot_reuse() = 0;
    virtual bool test() = 0;
    virtual bool updatable_filter_and_reason() = 0;
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
constexpr inline bool dexopt_secondary_isa_only_when_needed() {
    return COM_ANDROID_ART_FLAGS_DEXOPT_SECONDARY_ISA_ONLY_WHEN_NEEDED;
}
constexpr inline bool enforce_permitted_subclasses_checks() {
    return COM_ANDROID_ART_FLAGS_ENFORCE_PERMITTED_SUBCLASSES_CHECKS;
}
constexpr inline bool executable_method_file_offsets() {
    return COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS;
}
constexpr inline bool executable_method_file_offsets_deprecation() {
    return COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_DEPRECATION;
}
constexpr inline bool executable_method_file_offsets_v2() {
    return COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_V2;
}
constexpr inline bool fast_baseline_compiler() {
    return COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER;
}
constexpr inline bool ignore_boot_image_extension_class_resolution() {
    return COM_ANDROID_ART_FLAGS_IGNORE_BOOT_IMAGE_EXTENSION_CLASS_RESOLUTION;
}
constexpr inline bool reg_alloc_spill_slot_reuse() {
    return COM_ANDROID_ART_FLAGS_REG_ALLOC_SPILL_SLOT_REUSE;
}
constexpr inline bool test() {
    return COM_ANDROID_ART_FLAGS_TEST;
}
constexpr inline bool updatable_filter_and_reason() {
    return COM_ANDROID_ART_FLAGS_UPDATABLE_FILTER_AND_REASON;
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
bool com_android_art_flags_dexopt_secondary_isa_only_when_needed();
bool com_android_art_flags_enforce_permitted_subclasses_checks();
bool com_android_art_flags_executable_method_file_offsets();
bool com_android_art_flags_executable_method_file_offsets_deprecation();
bool com_android_art_flags_executable_method_file_offsets_v2();
bool com_android_art_flags_fast_baseline_compiler();
bool com_android_art_flags_ignore_boot_image_extension_class_resolution();
bool com_android_art_flags_reg_alloc_spill_slot_reuse();
bool com_android_art_flags_test();
bool com_android_art_flags_updatable_filter_and_reason();
bool com_android_art_flags_use_generational_cmc();
bool com_android_art_flags_virtual_thread_impl_v1();

#ifdef __cplusplus
} // extern "C"
#endif

