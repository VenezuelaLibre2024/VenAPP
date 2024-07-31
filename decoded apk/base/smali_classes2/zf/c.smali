.class public final Lzf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/a;


# instance fields
.field private final a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    return-void
.end method

.method private static n(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;)Lxf/a$b;
    .locals 10

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v9, Lxf/a$b;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;->zzf()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;->zzd()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;->zza()I

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;->zzb()I

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;->zzc()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;->zze()I

    move-result v6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;->zzh()Z

    move-result v7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;->zzg()Ljava/lang/String;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lxf/a$b;-><init>(IIIIIIZLjava/lang/String;)V

    return-object v9
.end method


# virtual methods
.method public final a()Lxf/a$c;
    .locals 10

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuz;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v9, Lxf/a$c;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuz;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuz;->zzc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuz;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuz;->zze()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuz;->zzf()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuz;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;

    move-result-object v1

    invoke-static {v1}, Lzf/c;->n(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;)Lxf/a$b;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuz;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;

    move-result-object v0

    invoke-static {v0}, Lzf/c;->n(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuy;)Lxf/a$b;

    move-result-object v8

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lxf/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxf/a$b;Lxf/a$b;)V

    return-object v9

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lxf/a$i;
    .locals 3

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzh()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lxf/a$i;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;->zza()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lxf/a$i;-><init>(Ljava/lang/String;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Lxf/a$e;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zze()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v17, Lxf/a$e;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzf()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzh()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzn()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzi()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzc()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zza()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzb()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzd()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzm()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzj()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzg()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zze()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzk()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v2, v17

    invoke-direct/range {v2 .. v16}, Lxf/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v17

    :cond_0
    const/4 v1, 0x0

    return-object v1
.end method

.method public final e()Landroid/graphics/Rect;
    .locals 8

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzo()[Landroid/graphics/Point;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    const/high16 v2, -0x80000000

    const v3, 0x7fffffff

    move v4, v3

    move v5, v4

    move v3, v2

    :goto_0
    array-length v6, v0

    if-ge v1, v6, :cond_0

    aget-object v6, v0, v1

    iget v7, v6, Landroid/graphics/Point;->x:I

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget v7, v6, Landroid/graphics/Point;->x:I

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v7, v6, Landroid/graphics/Point;->y:I

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    iget v6, v6, Landroid/graphics/Point;->y:I

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v4, v5, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzb()I

    move-result v0

    return v0
.end method

.method public final getFormat()I
    .locals 1

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zza()I

    move-result v0

    return v0
.end method

.method public final getUrl()Lxf/a$k;
    .locals 3

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzj()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvh;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lxf/a$k;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvh;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvh;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lxf/a$k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Lxf/a$j;
    .locals 3

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzi()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvg;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lxf/a$j;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvg;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvg;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lxf/a$j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()Lxf/a$d;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    new-instance v11, Lxf/a$d;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lxf/a$h;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;->zzb()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;->zzf()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;->zze()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;->zza()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;->zzd()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;->zzc()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;->zzg()Ljava/lang/String;

    move-result-object v19

    move-object v12, v2

    invoke-direct/range {v12 .. v19}, Lxf/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move-object v4, v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzb()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzc()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzf()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;

    move-result-object v2

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move v8, v3

    :goto_1
    array-length v9, v2

    if-ge v8, v9, :cond_2

    aget-object v9, v2, v8

    if-eqz v9, :cond_1

    new-instance v10, Lxf/a$i;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;->zzb()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;->zza()I

    move-result v9

    invoke-direct {v10, v12, v9}, Lxf/a$i;-><init>(Ljava/lang/String;I)V

    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zze()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;

    move-result-object v2

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-eqz v2, :cond_4

    move v9, v3

    :goto_2
    array-length v10, v2

    if-ge v9, v10, :cond_4

    aget-object v10, v2, v9

    if-eqz v10, :cond_3

    new-instance v12, Lxf/a$f;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;->zza()I

    move-result v13

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;->zzb()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;->zzd()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;->zzc()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v12, v13, v14, v15, v10}, Lxf/a$f;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzg()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzg()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_3

    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    move-object v9, v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzd()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;

    move-result-object v1

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_7

    :goto_4
    array-length v2, v1

    if-ge v3, v2, :cond_7

    aget-object v2, v1, v3

    if-eqz v2, :cond_6

    new-instance v12, Lxf/a$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;->zza()I

    move-result v13

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;->zzb()[Ljava/lang/String;

    move-result-object v2

    invoke-direct {v12, v13, v2}, Lxf/a$a;-><init>(I[Ljava/lang/String;)V

    invoke-interface {v10, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_7
    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lxf/a$d;-><init>(Lxf/a$h;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v11

    :cond_8
    return-object v2
.end method

.method public final j()[B
    .locals 1

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzn()[B

    move-result-object v0

    return-object v0
.end method

.method public final k()[Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzo()[Landroid/graphics/Point;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lxf/a$g;
    .locals 6

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzg()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvd;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lxf/a$g;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvd;->zza()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvd;->zzb()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lxf/a$g;-><init>(DD)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final m()Lxf/a$l;
    .locals 4

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzk()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvi;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lxf/a$l;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvi;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvi;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvi;->zza()I

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lxf/a$l;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final r()Lxf/a$f;
    .locals 5

    iget-object v0, p0, Lzf/c;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;->zzf()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lxf/a$f;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;->zza()I

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lxf/a$f;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
