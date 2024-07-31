.class public final Lzk/c3;
.super Lgk/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzk/c3$a;
    }
.end annotation


# static fields
.field public static final c:Lzk/c3$a;


# instance fields
.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzk/c3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzk/c3$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lzk/c3;->c:Lzk/c3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lzk/c3;->c:Lzk/c3$a;

    invoke-direct {p0, v0}, Lgk/a;-><init>(Lgk/f$c;)V

    return-void
.end method
