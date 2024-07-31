.class public final Lvi/p0$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final e:Lvi/p0$e;


# instance fields
.field private final a:Lvi/p0$h;

.field private final b:Lvi/k$a;

.field private final c:Lvi/g1;

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lvi/p0$e;

    sget-object v1, Lvi/g1;->f:Lvi/g1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Lvi/p0$e;-><init>(Lvi/p0$h;Lvi/k$a;Lvi/g1;Z)V

    sput-object v0, Lvi/p0$e;->e:Lvi/p0$e;

    return-void
.end method

.method private constructor <init>(Lvi/p0$h;Lvi/k$a;Lvi/g1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvi/p0$e;->a:Lvi/p0$h;

    iput-object p2, p0, Lvi/p0$e;->b:Lvi/k$a;

    const-string p1, "status"

    invoke-static {p3, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/g1;

    iput-object p1, p0, Lvi/p0$e;->c:Lvi/g1;

    iput-boolean p4, p0, Lvi/p0$e;->d:Z

    return-void
.end method

.method public static e(Lvi/g1;)Lvi/p0$e;
    .locals 3

    invoke-virtual {p0}, Lvi/g1;->p()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "drop status shouldn\'t be OK"

    invoke-static {v0, v2}, Leb/o;->e(ZLjava/lang/Object;)V

    new-instance v0, Lvi/p0$e;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, p0, v1}, Lvi/p0$e;-><init>(Lvi/p0$h;Lvi/k$a;Lvi/g1;Z)V

    return-object v0
.end method

.method public static f(Lvi/g1;)Lvi/p0$e;
    .locals 3

    invoke-virtual {p0}, Lvi/g1;->p()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error status shouldn\'t be OK"

    invoke-static {v0, v1}, Leb/o;->e(ZLjava/lang/Object;)V

    new-instance v0, Lvi/p0$e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, p0, v1}, Lvi/p0$e;-><init>(Lvi/p0$h;Lvi/k$a;Lvi/g1;Z)V

    return-object v0
.end method

.method public static g()Lvi/p0$e;
    .locals 1

    sget-object v0, Lvi/p0$e;->e:Lvi/p0$e;

    return-object v0
.end method

.method public static h(Lvi/p0$h;)Lvi/p0$e;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lvi/p0$e;->i(Lvi/p0$h;Lvi/k$a;)Lvi/p0$e;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lvi/p0$h;Lvi/k$a;)Lvi/p0$e;
    .locals 3

    new-instance v0, Lvi/p0$e;

    const-string v1, "subchannel"

    invoke-static {p0, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvi/p0$h;

    sget-object v1, Lvi/g1;->f:Lvi/g1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Lvi/p0$e;-><init>(Lvi/p0$h;Lvi/k$a;Lvi/g1;Z)V

    return-object v0
.end method


# virtual methods
.method public a()Lvi/g1;
    .locals 1

    iget-object v0, p0, Lvi/p0$e;->c:Lvi/g1;

    return-object v0
.end method

.method public b()Lvi/k$a;
    .locals 1

    iget-object v0, p0, Lvi/p0$e;->b:Lvi/k$a;

    return-object v0
.end method

.method public c()Lvi/p0$h;
    .locals 1

    iget-object v0, p0, Lvi/p0$e;->a:Lvi/p0$h;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lvi/p0$e;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lvi/p0$e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lvi/p0$e;

    iget-object v0, p0, Lvi/p0$e;->a:Lvi/p0$h;

    iget-object v2, p1, Lvi/p0$e;->a:Lvi/p0$h;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvi/p0$e;->c:Lvi/g1;

    iget-object v2, p1, Lvi/p0$e;->c:Lvi/g1;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvi/p0$e;->b:Lvi/k$a;

    iget-object v2, p1, Lvi/p0$e;->b:Lvi/k$a;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lvi/p0$e;->d:Z

    iget-boolean p1, p1, Lvi/p0$e;->d:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lvi/p0$e;->a:Lvi/p0$h;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lvi/p0$e;->c:Lvi/g1;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lvi/p0$e;->b:Lvi/k$a;

    aput-object v2, v0, v1

    iget-boolean v1, p0, Lvi/p0$e;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "subchannel"

    iget-object v2, p0, Lvi/p0$e;->a:Lvi/p0$h;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "streamTracerFactory"

    iget-object v2, p0, Lvi/p0$e;->b:Lvi/k$a;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "status"

    iget-object v2, p0, Lvi/p0$e;->c:Lvi/g1;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "drop"

    iget-boolean v2, p0, Lvi/p0$e;->d:Z

    invoke-virtual {v0, v1, v2}, Leb/i$b;->e(Ljava/lang/String;Z)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
