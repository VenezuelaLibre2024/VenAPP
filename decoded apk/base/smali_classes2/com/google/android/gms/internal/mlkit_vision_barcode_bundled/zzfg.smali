.class final Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgi;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfe;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfg;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzff;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdw;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdw;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getInstance"

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfg;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzff;-><init>([Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzem;->zzd:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfg;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;

    return-void
.end method

.method private static zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfl;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfl;->zzc()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgh;
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgj;->zzD(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfg;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfm;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfl;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfl;->zzb()Z

    move-result v0

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzed;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgj;->zzz()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgy;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdr;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdp;

    move-result-object v0

    :goto_0
    invoke-interface {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfl;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfo;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfs;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgy;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdp;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfo;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfs;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgj;->zzy()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgy;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdr;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdp;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfg;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfl;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfv;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfu;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfc;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfc;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgj;->zzz()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgy;

    move-result-object v5

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdr;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdp;

    move-result-object v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfk;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfj;

    move-result-object v7

    goto :goto_3

    :cond_3
    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfg;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfl;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfv;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfu;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfc;->zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfc;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgj;->zzy()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgy;

    move-result-object v5

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdr;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdp;

    move-result-object v6

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfk;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfj;

    move-result-object v7

    :goto_3
    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfr;->zzl(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfl;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfu;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfc;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgy;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzdp;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfj;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzfr;

    move-result-object p1

    return-object p1
.end method