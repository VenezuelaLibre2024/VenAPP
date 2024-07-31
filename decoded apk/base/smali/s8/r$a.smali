.class public final Ls8/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls8/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ls8/j$a;

.field private c:Ls8/m0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Ls8/s$b;

    invoke-direct {v0}, Ls8/s$b;-><init>()V

    invoke-direct {p0, p1, v0}, Ls8/r$a;-><init>(Landroid/content/Context;Ls8/j$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ls8/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ls8/r$a;->a:Landroid/content/Context;

    iput-object p2, p0, Ls8/r$a;->b:Ls8/j$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ls8/j;
    .locals 1

    invoke-virtual {p0}, Ls8/r$a;->b()Ls8/r;

    move-result-object v0

    return-object v0
.end method

.method public b()Ls8/r;
    .locals 3

    new-instance v0, Ls8/r;

    iget-object v1, p0, Ls8/r$a;->a:Landroid/content/Context;

    iget-object v2, p0, Ls8/r$a;->b:Ls8/j$a;

    invoke-interface {v2}, Ls8/j$a;->a()Ls8/j;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ls8/r;-><init>(Landroid/content/Context;Ls8/j;)V

    iget-object v1, p0, Ls8/r$a;->c:Ls8/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ls8/r;->l(Ls8/m0;)V

    :cond_0
    return-object v0
.end method
