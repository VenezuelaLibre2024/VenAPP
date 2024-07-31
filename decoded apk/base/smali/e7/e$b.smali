.class final Le7/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le7/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Le7/e;


# direct methods
.method private constructor <init>(Le7/e;)V
    .locals 0

    iput-object p1, p0, Le7/e$b;->a:Le7/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Le7/e;Le7/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Le7/e$b;-><init>(Le7/e;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Le7/e$b;->a:Le7/e;

    invoke-virtual {v0, p1}, Le7/e;->o(I)V

    return-void
.end method

.method public b(ID)V
    .locals 1

    iget-object v0, p0, Le7/e$b;->a:Le7/e;

    invoke-virtual {v0, p1, p2, p3}, Le7/e;->r(ID)V

    return-void
.end method

.method public c(IILy6/l;)V
    .locals 1

    iget-object v0, p0, Le7/e$b;->a:Le7/e;

    invoke-virtual {v0, p1, p2, p3}, Le7/e;->l(IILy6/l;)V

    return-void
.end method

.method public d(IJ)V
    .locals 1

    iget-object v0, p0, Le7/e$b;->a:Le7/e;

    invoke-virtual {v0, p1, p2, p3}, Le7/e;->x(IJ)V

    return-void
.end method

.method public e(I)I
    .locals 1

    iget-object v0, p0, Le7/e$b;->a:Le7/e;

    invoke-virtual {v0, p1}, Le7/e;->u(I)I

    move-result p1

    return p1
.end method

.method public f(I)Z
    .locals 1

    iget-object v0, p0, Le7/e$b;->a:Le7/e;

    invoke-virtual {v0, p1}, Le7/e;->z(I)Z

    move-result p1

    return p1
.end method

.method public g(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Le7/e$b;->a:Le7/e;

    invoke-virtual {v0, p1, p2}, Le7/e;->H(ILjava/lang/String;)V

    return-void
.end method

.method public h(IJJ)V
    .locals 6

    iget-object v0, p0, Le7/e$b;->a:Le7/e;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Le7/e;->G(IJJ)V

    return-void
.end method
