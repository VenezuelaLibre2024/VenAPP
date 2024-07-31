.class abstract Lwi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/c;


# instance fields
.field private final a:Lxi/c;


# direct methods
.method public constructor <init>(Lxi/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "delegate"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxi/c;

    iput-object p1, p0, Lwi/c;->a:Lxi/c;

    return-void
.end method


# virtual methods
.method public F(ILxi/a;[B)V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0, p1, p2, p3}, Lxi/c;->F(ILxi/a;[B)V

    return-void
.end method

.method public G()V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0}, Lxi/c;->G()V

    return-void
.end method

.method public P0(Lxi/i;)V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0, p1}, Lxi/c;->P0(Lxi/i;)V

    return-void
.end method

.method public X0(ZILdm/b;I)V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0, p1, p2, p3, p4}, Lxi/c;->X0(ZILdm/b;I)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public d(IJ)V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0, p1, p2, p3}, Lxi/c;->d(IJ)V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0}, Lxi/c;->flush()V

    return-void
.end method

.method public h(ZII)V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0, p1, p2, p3}, Lxi/c;->h(ZII)V

    return-void
.end method

.method public o1(Lxi/i;)V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0, p1}, Lxi/c;->o1(Lxi/i;)V

    return-void
.end method

.method public p0()I
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0}, Lxi/c;->p0()I

    move-result v0

    return v0
.end method

.method public r1(ZZIILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lxi/c;->r1(ZZIILjava/util/List;)V

    return-void
.end method

.method public s(ILxi/a;)V
    .locals 1

    iget-object v0, p0, Lwi/c;->a:Lxi/c;

    invoke-interface {v0, p1, p2}, Lxi/c;->s(ILxi/a;)V

    return-void
.end method
