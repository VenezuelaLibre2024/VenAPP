.class public Lzd/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lpf/g$b;


# direct methods
.method constructor <init>(Lpf/g$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/l0;->a:Lpf/g$b;

    return-void
.end method


# virtual methods
.method public a(Lpf/d;)Lpf/e;
    .locals 4

    iget-object v0, p0, Lzd/l0;->a:Lpf/g$b;

    const-wide/16 v1, 0x7530

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Laj/b;->d(JLjava/util/concurrent/TimeUnit;)Laj/b;

    move-result-object v0

    check-cast v0, Lpf/g$b;

    invoke-virtual {v0, p1}, Lpf/g$b;->h(Lpf/d;)Lpf/e;

    move-result-object p1

    return-object p1
.end method
