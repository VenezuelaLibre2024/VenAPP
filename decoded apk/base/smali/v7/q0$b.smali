.class public final Lv7/q0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/a0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ls8/j$a;

.field private b:Lv7/k0$a;

.field private c:Lx6/x;

.field private d:Ls8/d0;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ls8/j$a;)V
    .locals 1

    new-instance v0, Ly6/h;

    invoke-direct {v0}, Ly6/h;-><init>()V

    invoke-direct {p0, p1, v0}, Lv7/q0$b;-><init>(Ls8/j$a;Ly6/p;)V

    return-void
.end method

.method public constructor <init>(Ls8/j$a;Lv7/k0$a;)V
    .locals 6

    new-instance v3, Lx6/l;

    invoke-direct {v3}, Lx6/l;-><init>()V

    new-instance v4, Ls8/v;

    invoke-direct {v4}, Ls8/v;-><init>()V

    const/high16 v5, 0x100000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lv7/q0$b;-><init>(Ls8/j$a;Lv7/k0$a;Lx6/x;Ls8/d0;I)V

    return-void
.end method

.method public constructor <init>(Ls8/j$a;Lv7/k0$a;Lx6/x;Ls8/d0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/q0$b;->a:Ls8/j$a;

    iput-object p2, p0, Lv7/q0$b;->b:Lv7/k0$a;

    iput-object p3, p0, Lv7/q0$b;->c:Lx6/x;

    iput-object p4, p0, Lv7/q0$b;->d:Ls8/d0;

    iput p5, p0, Lv7/q0$b;->e:I

    return-void
.end method

.method public constructor <init>(Ls8/j$a;Ly6/p;)V
    .locals 1

    new-instance v0, Lv7/r0;

    invoke-direct {v0, p2}, Lv7/r0;-><init>(Ly6/p;)V

    invoke-direct {p0, p1, v0}, Lv7/q0$b;-><init>(Ls8/j$a;Lv7/k0$a;)V

    return-void
.end method

.method public static synthetic d(Ly6/p;Lu6/m3;)Lv7/k0;
    .locals 0

    invoke-static {p0, p1}, Lv7/q0$b;->f(Ly6/p;Lu6/m3;)Lv7/k0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f(Ly6/p;Lu6/m3;)Lv7/k0;
    .locals 0

    new-instance p1, Lv7/c;

    invoke-direct {p1, p0}, Lv7/c;-><init>(Ly6/p;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Lt6/c2;)Lv7/a0;
    .locals 0

    invoke-virtual {p0, p1}, Lv7/q0$b;->e(Lt6/c2;)Lv7/q0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lx6/x;)Lv7/a0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lv7/q0$b;->g(Lx6/x;)Lv7/q0$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ls8/d0;)Lv7/a0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lv7/q0$b;->h(Ls8/d0;)Lv7/q0$b;

    move-result-object p1

    return-object p1
.end method

.method public e(Lt6/c2;)Lv7/q0;
    .locals 8

    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    iget-object v1, v0, Lt6/c2$h;->h:Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lv7/q0$b;->g:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iget-object v0, v0, Lt6/c2$h;->e:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lv7/q0$b;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lt6/c2;->c()Lt6/c2$c;

    move-result-object p1

    iget-object v0, p0, Lv7/q0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lt6/c2$c;->f(Ljava/lang/Object;)Lt6/c2$c;

    move-result-object p1

    :goto_2
    iget-object v0, p0, Lv7/q0$b;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lt6/c2$c;->b(Ljava/lang/String;)Lt6/c2$c;

    move-result-object p1

    goto :goto_3

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lt6/c2;->c()Lt6/c2$c;

    move-result-object p1

    iget-object v0, p0, Lv7/q0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lt6/c2$c;->f(Ljava/lang/Object;)Lt6/c2$c;

    move-result-object p1

    :goto_3
    invoke-virtual {p1}, Lt6/c2$c;->a()Lt6/c2;

    move-result-object p1

    goto :goto_4

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lt6/c2;->c()Lt6/c2$c;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_4
    move-object v1, p1

    new-instance p1, Lv7/q0;

    iget-object v2, p0, Lv7/q0$b;->a:Ls8/j$a;

    iget-object v3, p0, Lv7/q0$b;->b:Lv7/k0$a;

    iget-object v0, p0, Lv7/q0$b;->c:Lx6/x;

    invoke-interface {v0, v1}, Lx6/x;->a(Lt6/c2;)Lx6/v;

    move-result-object v4

    iget-object v5, p0, Lv7/q0$b;->d:Ls8/d0;

    iget v6, p0, Lv7/q0$b;->e:I

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lv7/q0;-><init>(Lt6/c2;Ls8/j$a;Lv7/k0$a;Lx6/v;Ls8/d0;ILv7/q0$a;)V

    return-object p1
.end method

.method public g(Lx6/x;)Lv7/q0$b;
    .locals 1

    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    invoke-static {p1, v0}, Lt8/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/x;

    iput-object p1, p0, Lv7/q0$b;->c:Lx6/x;

    return-object p0
.end method

.method public h(Ls8/d0;)Lv7/q0$b;
    .locals 1

    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    invoke-static {p1, v0}, Lt8/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls8/d0;

    iput-object p1, p0, Lv7/q0$b;->d:Ls8/d0;

    return-object p0
.end method
