.class public final synthetic Lzd/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# instance fields
.field public final synthetic a:Lzd/m3;


# direct methods
.method public synthetic constructor <init>(Lzd/m3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/k3;->a:Lzd/m3;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzd/k3;->a:Lzd/m3;

    check-cast p1, Lzd/c3;

    invoke-static {v0, p1}, Lzd/m3;->g(Lzd/m3;Lzd/c3;)Ldj/d;

    move-result-object p1

    return-object p1
.end method
