.class public final synthetic Lv6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv6/u$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv6/u$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/k;->a:Lv6/u$a;

    iput-object p2, p0, Lv6/k;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv6/k;->a:Lv6/u$a;

    iget-object v1, p0, Lv6/k;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lv6/u$a;->g(Lv6/u$a;Ljava/lang/String;)V

    return-void
.end method
