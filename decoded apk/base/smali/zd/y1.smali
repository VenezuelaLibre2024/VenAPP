.class public final synthetic Lzd/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# instance fields
.field public final synthetic a:Lof/c;


# direct methods
.method public synthetic constructor <init>(Lof/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/y1;->a:Lof/c;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzd/y1;->a:Lof/c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lzd/i2;->c(Lof/c;Ljava/lang/Boolean;)Lof/c;

    move-result-object p1

    return-object p1
.end method
