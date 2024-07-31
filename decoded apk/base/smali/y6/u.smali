.class public Ly6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/l;


# instance fields
.field private final a:Ly6/l;


# direct methods
.method public constructor <init>(Ly6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/u;->a:Ly6/l;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1}, Ly6/l;->a(I)I

    move-result p1

    return p1
.end method

.method public d([BIIZ)Z
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1, p2, p3, p4}, Ly6/l;->d([BIIZ)Z

    move-result p1

    return p1
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0}, Ly6/l;->f()V

    return-void
.end method

.method public g([BIIZ)Z
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1, p2, p3, p4}, Ly6/l;->g([BIIZ)Z

    move-result p1

    return p1
.end method

.method public getLength()J
    .locals 2

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0}, Ly6/l;->getLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public getPosition()J
    .locals 2

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0}, Ly6/l;->getPosition()J

    move-result-wide v0

    return-wide v0
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0}, Ly6/l;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public k(I)V
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1}, Ly6/l;->k(I)V

    return-void
.end method

.method public m([BII)I
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1, p2, p3}, Ly6/l;->m([BII)I

    move-result p1

    return p1
.end method

.method public n(I)V
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1}, Ly6/l;->n(I)V

    return-void
.end method

.method public p(IZ)Z
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1, p2}, Ly6/l;->p(IZ)Z

    move-result p1

    return p1
.end method

.method public q([BII)V
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1, p2, p3}, Ly6/l;->q([BII)V

    return-void
.end method

.method public read([BII)I
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1, p2, p3}, Ly6/l;->read([BII)I

    move-result p1

    return p1
.end method

.method public readFully([BII)V
    .locals 1

    iget-object v0, p0, Ly6/u;->a:Ly6/l;

    invoke-interface {v0, p1, p2, p3}, Ly6/l;->readFully([BII)V

    return-void
.end method
