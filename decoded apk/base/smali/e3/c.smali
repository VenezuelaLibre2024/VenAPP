.class public Le3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/s<",
        "Ljava/util/List<",
        "Lf2/s;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Le3/b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/gson/Gson;


# direct methods
.method public constructor <init>(Le3/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Le3/c;->b:Lcom/google/gson/Gson;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Le3/c;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Le3/c;->c(Ljava/util/List;)V

    return-void
.end method

.method b(Landroidx/work/b;)Ljava/lang/String;
    .locals 3

    const-string v0, "response"

    invoke-virtual {p1, v0}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "response_file"

    invoke-virtual {p1, v1}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, p1}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    const-string v0, ""

    :cond_1
    :goto_2
    return-object v0
.end method

.method public c(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf2/s;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le3/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/s;

    invoke-virtual {v1}, Lf2/s;->a()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Le3/c$b;->a:[I

    invoke-virtual {v1}, Lf2/s;->d()Lf2/s$a;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    const-string v5, "status"

    if-eq v3, v4, :cond_5

    const/4 v4, 0x2

    if-eq v3, v4, :cond_6

    const/4 v4, 0x3

    const/16 v6, 0x1f4

    const-string v7, "statusCode"

    if-eq v3, v4, :cond_4

    const/4 v4, 0x4

    if-eq v3, v4, :cond_3

    const/4 v4, 0x5

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lf2/s;->b()Landroidx/work/b;

    move-result-object v1

    sget v3, Ld3/s;->c:I

    invoke-virtual {v1, v5, v3}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v1, v7, v6}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v4

    new-instance v5, Le3/c$a;

    invoke-direct {v5, p0}, Le3/c$a;-><init>(Le3/c;)V

    invoke-virtual {v5}, Lcom/google/gson/reflect/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v5

    const-string v6, "headers"

    invoke-virtual {v1, v6}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v7, p0, Le3/c;->b:Lcom/google/gson/Gson;

    invoke-virtual {v7, v6, v5}, Lcom/google/gson/Gson;->i(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    move-object v6, v5

    invoke-virtual {p0, v1}, Le3/c;->b(Landroidx/work/b;)Ljava/lang/String;

    move-result-object v5

    move-object v1, v0

    invoke-interface/range {v1 .. v6}, Le3/b;->d(Ljava/lang/String;IILjava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_3
    sget v3, Ld3/s;->e:I

    const/16 v4, 0x1f4

    const-string v5, "flutter_upload_cancelled"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    invoke-interface/range {v1 .. v7}, Le3/b;->c(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lf2/s;->b()Landroidx/work/b;

    move-result-object v1

    sget v3, Ld3/s;->d:I

    invoke-virtual {v1, v5, v3}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v1, v7, v6}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v4

    const-string v5, "errorCode"

    invoke-virtual {v1, v5}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "errorMessage"

    invoke-virtual {v1, v6}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "errorDetails"

    invoke-virtual {v1, v7}, Landroidx/work/b;->m(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    move-object v1, v0

    invoke-interface/range {v1 .. v7}, Le3/b;->c(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v1}, Lf2/s;->a()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Le3/b;->b(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v1}, Lf2/s;->c()Landroidx/work/b;

    move-result-object v2

    invoke-virtual {v1}, Lf2/s;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, -0x1

    invoke-virtual {v2, v5, v3}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v4

    const-string v5, "progress"

    invoke-virtual {v2, v5, v3}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v2

    invoke-interface {v0, v1, v4, v2}, Le3/b;->e(Ljava/lang/String;II)V

    goto/16 :goto_0

    :cond_7
    return-void
.end method
