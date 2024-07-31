.class public final synthetic Lzd/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# instance fields
.field public final synthetic a:Lzd/i2;

.field public final synthetic b:Lpf/b;


# direct methods
.method public synthetic constructor <init>(Lzd/i2;Lpf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/o1;->a:Lzd/i2;

    iput-object p2, p0, Lzd/o1;->b:Lpf/b;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzd/o1;->a:Lzd/i2;

    iget-object v1, p0, Lzd/o1;->b:Lpf/b;

    check-cast p1, Lzd/k2;

    invoke-static {v0, v1, p1}, Lzd/i2;->s(Lzd/i2;Lpf/b;Lzd/k2;)Lpf/e;

    move-result-object p1

    return-object p1
.end method
