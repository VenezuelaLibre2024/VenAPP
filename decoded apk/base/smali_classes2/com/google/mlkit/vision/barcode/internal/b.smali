.class public final Lcom/google/mlkit/vision/barcode/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/util/SparseArray;

.field private static final b:Landroid/util/SparseArray;

.field static final c:Ljava/util/concurrent/atomic/AtomicReference;

.field private static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/b;->a:Landroid/util/SparseArray;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    sput-object v1, Lcom/google/mlkit/vision/barcode/internal/b;->b:Landroid/util/SparseArray;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v2, Lcom/google/mlkit/vision/barcode/internal/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, -0x1

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/4 v4, 0x2

    invoke-virtual {v0, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/4 v5, 0x4

    invoke-virtual {v0, v5, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v6, 0x8

    invoke-virtual {v0, v6, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v7, 0x10

    invoke-virtual {v0, v7, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v8, 0x20

    invoke-virtual {v0, v8, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v9, 0x40

    invoke-virtual {v0, v9, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v10, 0x80

    invoke-virtual {v0, v10, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v11, 0x100

    invoke-virtual {v0, v11, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v12, 0x200

    invoke-virtual {v0, v12, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v13, 0x400

    invoke-virtual {v0, v13, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v14, 0x800

    invoke-virtual {v0, v14, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v15, 0x1000

    invoke-virtual {v0, v15, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x3

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v5, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x5

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x6

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x7

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v6, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v0, 0x9

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v0, 0xa

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v0, 0xb

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v0, 0xc

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/b;->d:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;
    .locals 1

    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/b;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    if-nez p0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    :cond_0
    return-object p0
.end method

.method public static b(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;
    .locals 1

    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/b;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    if-nez p0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpw;

    :cond_0
    return-object p0
.end method

.method public static c(Lvf/b;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;
    .locals 4

    invoke-virtual {p0}, Lvf/b;->a()I

    move-result p0

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;-><init>()V

    if-nez p0, :cond_0

    sget-object p0, Lcom/google/mlkit/vision/barcode/internal/b;->d:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zze(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/google/mlkit/vision/barcode/internal/b;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    and-int/2addr v3, p0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzd(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    goto :goto_0

    :cond_2
    :goto_1
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztf;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztf;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzf()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztf;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zztf;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztf;->zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    move-result-object p0

    return-object p0
.end method

.method public static d()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/b;->f()Z

    move-result v1

    if-eq v0, v1, :cond_0

    const-string v0, "play-services-mlkit-barcode-scanning"

    return-object v0

    :cond_0
    const-string v0, "barcode-scanning"

    return-object v0
.end method

.method static e(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;)V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/a;

    invoke-direct {v0, p1}, Lcom/google/mlkit/vision/barcode/internal/a;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;)V

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztw;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpk;)V

    return-void
.end method

.method static f()Z
    .locals 3

    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/i;->c()Lcom/google/mlkit/common/sdkinternal/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/i;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/mlkit/vision/barcode/internal/k;->b(Landroid/content/Context;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return v1
.end method
