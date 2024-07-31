.class public final synthetic Lzd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/g;


# instance fields
.field public final synthetic a:Lzd/k;


# direct methods
.method public synthetic constructor <init>(Lzd/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/h;->a:Lzd/k;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lzd/h;->a:Lzd/k;

    check-cast p1, Lpf/e;

    invoke-static {v0, p1}, Lzd/k;->c(Lzd/k;Lpf/e;)Z

    move-result p1

    return p1
.end method
