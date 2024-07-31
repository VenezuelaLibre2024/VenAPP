.class public final synthetic Lzd/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/a;


# instance fields
.field public final synthetic a:Lzd/k;

.field public final synthetic b:Lpf/e;


# direct methods
.method public synthetic constructor <init>(Lzd/k;Lpf/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/j;->a:Lzd/k;

    iput-object p2, p0, Lzd/j;->b:Lpf/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/j;->a:Lzd/k;

    iget-object v1, p0, Lzd/j;->b:Lpf/e;

    invoke-static {v0, v1}, Lzd/k;->d(Lzd/k;Lpf/e;)V

    return-void
.end method
