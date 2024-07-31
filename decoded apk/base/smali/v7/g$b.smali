.class final Lv7/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lv7/a0;

.field public final b:Lv7/a0$c;

.field public final c:Lv7/g$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv7/g<",
            "TT;>.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv7/a0;Lv7/a0$c;Lv7/g$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/a0;",
            "Lv7/a0$c;",
            "Lv7/g<",
            "TT;>.a;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/g$b;->a:Lv7/a0;

    iput-object p2, p0, Lv7/g$b;->b:Lv7/a0$c;

    iput-object p3, p0, Lv7/g$b;->c:Lv7/g$a;

    return-void
.end method
