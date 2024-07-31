.class Lwi/a$d;
.super Lwi/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lwi/a;


# direct methods
.method public constructor <init>(Lwi/a;Lxi/c;)V
    .locals 0

    iput-object p1, p0, Lwi/a$d;->b:Lwi/a;

    invoke-direct {p0, p2}, Lwi/c;-><init>(Lxi/c;)V

    return-void
.end method


# virtual methods
.method public h(ZII)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lwi/a$d;->b:Lwi/a;

    invoke-static {v0}, Lwi/a;->o(Lwi/a;)I

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lwi/c;->h(ZII)V

    return-void
.end method

.method public o1(Lxi/i;)V
    .locals 1

    iget-object v0, p0, Lwi/a$d;->b:Lwi/a;

    invoke-static {v0}, Lwi/a;->o(Lwi/a;)I

    invoke-super {p0, p1}, Lwi/c;->o1(Lxi/i;)V

    return-void
.end method

.method public s(ILxi/a;)V
    .locals 1

    iget-object v0, p0, Lwi/a$d;->b:Lwi/a;

    invoke-static {v0}, Lwi/a;->o(Lwi/a;)I

    invoke-super {p0, p1, p2}, Lwi/c;->s(ILxi/a;)V

    return-void
.end method
