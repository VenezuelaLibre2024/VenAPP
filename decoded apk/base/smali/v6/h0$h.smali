.class public Lv6/h0$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv6/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field private final a:[Lv6/i;

.field private final b:Lv6/v0;

.field private final c:Lv6/x0;


# direct methods
.method public varargs constructor <init>([Lv6/i;)V
    .locals 2

    new-instance v0, Lv6/v0;

    invoke-direct {v0}, Lv6/v0;-><init>()V

    new-instance v1, Lv6/x0;

    invoke-direct {v1}, Lv6/x0;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lv6/h0$h;-><init>([Lv6/i;Lv6/v0;Lv6/x0;)V

    return-void
.end method

.method public constructor <init>([Lv6/i;Lv6/v0;Lv6/x0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lv6/i;

    iput-object v0, p0, Lv6/h0$h;->a:[Lv6/i;

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p2, p0, Lv6/h0$h;->b:Lv6/v0;

    iput-object p3, p0, Lv6/h0$h;->c:Lv6/x0;

    array-length v1, p1

    aput-object p2, v0, v1

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 1

    iget-object v0, p0, Lv6/h0$h;->c:Lv6/x0;

    invoke-virtual {v0, p1, p2}, Lv6/x0;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public b()[Lv6/i;
    .locals 1

    iget-object v0, p0, Lv6/h0$h;->a:[Lv6/i;

    return-object v0
.end method

.method public c(Lt6/i3;)Lt6/i3;
    .locals 2

    iget-object v0, p0, Lv6/h0$h;->c:Lv6/x0;

    iget v1, p1, Lt6/i3;->a:F

    invoke-virtual {v0, v1}, Lv6/x0;->i(F)V

    iget-object v0, p0, Lv6/h0$h;->c:Lv6/x0;

    iget v1, p1, Lt6/i3;->b:F

    invoke-virtual {v0, v1}, Lv6/x0;->h(F)V

    return-object p1
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lv6/h0$h;->b:Lv6/v0;

    invoke-virtual {v0}, Lv6/v0;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public e(Z)Z
    .locals 1

    iget-object v0, p0, Lv6/h0$h;->b:Lv6/v0;

    invoke-virtual {v0, p1}, Lv6/v0;->v(Z)V

    return p1
.end method
