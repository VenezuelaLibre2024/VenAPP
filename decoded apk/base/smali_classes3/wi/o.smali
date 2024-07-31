.class Lwi/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/o2;


# instance fields
.field private final a:Ldm/b;

.field private b:I

.field private c:I


# direct methods
.method constructor <init>(Ldm/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwi/o;->a:Ldm/b;

    iput p2, p0, Lwi/o;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lwi/o;->b:I

    return v0
.end method

.method public b(B)V
    .locals 1

    iget-object v0, p0, Lwi/o;->a:Ldm/b;

    invoke-virtual {v0, p1}, Ldm/b;->I0(I)Ldm/b;

    iget p1, p0, Lwi/o;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lwi/o;->b:I

    iget p1, p0, Lwi/o;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lwi/o;->c:I

    return-void
.end method

.method c()Ldm/b;
    .locals 1

    iget-object v0, p0, Lwi/o;->a:Ldm/b;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lwi/o;->c:I

    return v0
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public write([BII)V
    .locals 1

    iget-object v0, p0, Lwi/o;->a:Ldm/b;

    invoke-virtual {v0, p1, p2, p3}, Ldm/b;->F0([BII)Ldm/b;

    iget p1, p0, Lwi/o;->b:I

    sub-int/2addr p1, p3

    iput p1, p0, Lwi/o;->b:I

    iget p1, p0, Lwi/o;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lwi/o;->c:I

    return-void
.end method
