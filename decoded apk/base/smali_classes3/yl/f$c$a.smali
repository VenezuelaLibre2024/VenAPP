.class public final Lyl/f$c$a;
.super Lyl/f$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/f$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lyl/f$c;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lyl/i;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyl/b;->REFUSED_STREAM:Lyl/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lyl/i;->d(Lyl/b;Ljava/io/IOException;)V

    return-void
.end method
