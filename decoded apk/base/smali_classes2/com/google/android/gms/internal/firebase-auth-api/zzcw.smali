.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzcw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Ljava/lang/String;

.field public static final zzb:Ljava/lang/String;

.field private static final zzc:Ljava/lang/String;

.field private static final zzd:Ljava/lang/String;

.field private static final zze:Ljava/lang/String;

.field private static final zzf:Ljava/lang/String;

.field private static final zzg:Ljava/lang/String;

.field private static final zzh:Ljava/lang/String;

.field private static final zzi:Lcom/google/android/gms/internal/firebase-auth-api/zzvt;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zzj:Lcom/google/android/gms/internal/firebase-auth-api/zzvt;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zzk:Lcom/google/android/gms/internal/firebase-auth-api/zzvt;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdi;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;->zze()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zza:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;->zze()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzb:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzfg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzfg;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;->zze()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzc:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdz;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;->zze()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzd:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzgc;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;->zze()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zze:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;->zze()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzf:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzfu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzfu;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;->zze()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzg:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzhj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzhj;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;->zze()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzh:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvt;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzi:Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzj:Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zzk:Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzcw;->zza()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static zza()V
    .locals 7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzda;->zzc()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqo;->zza()V

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdi;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zza(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzif;->zzb()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzdz;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzdz;-><init>()V

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzct;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznb;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzef;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "AES128_EAX"

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzhb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzed;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzed;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    const/16 v4, 0x10

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzed$zzb;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzed$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzed;

    move-result-object v3

    const-string v6, "AES128_EAX_RAW"

    invoke-interface {v2, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "AES256_EAX"

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzhb;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzed;

    invoke-interface {v2, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzed;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    const/16 v6, 0x20

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzed$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzed$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzed;

    move-result-object v3

    const-string v4, "AES256_EAX_RAW"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Ljava/util/Map;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzfg;->zza(Z)V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzfu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzfu;-><init>()V

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzct;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznb;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzfx;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzfv$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzfv$zza;

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzfv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzfv$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzfv;

    move-result-object v3

    const-string v4, "CHACHA20_POLY1305"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzfv$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzfv$zza;

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzfv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzfv$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzfv;

    move-result-object v3

    const-string v4, "CHACHA20_POLY1305_RAW"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Ljava/util/Map;)V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzgc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzgc;-><init>()V

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzct;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznb;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzgn;->zza()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzgg;-><init>()V

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzct;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznb;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzgu;->zza()V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzhj;->zza(Z)V

    return-void
.end method
