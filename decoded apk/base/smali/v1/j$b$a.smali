.class public Lv1/j$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/j$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Lv1/j$a;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/j$b$a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Z)Lv1/j$b$a;
    .locals 0

    iput-boolean p1, p0, Lv1/j$b$a;->e:Z

    return-object p0
.end method

.method public b()Lv1/j$b;
    .locals 7

    iget-object v3, p0, Lv1/j$b$a;->c:Lv1/j$a;

    if-eqz v3, :cond_5

    iget-boolean v0, p0, Lv1/j$b$a;->d:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-object v0, p0, Lv1/j$b$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    new-instance v6, Lv1/j$b;

    iget-object v1, p0, Lv1/j$b$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lv1/j$b$a;->b:Ljava/lang/String;

    iget-boolean v4, p0, Lv1/j$b$a;->d:Z

    iget-boolean v5, p0, Lv1/j$b$a;->e:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lv1/j$b;-><init>(Landroid/content/Context;Ljava/lang/String;Lv1/j$a;ZZ)V

    return-object v6

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must set a non-null database name to a configuration that uses the no backup directory."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must set a callback to create the configuration."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Lv1/j$a;)Lv1/j$b$a;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lv1/j$b$a;->c:Lv1/j$a;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lv1/j$b$a;
    .locals 0

    iput-object p1, p0, Lv1/j$b$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public e(Z)Lv1/j$b$a;
    .locals 0

    iput-boolean p1, p0, Lv1/j$b$a;->d:Z

    return-object p0
.end method
