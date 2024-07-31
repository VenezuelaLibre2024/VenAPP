.class public final synthetic Lq8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/p;


# instance fields
.field public final synthetic a:Lq8/m;


# direct methods
.method public synthetic constructor <init>(Lq8/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq8/l;->a:Lq8/m;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lq8/l;->a:Lq8/m;

    check-cast p1, Lt6/u1;

    invoke-static {v0, p1}, Lq8/m;->n(Lq8/m;Lt6/u1;)Z

    move-result p1

    return p1
.end method
