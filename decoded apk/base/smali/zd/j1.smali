.class public final synthetic Lzd/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# instance fields
.field public final synthetic a:Lzd/i2;


# direct methods
.method public synthetic constructor <init>(Lzd/i2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/j1;->a:Lzd/i2;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzd/j1;->a:Lzd/i2;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lzd/i2;->o(Lzd/i2;Ljava/lang/String;)Lim/a;

    move-result-object p1

    return-object p1
.end method
