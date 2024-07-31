.class public final synthetic Lv6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv6/u$a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lv6/u$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/t;->a:Lv6/u$a;

    iput p2, p0, Lv6/t;->b:I

    iput-wide p3, p0, Lv6/t;->c:J

    iput-wide p5, p0, Lv6/t;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lv6/t;->a:Lv6/u$a;

    iget v1, p0, Lv6/t;->b:I

    iget-wide v2, p0, Lv6/t;->c:J

    iget-wide v4, p0, Lv6/t;->d:J

    invoke-static/range {v0 .. v5}, Lv6/u$a;->i(Lv6/u$a;IJJ)V

    return-void
.end method
