.class public final synthetic Lv6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv6/u$a;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lv6/u$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/m;->a:Lv6/u$a;

    iput-wide p2, p0, Lv6/m;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv6/m;->a:Lv6/u$a;

    iget-wide v1, p0, Lv6/m;->b:J

    invoke-static {v0, v1, v2}, Lv6/u$a;->h(Lv6/u$a;J)V

    return-void
.end method
