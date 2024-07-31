.class Lhh/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final a:Lio/flutter/plugin/common/MethodCall;

.field private final b:Lio/flutter/plugin/common/MethodChannel$Result;

.field final synthetic c:Lhh/e;


# direct methods
.method constructor <init>(Lhh/e;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Lhh/e$b;->c:Lhh/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    iput-object p3, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method

.method private a(Ljava/lang/Exception;)V
    .locals 3

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    iget-object p1, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Exception encountered"

    invoke-interface {p1, v2, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v1}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v1

    iget-object v2, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    iget-object v2, v2, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    const-string v3, "options"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    iput-object v2, v1, Lhh/a;->e:Ljava/util/Map;

    iget-object v1, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v1}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v1

    invoke-virtual {v1}, Lhh/a;->h()V

    iget-object v1, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v1}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v1

    invoke-virtual {v1}, Lhh/a;->i()Z

    move-result v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v2, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    iget-object v2, v2, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "readAll"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v7

    goto :goto_1

    :sswitch_1
    const-string v0, "containsKey"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v6

    goto :goto_1

    :sswitch_2
    const-string v3, "write"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :sswitch_3
    const-string v0, "read"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v8

    goto :goto_1

    :sswitch_4
    const-string v0, "deleteAll"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v4

    goto :goto_1

    :sswitch_5
    const-string v0, "delete"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v5

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    const/4 v2, 0x0

    if-eqz v0, :cond_7

    if-eq v0, v8, :cond_5

    if-eq v0, v7, :cond_4

    if-eq v0, v6, :cond_3

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_1

    iget-object v0, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v0}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto/16 :goto_5

    :cond_1
    iget-object v0, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v0}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v0

    invoke-virtual {v0}, Lhh/a;->f()V

    iget-object v0, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    :goto_2
    invoke-interface {v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v0, p0, Lhh/e$b;->c:Lhh/e;

    iget-object v3, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v0, v3}, Lhh/e;->b(Lhh/e;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v3}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v3

    invoke-virtual {v3, v0}, Lhh/a;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lhh/e$b;->c:Lhh/e;

    iget-object v2, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v0, v2}, Lhh/e;->b(Lhh/e;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v2}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lhh/a;->c(Ljava/lang/String;)Z

    move-result v0

    iget-object v2, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_3
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    iget-object v0, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v2, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v2}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v2

    invoke-virtual {v2}, Lhh/a;->o()Ljava/util/Map;

    move-result-object v2

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lhh/e$b;->c:Lhh/e;

    iget-object v3, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v0, v3}, Lhh/e;->b(Lhh/e;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v3}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v3

    invoke-virtual {v3, v0}, Lhh/a;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v2, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v2}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lhh/a;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lhh/e$b;->c:Lhh/e;

    iget-object v3, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v0, v3}, Lhh/e;->b(Lhh/e;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lhh/e$b;->c:Lhh/e;

    iget-object v4, p0, Lhh/e$b;->a:Lio/flutter/plugin/common/MethodCall;

    invoke-static {v3, v4}, Lhh/e;->c(Lhh/e;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    iget-object v4, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v4}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v4

    invoke-virtual {v4, v0, v3}, Lhh/a;->p(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    goto/16 :goto_2

    :cond_8
    iget-object v0, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v3, "null"

    invoke-interface {v0, v3, v2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v1

    move-object v9, v1

    move v1, v0

    move-object v0, v9

    :goto_4
    if-eqz v1, :cond_9

    :try_start_2
    iget-object v0, p0, Lhh/e$b;->c:Lhh/e;

    invoke-static {v0}, Lhh/e;->a(Lhh/e;)Lhh/a;

    move-result-object v0

    invoke-virtual {v0}, Lhh/a;->f()V

    iget-object v0, p0, Lhh/e$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v1, "Data has been reset"

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    :cond_9
    invoke-direct {p0, v0}, Lhh/e$b;->a(Ljava/lang/Exception;)V

    goto :goto_5

    :catch_3
    move-exception v0

    const-string v1, "Creating sharedPrefs"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f997a55 -> :sswitch_5
        -0x1561e80a -> :sswitch_4
        0x355996 -> :sswitch_3
        0x6c257df -> :sswitch_2
        0xc6607c0 -> :sswitch_1
        0x4065382b -> :sswitch_0
    .end sparse-switch
.end method
