.class public final synthetic Lzd/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# instance fields
.field public final synthetic a:Lof/c;


# direct methods
.method public synthetic constructor <init>(Lof/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/w1;->a:Lof/c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/w1;->a:Lof/c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lzd/i2;->u(Lof/c;Ljava/lang/Boolean;)V

    return-void
.end method
