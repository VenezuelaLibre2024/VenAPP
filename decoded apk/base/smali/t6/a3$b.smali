.class final Lt6/a3$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/a3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field public final a:Lv7/a0;

.field public final b:Lv7/a0$c;

.field public final c:Lt6/a3$a;


# direct methods
.method public constructor <init>(Lv7/a0;Lv7/a0$c;Lt6/a3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/a3$b;->a:Lv7/a0;

    iput-object p2, p0, Lt6/a3$b;->b:Lv7/a0$c;

    iput-object p3, p0, Lt6/a3$b;->c:Lt6/a3$a;

    return-void
.end method
