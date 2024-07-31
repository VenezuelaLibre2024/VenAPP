.class public final Lx6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/n;


# instance fields
.field private final a:Lx6/n$a;


# direct methods
.method public constructor <init>(Lx6/n$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/n$a;

    iput-object p1, p0, Lx6/a0;->a:Lx6/n$a;

    return-void
.end method


# virtual methods
.method public a()Lx6/n$a;
    .locals 1

    iget-object v0, p0, Lx6/a0;->a:Lx6/n$a;

    return-object v0
.end method

.method public final c()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lt6/p;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public d(Lx6/u$a;)V
    .locals 0

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Lw6/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Lx6/u$a;)V
    .locals 0

    return-void
.end method

.method public getState()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public i(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
