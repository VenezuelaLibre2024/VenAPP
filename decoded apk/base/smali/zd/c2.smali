.class public final synthetic Lzd/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# instance fields
.field public final synthetic a:Lzd/i2;


# direct methods
.method public synthetic constructor <init>(Lzd/i2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/c2;->a:Lzd/i2;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/c2;->a:Lzd/i2;

    check-cast p1, Lpf/e;

    invoke-static {v0, p1}, Lzd/i2;->l(Lzd/i2;Lpf/e;)V

    return-void
.end method
