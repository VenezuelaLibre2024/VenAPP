.class final Lw1/d$d;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw1/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lv1/j$a;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/a<",
        "Lw1/d$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lw1/d;


# direct methods
.method constructor <init>(Lw1/d;)V
    .locals 0

    iput-object p1, p0, Lw1/d$d;->a:Lw1/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lw1/d$c;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->f(Lw1/d;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->g(Lw1/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/File;

    iget-object v3, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v3}, Lw1/d;->e(Lw1/d;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lv1/d;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    iget-object v4, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v4}, Lw1/d;->f(Lw1/d;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v3, Lw1/d$c;

    iget-object v4, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v4}, Lw1/d;->e(Lw1/d;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lw1/d$b;

    invoke-direct {v8, v2}, Lw1/d$b;-><init>(Lw1/c;)V

    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->b(Lw1/d;)Lv1/j$a;

    move-result-object v9

    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->a(Lw1/d;)Z

    move-result v10

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Lw1/d$c;-><init>(Landroid/content/Context;Ljava/lang/String;Lw1/d$b;Lv1/j$a;Z)V

    goto :goto_0

    :cond_0
    new-instance v3, Lw1/d$c;

    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->e(Lw1/d;)Landroid/content/Context;

    move-result-object v12

    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->f(Lw1/d;)Ljava/lang/String;

    move-result-object v13

    new-instance v14, Lw1/d$b;

    invoke-direct {v14, v2}, Lw1/d$b;-><init>(Lw1/c;)V

    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->b(Lw1/d;)Lv1/j$a;

    move-result-object v15

    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->a(Lw1/d;)Z

    move-result v16

    move-object v11, v3

    invoke-direct/range {v11 .. v16}, Lw1/d$c;-><init>(Landroid/content/Context;Ljava/lang/String;Lw1/d$b;Lv1/j$a;Z)V

    :goto_0
    iget-object v1, v0, Lw1/d$d;->a:Lw1/d;

    invoke-static {v1}, Lw1/d;->i(Lw1/d;)Z

    move-result v1

    invoke-static {v3, v1}, Lv1/b;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    return-object v3
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw1/d$d;->a()Lw1/d$c;

    move-result-object v0

    return-object v0
.end method
