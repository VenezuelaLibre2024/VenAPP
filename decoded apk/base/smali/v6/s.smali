.class public final synthetic Lv6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv6/u$a;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lv6/u$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/s;->a:Lv6/u$a;

    iput-boolean p2, p0, Lv6/s;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv6/s;->a:Lv6/u$a;

    iget-boolean v1, p0, Lv6/s;->b:Z

    invoke-static {v0, v1}, Lv6/u$a;->a(Lv6/u$a;Z)V

    return-void
.end method
