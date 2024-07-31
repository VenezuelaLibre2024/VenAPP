.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

.field private zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

.field private final zzc:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuj;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuj;

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzc:I

    return-void
.end method

.method public static zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;I)V

    return-object v0
.end method

.method public static zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;I)V

    return-object p1
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzc:I

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztm;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

    return-object p0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zzk()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpn;->zzg()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsl;->zzk()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbd;->zzc(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsl;->zzk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method

.method public final zze(IZ)[B
    .locals 2

    xor-int/lit8 p2, p1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

    const/4 v1, 0x1

    if-eq v1, p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;->zzf(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;->zze(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsj;->zzm()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsl;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zzj(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsl;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuj;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuj;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zzk()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpn;

    move-result-object p1

    new-instance p2, Lld/d;

    invoke-direct {p2}, Lld/d;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zznj;->zza:Lkd/a;

    invoke-virtual {p2, v0}, Lld/d;->i(Lkd/a;)Lld/d;

    move-result-object p2

    invoke-virtual {p2, v1}, Lld/d;->j(Z)Lld/d;

    move-result-object p2

    invoke-virtual {p2}, Lld/d;->h()Ljd/a;

    move-result-object p2

    invoke-interface {p2, p1}, Ljd/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "utf-8"

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzua;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpl;->zzk()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpn;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;

    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zznj;->zza:Lkd/a;

    invoke-interface {v0, p2}, Lkd/a;->configure(Lkd/b;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfl;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfl;->zza(Ljava/lang/Object;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Failed to covert logging to UTF-8 byte array"

    invoke-direct {p2, v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
