.class public final synthetic Lzd/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# instance fields
.field public final synthetic a:Lzd/w0;

.field public final synthetic b:Lpf/a;


# direct methods
.method public synthetic constructor <init>(Lzd/w0;Lpf/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/p0;->a:Lzd/w0;

    iput-object p2, p0, Lzd/p0;->b:Lpf/a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzd/p0;->a:Lzd/w0;

    iget-object v1, p0, Lzd/p0;->b:Lpf/a;

    check-cast p1, Lpf/b;

    invoke-static {v0, v1, p1}, Lzd/w0;->a(Lzd/w0;Lpf/a;Lpf/b;)Ldj/d;

    move-result-object p1

    return-object p1
.end method
