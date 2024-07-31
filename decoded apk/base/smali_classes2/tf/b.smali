.class public abstract Ltf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/util/Map;

.field public static final f:Ljava/util/Map;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Luf/a;

.field private final c:Lcom/google/mlkit/common/sdkinternal/l;

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Luf/a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v0, Ltf/b;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/EnumMap;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v0, Ltf/b;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltf/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ltf/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ltf/b;->f:Ljava/util/Map;

    iget-object v1, p0, Ltf/b;->b:Luf/a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/mlkit/common/sdkinternal/l;
    .locals 1

    iget-object v0, p0, Ltf/b;->c:Lcom/google/mlkit/common/sdkinternal/l;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ltf/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ltf/b;->f:Ljava/util/Map;

    iget-object v1, p0, Ltf/b;->b:Luf/a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "COM.GOOGLE.BASE_"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltf/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltf/b;

    iget-object v1, p0, Ltf/b;->a:Ljava/lang/String;

    iget-object v3, p1, Ltf/b;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ltf/b;->b:Luf/a;

    iget-object v3, p1, Ltf/b;->b:Luf/a;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ltf/b;->c:Lcom/google/mlkit/common/sdkinternal/l;

    iget-object p1, p1, Ltf/b;->c:Lcom/google/mlkit/common/sdkinternal/l;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Ltf/b;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ltf/b;->b:Luf/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ltf/b;->c:Lcom/google/mlkit/common/sdkinternal/l;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, "RemoteModel"

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzaa;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzz;

    move-result-object v0

    const-string v1, "modelName"

    iget-object v2, p0, Ltf/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzz;->zza(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzz;

    const-string v1, "baseModel"

    iget-object v2, p0, Ltf/b;->b:Luf/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzz;->zza(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzz;

    const-string v1, "modelType"

    iget-object v2, p0, Ltf/b;->c:Lcom/google/mlkit/common/sdkinternal/l;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzz;->zza(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzz;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
