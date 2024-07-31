.class public final Lcom/google/android/gms/internal/auth-api-phone/zzac;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lca/d;

.field public static final zzb:Lca/d;

.field public static final zzc:Lca/d;

.field public static final zzd:Lca/d;

.field public static final zze:[Lca/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lca/d;

    const-string v1, "sms_code_autofill"

    const-wide/16 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zza:Lca/d;

    new-instance v1, Lca/d;

    const-string v4, "sms_code_browser"

    invoke-direct {v1, v4, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzb:Lca/d;

    new-instance v2, Lca/d;

    const-string v3, "sms_retrieve"

    const-wide/16 v4, 0x1

    invoke-direct {v2, v3, v4, v5}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzc:Lca/d;

    new-instance v3, Lca/d;

    const-string v4, "user_consent"

    const-wide/16 v5, 0x3

    invoke-direct {v3, v4, v5, v6}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzd:Lca/d;

    const/4 v4, 0x4

    new-array v4, v4, [Lca/d;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    sput-object v4, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zze:[Lca/d;

    return-void
.end method
