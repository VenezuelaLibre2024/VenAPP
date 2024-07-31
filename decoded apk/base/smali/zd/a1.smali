.class public final synthetic Lzd/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# instance fields
.field public final synthetic a:Lzd/i2;

.field public final synthetic b:Ldj/j;


# direct methods
.method public synthetic constructor <init>(Lzd/i2;Ldj/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/a1;->a:Lzd/i2;

    iput-object p2, p0, Lzd/a1;->b:Ldj/j;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzd/a1;->a:Lzd/i2;

    iget-object v1, p0, Lzd/a1;->b:Ldj/j;

    check-cast p1, Lpf/b;

    invoke-static {v0, v1, p1}, Lzd/i2;->n(Lzd/i2;Ldj/j;Lpf/b;)Ldj/j;

    move-result-object p1

    return-object p1
.end method
