.class public interface abstract Lv6/h0$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "e"
.end annotation


# static fields
.field public static final a:Lv6/h0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv6/o0$a;

    invoke-direct {v0}, Lv6/o0$a;-><init>()V

    invoke-virtual {v0}, Lv6/o0$a;->g()Lv6/o0;

    move-result-object v0

    sput-object v0, Lv6/h0$e;->a:Lv6/h0$e;

    return-void
.end method


# virtual methods
.method public abstract a(IIIIIID)I
.end method
